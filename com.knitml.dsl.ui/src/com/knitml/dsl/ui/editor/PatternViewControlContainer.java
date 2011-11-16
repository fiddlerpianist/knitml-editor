package com.knitml.dsl.ui.editor;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.eclipse.core.resources.IResource;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ResourceLoader;

import com.google.inject.Inject;
import com.knitml.core.common.Parameters;
import com.knitml.core.model.Pattern;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.renderer.chart.symbol.NoSymbolFoundException;
import com.knitml.renderer.common.RenderingException;
import com.knitml.renderer.context.Options;
import com.knitml.renderer.service.RenderingService;
import com.knitml.renderer.util.Configuration;

class PatternViewControlContainer {

	private static final Logger logger = LoggerFactory
			.getLogger(PatternViewControlContainer.class);

	@Inject
	private RenderingPreferencesService renderingPreferencesService;
	@Inject
	private RenderingService renderingService;
	// inputs for this controller
	private Composite parentContainer; // the multi-page editor
	private IResource source; // the resource which contains the DSL text (i.e.,
								// abstraction of a file)

	// objects involved in display
	private Font renderedPatternFont;
	private StyledText renderedPattern;
	private Browser renderingBrowser;

	PatternViewControlContainer(Composite parentContainer, IResource source) {
		this.parentContainer = parentContainer;
		this.source = source;
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
			renderingBrowser = new Browser(parentContainer, SWT.NONE);
			return renderingBrowser;
		} catch (SWTError err) {
			logger.warn("Could not find suitable web browser on system. Will default to rendering HTML in a text window");
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
		FontData[] fontData = renderingPreferencesService.getFontData();
		renderedPatternFont = new Font(Display.getCurrent(), fontData);
		renderedPattern.setFont(renderedPatternFont);
		return composite;
	}

	public void render(Pattern patternModel) {
		String pattern = doRenderPattern(patternModel);
		writeContentToPatternPage(pattern);
	}

	protected String doRenderPattern(Pattern patternModel) {
		Configuration configuration = renderingPreferencesService
				.retrieveConfiguration();
		Options options = configuration.getOptions();

		// modify the options to load pattern messages from the current
		// directory
		ResourceLoader workspaceResourceLoader = new WorkspaceContainerResourceLoader(
				source.getParent());
		options.setPatternMessageResourceLoader(workspaceResourceLoader);

		Parameters parameters = new Parameters();
		parameters.setCheckSyntax(false);
		parameters.setPattern(patternModel);
		Writer renderedPatternWriter = new StringWriter();
		parameters.setWriter(renderedPatternWriter);

		try {
			renderingService.renderPattern(parameters,
					configuration.getRendererFactory(), options);
			return renderedPatternWriter.toString();
		} catch (RenderingException ex) {
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
		} catch (Exception ex) {
			StringWriter stringError = new StringWriter();
			PrintWriter pw = new PrintWriter(stringError);
			ex.printStackTrace(pw);
			return "Could not render pattern: exception is "
					+ stringError.toString();
		}
	}

	protected void writeContentToPatternPage(String pattern) {
		if (renderingBrowser != null) {
			renderingBrowser.setText(pattern);
		} else {
			FontData[] fontData = renderingPreferencesService.getFontData();
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
		this.source = null;
		this.renderingPreferencesService = null;
		this.renderingService = null;
	}

}
