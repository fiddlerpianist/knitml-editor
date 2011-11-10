package com.knitml.dsl.ui.editor;

import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
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
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Inject;
import com.knitml.core.common.Parameters;
import com.knitml.core.converter.DomainModelConverterLocator;
import com.knitml.core.model.Pattern;
import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.renderer.impl.basic.BasicTextRendererFactory;

/**
 * An example showing how to create a multi-page editor. This example has 3
 * pages:
 * <ul>
 * <li>page 0 contains a the KEL editor
 * <li>page 1 shows the XML equivalent (i.e. converted XML)
 * <li>page 2 shows the final rendered pattern (using workspace preferences)
 * </ul>
 */
public class KnittingElEditor extends MultiPageEditorPart implements
		IResourceChangeListener {

	protected final int PATTERN_PAGE = 1;

	/**
	 * Only overridden because the superclass made this method (and the
	 * container variable) private instead of protected. In our case, we want
	 * the tabs across the top, not the bottom. Remove this when JFace fixes
	 * this limitation.
	 * 
	 * @see com.knitml.dsl.ui.editor.kel.editors.MultiPageEditorPart#createContainer(org.eclipse.swt.widgets.Composite)
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
	@Inject
	private XtextEditor editor;
	@Inject
	private DomainModelConverterLocator<EObject> converterLocator;
	@Inject
	private IWorkspace workspace;
	@Inject
	private RenderingPreferencesService preferencesService;

	private PatternViewControlContainer patternViewContainer;
	// switch which indicates which control we are currently using
	private PatternControlType controlInUse;

	/**
	 * Creates a multi-page editor
	 */
	public KnittingElEditor() {
		workspace.addResourceChangeListener(this);
	}

	protected void createKelpPage() {
		try {
			int index = addPage(editor, getEditorInput());
			setPageText(index, "Code View");
			this.setPartName(editor.getTitle());
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor", null, e.getStatus());
		}
	}

	protected void createPatternPage() {
		int index = addPage(null);
		this.patternViewContainer = new PatternViewControlContainer(
				getContainer(), (XtextEditor) getEditor(0), preferencesService,
				converterLocator);
		setPageText(index, "Pattern View");
	}

	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createKelpPage();
		createPatternPage();
	}

	/**
	 * Initializes the pattern view's main control. It will reuse an existing
	 * control if it's of the correct type, otherwise it will destroy an
	 * existing control and create a new one.
	 */
	protected void initializePatternViewControl() {
		PatternControlType controlTypeToUse;
		String rendererFactoryName = preferencesService
				.getPreference(PreferenceKeys.RENDERER_FACTORY);

		if (rendererFactoryName
				.equals(BasicTextRendererFactory.class.getName())) {
			controlTypeToUse = PatternControlType.TEXT;
		} else {
			controlTypeToUse = PatternControlType.BROWSER;
		}

		// if the control type we are going to use isn't the one currently in
		// use
		if (controlTypeToUse != controlInUse) {
			patternViewContainer.disposeRenderingControls();
			Control control = patternViewContainer
					.createPatternViewControl(controlTypeToUse);
			setControl(PATTERN_PAGE, control);
			controlInUse = controlTypeToUse;
		}
	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		workspace.removeResourceChangeListener(this);
		this.patternViewContainer.dispose();
		editor.dispose();
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
		} else if (newPageIndex == PATTERN_PAGE) {
			Pattern pattern = convertKelp();

			initializePatternViewControl();
			patternViewContainer.renderPattern();
			// KnittingElPatternRendererJob renderPatternJob = new
			// KnittingElPatternRendererJob(
			// this.patternViewContainer);
			// renderPatternJob.setUser(true);
			// renderPatternJob.schedule();
		}
		super.pageChange(newPageIndex);
	}

	protected Pattern convertKelp() {
//		EObject emfDomainModel = ((XtextResource) editor.getResource())
//				.getParseResult().getRootASTElement();
		editor.

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

//	public void resourceChanged(final IResourceChangeEvent event) {
//	}

}
