package com.knitml.dsl.ui.editor;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.springframework.core.io.ResourceLoader;

import com.knitml.core.common.Parameters;
import com.knitml.core.converter.DomainModelConverterLocator;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.renderer.chart.symbol.NoSymbolFoundException;
import com.knitml.renderer.context.Options;
import com.knitml.renderer.service.RenderingService;
import com.knitml.renderer.util.Configuration;

public class PatternViewControlContainer {

	private Font renderedPatternFont;
	// only one of these will be used
	private StyledText renderedPattern;
	private Browser renderingBrowser;

	private Composite parentContainer;
	private XtextEditor editor;
	private RenderingPreferencesService preferencesService;
	private DomainModelConverterLocator<EObject> converterLocator;

	public PatternViewControlContainer(Composite parentContainer,
			XtextEditor editor, RenderingPreferencesService preferencesService,
			DomainModelConverterLocator<EObject> converterLocator) {
		this.parentContainer = parentContainer;
		this.editor = editor;
		this.preferencesService = preferencesService;
		this.converterLocator = converterLocator;
	}

	/**
	 * Creates the render controls necessary to render the pattern based on the
	 * type. Currently supports Text and HTML, falling back to Text if an HTML
	 * browser cannot be instantiated.
	 * 
	 * @param controlTypeToUse
	 * @param preferences
	 * @return
	 */
	protected Control createPatternViewControl(
			PatternControlType controlTypeToUse) {
		if (controlTypeToUse == PatternControlType.TEXT) {
			return createTextPatternViewControl();
		}
		try {
			// TODO could support Mozilla option at some point (when we
			// embed an XULRunner)
			renderingBrowser = new Browser(parentContainer, SWT.NONE);
			return renderingBrowser;
		} catch (SWTError err) {
			// create fallback text view controls
//			KelPlugin
//					.getDefault()
//					.getLog()
//					.log(new Status(
//							IStatus.WARNING,
//							KelPlugin.PLUGIN_ID,
//							"Could not find suitable web browser on system. Will default to rendering HTML in a text window",
//							err));
			return createTextPatternViewControl();
		}
	}

	/**
	 * Creates the controls necessary to render the pattern in a plain text
	 * viewer.
	 * 
	 * @param preferences
	 * @return
	 */
	private Control createTextPatternViewControl() {
		Composite composite = new Composite(parentContainer, SWT.NONE);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		renderedPattern = new StyledText(composite, SWT.H_SCROLL | SWT.V_SCROLL);
		renderedPattern.setEditable(false);
		FontData[] fontData = preferencesService.getFontData();
		renderedPatternFont = new Font(Display.getCurrent(), fontData);
		renderedPattern.setFont(renderedPatternFont);

		return composite;
	}

	public void renderPattern() {
		String pattern = doRenderPattern();
		writeContentToPatternPage(pattern);
	}

	protected String doRenderPattern() {
		XtextResource resource = (XtextResource)this.editor.getDocument().get
		EObject emfModel = resource.getParseResult().getRootASTElement();
		converterLocator.locateConverter(emfModel).convert(emfModel);

		Configuration configuration = preferencesService.retrieveConfiguration();
		Options options = configuration.getOptions();

		// modify the options to load pattern messages from the current
		// directory
		ResourceLoader workspaceResourceLoader = new WorkspaceContainerResourceLoader(
				resource.getParent());
		options.setPatternMessageResourceLoader(workspaceResourceLoader);

		Parameters parameters = new Parameters();
		parameters.setCheckSyntax(false);
		//parameters.setReader(new StringReader(convertedXml.getText()));
		parameters.setPattern(pattern);
		Writer renderedPatternWriter = new StringWriter();
		parameters.setWriter(renderedPatternWriter);

		RenderingService renderingService = KelPlugin.getDefault()
				.getRenderingService();

		try {
			renderingService.renderPattern(parameters, configuration
					.getRendererFactory(), options);
			return renderedPatternWriter.toString();
		} catch (Exception ex) {
			Throwable cause = ex;
			while (cause.getCause() != null) {
				cause = cause.getCause();
			}
			if (cause instanceof NoSymbolFoundException) {
				return "The system is unable to chart a symbol using this symbol set. Consider using a complete symbol set. You can change this value in your preferences.  "
						+ cause.getMessage();
			} else {
				StringWriter stringError = new StringWriter();
				PrintWriter pw = new PrintWriter(stringError);
				ex.printStackTrace(pw);
				return "Could not render pattern: exception is "
						+ stringError.toString();
			}
		}
	}

	protected void writeContentToPatternPage(String pattern) {
		if (renderingBrowser != null) {
			renderingBrowser.setText(pattern);
		} else {
			FontData[] fontData = preferencesService.getFontData();
			Font fontToUse = new Font(Display.getCurrent(), fontData);
			renderedPattern.setFont(fontToUse);
			renderedPattern.setText(pattern);
			if (renderedPatternFont != null) {
				renderedPatternFont.dispose();
			}
			renderedPatternFont = fontToUse;
		}
	}

	public void disposeRenderingControls() {
		if (renderingBrowser != null) {
			renderingBrowser.dispose();
			renderingBrowser = null;
		}
		if (renderedPattern != null) {
			renderedPattern.dispose();
			renderedPattern = null;
		}
		if (renderedPatternFont != null) {
			renderedPatternFont.dispose();
			renderedPatternFont = null;
		}
	}

	public void dispose() {
		this.disposeRenderingControls();
		// not managed by this object
		this.parentContainer = null;
		this.editor = null;
		this.preferencesService = null;
	}

}
