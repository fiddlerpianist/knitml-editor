package com.knitml.gpec.kel.editors;

import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.ide.IDE;
import org.osgi.service.prefs.Preferences;
import org.springframework.core.io.ResourceLoader;

import com.knitml.core.common.Parameters;
import com.knitml.el.GroovyKnitProgram;
import com.knitml.gpec.internal.kel.KelPlugin;
import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.renderer.chart.symbol.NoSymbolFoundException;
import com.knitml.renderer.context.Options;
import com.knitml.renderer.impl.basic.BasicTextRendererFactory;
import com.knitml.renderer.service.RenderingService;
import com.knitml.renderer.util.Configuration;
import com.knitml.validation.ValidationProgram;
import com.knitml.validation.context.KnittingContextFactory;
import com.knitml.validation.context.impl.DefaultKnittingContextFactory;
import com.knitml.validation.visitor.instruction.VisitorFactory;
import com.knitml.validation.visitor.instruction.impl.SpringVisitorFactory;

/**
 * An example showing how to create a multi-page editor. This example has 3
 * pages:
 * <ul>
 * <li>page 0 contains a the KEL editor
 * <li>page 1 shows the XML equivalent (i.e. converted XML)
 * <li>page 2 shows the XML once it's been processed through the KnitML
 * Validation Engine
 * <li>page 3 shows the final pattern (currently only using default preferences)
 * </ul>
 */
