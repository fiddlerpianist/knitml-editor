package com.knitml.dsl.ui.editor;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.measure.Measurable;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.window.Window;
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

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import com.google.inject.util.Modules;
import com.knitml.core.model.operations.DiscreteInlineOperation;
import com.knitml.core.model.operations.block.Instruction;
import com.knitml.core.model.operations.block.RepeatInstruction;
import com.knitml.core.model.operations.block.Row;
import com.knitml.core.model.pattern.InstructionGroup;
import com.knitml.core.model.pattern.Parameters;
import com.knitml.core.model.pattern.Pattern;
import com.knitml.core.model.pattern.Section;
import com.knitml.core.units.StitchGauge;
import com.knitml.dsl.ui.dialog.GaugeDialog;
import com.knitml.engine.common.KnittingEngineException;
import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.gpec.renderer.preferences.values.SystemOfUnits;
import com.knitml.renderer.chart.symbol.SymbolResolutionException;
import com.knitml.renderer.common.RenderingException;
import com.knitml.renderer.config.Configuration;
import com.knitml.renderer.context.Options;
import com.knitml.renderer.service.RenderingService;
import com.knitml.validation.context.PatternEventListener;

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
		return composite;
	}

	public Pattern render(Pattern patternModel) {
		if (renderingBrowser != null) {
			renderingBrowser.setText("");
		}
		Pattern renderedPattern = null;
		Writer writer = new StringWriter();
		String errors = null;
		try {
			renderedPattern = doRenderPattern(patternModel, writer);
		} catch (KnittingEngineException ex) {
			Throwable cause = ex;
			while (cause.getCause() != null) {
				cause = cause.getCause();
			}
			if (ex.getCause() instanceof RenderingException) {
				errors = handleRenderingException((RenderingException) ex
						.getCause());
			} else {
				errors = handleKnittingException(ex);
			}
		} catch (RenderingException ex) {
			errors = handleRenderingException(ex);
		} catch (Exception ex) {
			StringWriter stringError = new StringWriter();
			PrintWriter pw = new PrintWriter(stringError);
			ex.printStackTrace(pw);
			errors = "Could not render pattern: exception is "
					+ stringError.toString();
		}
		if (errors != null) {
			writeContentToPatternPage(errors);
			return null;
		} else {
			writeContentToPatternPage(writer.toString());
			return renderedPattern;
		}
	}

	private String handleRenderingException(RenderingException ex) {
		Throwable cause = ex;
		while (cause.getCause() != null) {
			cause = cause.getCause();
		}
		if (cause instanceof SymbolResolutionException) {
			return "Unable to chart a symbol using this symbol set. Consider using a complete symbol set. You can change this value in your preferences."
					+ cause.getMessage();
		} else {
			return "Could not render pattern because of the following: "
					+ ex.getMessage();
		}
	}

	protected Pattern doRenderPattern(Pattern patternModel,
			Writer renderedPatternWriter) throws KnittingEngineException,
			RenderingException {
		Configuration configuration = renderingPreferencesService
				.retrieveConfiguration();
		Module configurationModule = configuration.getModule();
		Options options = configuration.getOptions();
		if (renderingPreferencesService
				.getBooleanPreference(PreferenceKeys.ENABLE_GAUGE_TRANSFORMATION)) {
			boolean internationalUnits = !(SystemOfUnits.US.name())
					.equals(renderingPreferencesService
							.getPreference(PreferenceKeys.SYSTEM_OF_UNITS));
			boolean useSquare = renderingPreferencesService
					.getBooleanPreference(PreferenceKeys.SQUARE_GAUGE);

			GaugeDialog dialog = new GaugeDialog(parentContainer.getShell(),
					internationalUnits, useSquare);
			if (dialog.open() == Window.OK) {
				final Measurable<StitchGauge> stitchGauge = dialog
						.getStitchGauge();
				configurationModule = Modules.combine(configurationModule,
						new AbstractModule() {
							protected void configure() {
								bind(
										new TypeLiteral<List<PatternEventListener>>() {
										}).toProvider(
										new EventListenerCollectionProvider(
												stitchGauge));
							}
						});
			}
		}

		// modify the options to load pattern messages from the current
		// directory
		ResourceLoader workspaceResourceLoader = new WorkspaceContainerResourceLoader(
				source.getParent());
		options.setPatternMessageResourceLoader(workspaceResourceLoader);

		Parameters parameters = new Parameters();
		parameters.setCheckSyntax(false);
		parameters.setPattern(patternModel);
		parameters.setWriter(renderedPatternWriter);

		return renderingService.renderPattern(parameters, configurationModule,
				options);
	}

	private String handleKnittingException(KnittingEngineException ex) {
		Throwable cause = ex;
		while (cause.getCause() != null) {
			cause = cause.getCause();
		}
		if (!(cause instanceof KnittingEngineException)) {
			throw new RuntimeException(cause);
		}
		StringBuilder message = new StringBuilder();
		message.append("There is a problem with the pattern that prevents it from being successfully knit. ");
		if (ex.getOffendingOperation() instanceof DiscreteInlineOperation) {
			message.append("Unable to \"" + ex.getOffendingOperation()
					+ "\" because of the following error: ");
		} else {
			message.append("The following error occurred while test knitting: ");
		}
		message.append(createPhraseFromExceptionClass(cause.getClass()))
				.append(" (").append(cause.getMessage()).append(").")
				.append(newLine()).append("The issue is located in ")
				.append(getLocationString(ex));
		return message.toString();
	}

	public String getLocationString(KnittingEngineException ex) {
		List<String> strings = new ArrayList<String>(6);
		if (ex.getLocationBreadcrumb() != null) {
			List<Object> locationBreadcrumb = ex.getLocationBreadcrumb();
			ListIterator<Object> lit = locationBreadcrumb.listIterator();
			while (lit.hasNext()) {
				Object item = lit.next();
				if (item instanceof Row) {
					// Row object is used as a marker; it's not the real
					// executing row
					Row row = (Row) item;
					if (row.getNumbers() != null) {
						strings.add("row " + row.getNumbers()[0]);
					}
				} else if (item instanceof Instruction) {
					if (lit.hasNext()
							&& locationBreadcrumb.get(lit.nextIndex()) instanceof RepeatInstruction) {
						Object repeatValue = ((RepeatInstruction) lit.next())
								.getValue();
						strings.add("repeat " + repeatValue
								+ " of instruction '"
								+ ((Instruction) item).getId() + "'");
					} else {
						Instruction instruction = (Instruction) item;
						strings.add("instruction '" + instruction.getId() + "'");
					}
				} else if (item instanceof Section) {
					Section section = (Section) item;
					strings.add("section " + section.getNumber());
				} else if (item instanceof InstructionGroup) {
					InstructionGroup group = (InstructionGroup) item;
					strings.add("group '" + group.getId() + "'");
				}
			}
		}
		return StringUtils.join(strings.toArray(), ", ");
	}

	private String newLine() {
		// a bit of a hack, but it works!
		return (renderingBrowser != null ? "<br />" : System
				.getProperty("line.separator"));
	}

	protected String createPhraseFromExceptionClass(Class<?> clazz) {
		String[] words = StringUtils.splitByCharacterTypeCamelCase(clazz
				.getSimpleName());
		if (words[words.length - 1].equalsIgnoreCase("Exception")) {
			words = (String[]) ArrayUtils.remove(words, words.length - 1);
		}
		return StringUtils.join(words, ' ');
	}

	protected void writeContentToPatternPage(String pattern) {
		if (renderingBrowser != null) {
			renderingBrowser.setText(pattern);
		} else {
			FontData[] fontDataFromPrefs = renderingPreferencesService
					.getFontData();
			if (renderedPatternFont == null
					|| !ArrayUtils.isEquals(fontDataFromPrefs,
							renderedPatternFont.getFontData())) {
				Font fontToUse = new Font(Display.getCurrent(),
						fontDataFromPrefs);
				renderedPattern.setFont(fontToUse);
				renderedPattern.setText(pattern);
				if (renderedPatternFont != null) {
					renderedPatternFont.dispose();
				}
				renderedPatternFont = fontToUse;
			}
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