public class KnittingElEditor extends MultiPageEditorPart implements
		IResourceChangeListener {

	/**
	 * Only overridden because the superclass made this method (and the
	 * container variable) private instead of protected. In our case, we want
	 * the tabs across the top, not the bottom. Remove this when JFace fixes
	 * this limitation.
	 * 
	 * @see com.knitml.gpec.kel.editors.MultiPageEditorPart#createContainer(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected CTabFolder createContainer(Composite parent) {
		// use SWT.FLAT style so that an extra 1 pixel border is not reserved
		// inside the folder
		parent.setLayout(new FillLayout());
		final CTabFolder newContainer = new CTabFolder(parent, SWT.TOP
				| SWT.FLAT);
		newContainer.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				int newPageIndex = newContainer.indexOf((CTabItem) e.item);
				pageChange(newPageIndex);
			}
		});
		return newContainer;
	}

	/** The text editor used in page 0. */
	private TextEditor editor;
	private StyledText convertedXml;
	private StyledText validatedXml;

	// only one of these will be used
	private StyledText renderedPattern;
	private Browser renderingBrowser;

	private boolean converted = false;
	private boolean validated = false;
	private boolean rendered = false;

	/**
	 * Creates a multi-page editor example.
	 */
	public KnittingElEditor() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	protected void createPage0() {
		try {
			editor = new TextEditor();
			int index = addPage(editor, getEditorInput());
			setPageText(index, "Code View");
			this.setPartName(editor.getTitle());
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor", null, e.getStatus());
		}
	}

	protected void createPage1() {
		Composite composite = new Composite(getContainer(), SWT.NONE);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		convertedXml = new StyledText(composite, SWT.H_SCROLL | SWT.V_SCROLL);
		convertedXml.setEditable(false);

		int index = addPage(composite);
		setPageText(index, "Converted XML");
	}

	protected void createPage2() {
		Composite composite = new Composite(getContainer(), SWT.NONE);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		validatedXml = new StyledText(composite, SWT.H_SCROLL | SWT.V_SCROLL);
		validatedXml.setEditable(false);

		int index = addPage(composite);
		setPageText(index, "Validated XML");
	}

	protected void createPage3() {
		int index = addPage(null);
		setPageText(index, "Pattern View");
	}

	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createPage0();
		createPage1();
		createPage2();
		createPage3();
	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		editor.dispose();
		convertedXml.dispose();
		validatedXml.dispose();
		if (renderingBrowser != null) {
			renderingBrowser.dispose();
		}
		if (renderedPattern != null) {
			renderedPattern.dispose();
		}
		super.dispose();
	}

	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);
	}

	/**
	 * Saves the multi-page editor's document as another file. Also updates the
	 * text for page 0's tab, and updates this multi-page editor's input to
	 * correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}

	/*
	 * (non-Javadoc) Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}

	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
			throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException(
					"Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
	}

	/*
	 * (non-Javadoc) Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * Calculates the contents of page 2 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		if (newPageIndex == 0) {
			converted = false;
			validated = false;
			rendered = false;
		} else if (newPageIndex == 1) {
			if (!converted) {
				convertKel();
			}
		} else if (newPageIndex == 2) {
			if (!validated) {
				if (!converted) {
					convertKel();
					if (!converted) {
						super.pageChange(1);
						return;
					}
				}
				validateXml();
			}
		} else if (newPageIndex == 3) {
			if (!rendered) {
				if (!converted) {
					convertKel();
					if (!converted) {
						setActivePage(1);
						return;
					}
				}
				initializePatternView();
				renderPattern();
			}
		}
		super.pageChange(newPageIndex);
	}

	private void disposePatternViewControls() {
		Control control = getControl(3);
		if (control != null) {
			control.dispose();
		}
		if (renderingBrowser != null) {
			renderingBrowser.dispose();
			renderingBrowser = null;
		}
		if (renderedPattern != null) {
			renderedPattern.dispose();
			renderedPattern = null;
		}
	}
	
	private void initializePatternView() {
		
		disposePatternViewControls();
		Control control;

		RenderingPreferencesService preferencesService = KelPlugin.getDefault()
				.getRenderingPreferencesService();
		Preferences preferences = preferencesService.getCurrentPreferences();
		String textRendererFactoryName = BasicTextRendererFactory.class
				.getName();
		String rendererFactoryName = preferences.get(
				PreferenceKeys.RENDERER_FACTORY, textRendererFactoryName);
		if (rendererFactoryName.equals(textRendererFactoryName)) {
			Composite composite = new Composite(getContainer(), SWT.NONE);
			FillLayout layout = new FillLayout();
			composite.setLayout(layout);
			renderedPattern = new StyledText(composite, SWT.H_SCROLL
					| SWT.V_SCROLL);
			renderedPattern.setEditable(false);
			if (preferences.getBoolean(PreferenceKeys.CHART_GLOBALLY, false)) {
				renderedPattern.setFont(JFaceResources.getTextFont());
			}
			control = composite;
		} else {
			renderingBrowser = new Browser(getContainer(), SWT.NONE);
			control = renderingBrowser;
		}
		setControl(3, control);
	}

	protected boolean convertKel() {
		Reader editorReader = new StringReader(editor.getDocumentProvider()
				.getDocument(editor.getEditorInput()).get());
		GroovyKnitProgram converter = new GroovyKnitProgram();
		Parameters parameters = new Parameters();
		parameters.setCheckSyntax(false);
		parameters.setReader(editorReader);
		parameters.setWriter(null);
		try {
			convertedXml.setText(converter.convertToXml(parameters));
			converted = true;
		} catch (Exception ex) {
			StringWriter stringError = new StringWriter();
			PrintWriter pw = new PrintWriter(stringError);
			ex.printStackTrace(pw);
			convertedXml.setText("Could not convert text to XML: exception is "
					+ stringError.toString());
			converted = false;
		}
		return converted;
	}

	protected void validateXml() {
		KnittingContextFactory validationContextFactory = new DefaultKnittingContextFactory();
		VisitorFactory validationVisitorFactory = new SpringVisitorFactory();
		ValidationProgram validator = new ValidationProgram(
				validationContextFactory, validationVisitorFactory);

		Reader editorReader = new StringReader(convertedXml.getText());
		StringWriter validatedXmlWriter = new StringWriter();
		// TODO call 'knitml convert' on source
		Parameters parameters = new Parameters();
		parameters.setCheckSyntax(true);
		parameters.setReader(editorReader);
		parameters.setWriter(validatedXmlWriter);

		try {
			validator.validate(parameters);
			validatedXml.setText(validatedXmlWriter.toString());
			validated = true;
		} catch (Exception ex) {
			StringWriter stringError = new StringWriter();
			PrintWriter pw = new PrintWriter(stringError);
			ex.printStackTrace(pw);
			validatedXml.setText("Could not validate XML: exception is "
					+ stringError.toString());
			validated = false;
		}
	}

	protected void renderPattern() {

		IFile kelFile = ((IFileEditorInput) getEditorInput()).getFile();

		// get the preferences from the RenderingPreferencesService (stored
		// within Eclipse)
		RenderingPreferencesService service = KelPlugin.getDefault()
				.getRenderingPreferencesService();
		Configuration configuration = service.retrieveConfiguration();
		Options options = configuration.getOptions();

		// modify the options to load pattern messages from the current
		// directory
		ResourceLoader workspaceResourceLoader = new WorkspaceContainerResourceLoader(
				kelFile.getParent());
		options.setPatternMessageResourceLoader(workspaceResourceLoader);

		Parameters parameters = new Parameters();
		parameters.setCheckSyntax(false);
		parameters.setReader(new StringReader(convertedXml.getText()));
		Writer renderedPatternWriter = new StringWriter();
		parameters.setWriter(renderedPatternWriter);

		RenderingService renderingService = KelPlugin.getDefault()
				.getRenderingService();

		try {

			renderingService.renderPattern(parameters, configuration
					.getRendererFactory(), options);
			writeContentToPage3(renderedPatternWriter.toString());
			rendered = true;
		} catch (Exception ex) {
			Throwable cause = ex;
			while (cause.getCause() != null) {
				cause = cause.getCause();
			}
			if (cause instanceof NoSymbolFoundException) {
				writeContentToPage3("The system is unable to chart a symbol using this symbol set. Consider using a complete symbol set. You can change this value in your preferences.  "
						+ cause.getMessage());
			} else {
				StringWriter stringError = new StringWriter();
				PrintWriter pw = new PrintWriter(stringError);
				ex.printStackTrace(pw);
				writeContentToPage3("Could not render pattern: exception is "
						+ stringError.toString());
			}
			rendered = false;
		}
	}

	private void writeContentToPage3(String content) {
		if (renderingBrowser != null) {
			renderingBrowser.setText(content);
		} else {
			renderedPattern.setText(content);
		}
	}

	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event) {
		if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
			// Display.getDefault().asyncExec(new Runnable() {
			// public void run() {
			// IWorkbenchPage[] pages = getSite().getWorkbenchWindow()
			// .getPages();
			// for (int i = 0; i < pages.length; i++) {
			// if (((FileEditorInput) editor.getEditorInput())
			// .getFile().getProject().equals(
			// event.getResource())) {
			// IEditorPart editorPart = pages[i].findEditor(editor
			// .getEditorInput());
			// pages[i].closeEditor(editorPart, true);
			// }
			// }
			// }
			// });
		}
	}

}
