package com.knitml.gpec.renderer.preferences.service.impl;

import static com.knitml.gpec.renderer.preferences.keys.PluginConstants.PLUGIN_ID;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.CHART_GLOBALLY;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.CHART_SYMBOL_PROVIDER;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.LANGUAGE;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.RENDERER;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.SQUARE_GAUGE;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.SYSTEM_OF_UNITS;

import java.util.Locale;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.FontData;
import org.springframework.beans.BeanUtils;

import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.knitml.gpec.renderer.preferences.RenderingPreferencesPlugin;
import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.gpec.renderer.preferences.service.RenderingOptionsPostProcessor;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.gpec.renderer.preferences.values.SystemOfUnits;
import com.knitml.renderer.BaseRendererFactory;
import com.knitml.renderer.Renderer;
import com.knitml.renderer.RendererFactory;
import com.knitml.renderer.chart.advisor.impl.TextArtSymbolAdvisor;
import com.knitml.renderer.chart.stylesheet.StylesheetProvider;
import com.knitml.renderer.chart.symbol.SymbolProvider;
import com.knitml.renderer.chart.writer.ChartWriter;
import com.knitml.renderer.chart.writer.impl.HtmlChartWriter;
import com.knitml.renderer.chart.writer.impl.TextChartWriter;
import com.knitml.renderer.config.Configuration;
import com.knitml.renderer.context.Options;
import com.knitml.renderer.impl.basic.BasicTextRenderer;
import com.knitml.renderer.impl.charting.ChartingRenderer;
import com.knitml.renderer.impl.html.HtmlRenderer;

public class RenderingPreferencesServiceImpl implements
		RenderingPreferencesService {

	private Options options;
	private Module configurationModule;

	public synchronized Configuration retrieveConfiguration() {
		Options optionsToReturn = new Options();
		// make a copy in case someone else modifies the options for a different
		// execution at the same time
		BeanUtils.copyProperties(options, optionsToReturn);
		return new Configuration(configurationModule, optionsToReturn);
	}

	public void refreshPreferences() {
		Options localOptions = configureOptions();

		// prepare the renderer factory
		final Class<? extends Renderer> baseRendererClass = findBaseRendererClass();
		Module dynamicModule;
		if (localOptions.isGlobalChart()) {
			final Class<? extends SymbolProvider> symbolProviderClass = findSymbolProviderClass();
			final Class<? extends StylesheetProvider> stylesheetProviderClass;
			if (StylesheetProvider.class.isAssignableFrom(symbolProviderClass)) {
				stylesheetProviderClass = symbolProviderClass.asSubclass(StylesheetProvider.class);
			} else {
				stylesheetProviderClass = null;
			}
			final Class<? extends ChartWriter> chartWriterClass;
			
			// this is probably a dangerous assumption to make
			if (HtmlRenderer.class.isAssignableFrom(baseRendererClass)) {
				chartWriterClass = HtmlChartWriter.class;
			} else {
				chartWriterClass = TextChartWriter.class;
			}
			dynamicModule = new AbstractModule() {
				protected void configure() {
					install(new FactoryModuleBuilder().implement(Renderer.class,
							ChartingRenderer.class).build(RendererFactory.class));
					install(new FactoryModuleBuilder().implement(Renderer.class,
							baseRendererClass).build(BaseRendererFactory.class));
					bind(SymbolProvider.class).to(symbolProviderClass);
					bind(ChartWriter.class).to(chartWriterClass);
					bind(StylesheetProvider.class).to(stylesheetProviderClass);
				}
			};
		} else {
			dynamicModule = new AbstractModule() {
				protected void configure() {
					install(new FactoryModuleBuilder().implement(Renderer.class,
							baseRendererClass).build(RendererFactory.class));
				}
			};
		}


		// do this all at once so that we don't accidentally get a mismatch in
		// configuration
		synchronized (this) {
			this.options = localOptions;
			this.configurationModule = dynamicModule;
		}
	}

	protected Class<? extends SymbolProvider> findSymbolProviderClass() {
		String symbolProviderName = Platform.getPreferencesService().getString(
				PLUGIN_ID, CHART_SYMBOL_PROVIDER, "", null);
		if (!"".equals(symbolProviderName)) {
			try {
				return Class.forName(symbolProviderName).asSubclass(
						SymbolProvider.class);
			} catch (ClassCastException ex) {
				logExceptionHandledWarning(
						"The chart symbol provider specified in the preferences is not of type "
								+ SymbolProvider.class.getName(), null);
			} catch (Exception ex) {
				logExceptionHandledWarning(
						"Could not instantiate the chart symbol advisor specified in the preferences. Using no symbol advisor",
						ex);
			}
		}
		return TextArtSymbolAdvisor.class;
	}

	protected Class<? extends Renderer> findBaseRendererClass() {
		try {
			String fallbackRendererClassName = Platform.getPreferencesService()
					.getString(PLUGIN_ID, RENDERER,
							BasicTextRenderer.class.getName(), null);
			return Class.forName(fallbackRendererClassName).asSubclass(
					Renderer.class);
		} catch (Exception ex) {
			logExceptionHandledWarning(
					"Could not create the specified renderer factory class. Will use the default",
					ex);
			return BasicTextRenderer.class;
		}
	}

	private void logExceptionHandledWarning(String message, Exception ex) {
		RenderingPreferencesPlugin
				.getDefault()
				.getLog()
				.log(new Status(IStatus.WARNING, PLUGIN_ID, IStatus.OK,
						message, ex));
	}

	protected Options configureOptions() {
		Options options = new Options();

		boolean chartGlobally = Platform.getPreferencesService().getBoolean(
				PLUGIN_ID, CHART_GLOBALLY, false, null);
		options.setGlobalChart(chartGlobally);
		boolean squareGauge = Platform.getPreferencesService().getBoolean(
				PLUGIN_ID, SQUARE_GAUGE, true, null);
		options.setSquareGauge(squareGauge);

		String systemOfUnits = Platform.getPreferencesService().getString(
				PLUGIN_ID, SYSTEM_OF_UNITS, "", null);
		if (!"".equals(systemOfUnits)) {
			if (systemOfUnits.equals(SystemOfUnits.US.name())) {
				options.useUsCustomaryUnits();
			} else if (systemOfUnits.equals(SystemOfUnits.INTERNATIONAL.name())) {
				options.useInternationalUnits();
			}
		}

		String language = Platform.getPreferencesService().getString(PLUGIN_ID,
				LANGUAGE, "", null);
		if (!"".equals(language)) {
			options.setLocale(new Locale(language));
		}

		FontData[] fontData = getFontData();
		options.setFontNames(new String[] { fontData[0].getName(), "serif" });

		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = registry
				.getConfigurationElementsFor(PLUGIN_ID, "optionPostProcessors");
		for (IConfigurationElement element : elements) {
			try {
				Object object = element.createExecutableExtension("class");
				if (!(object instanceof RenderingOptionsPostProcessor)) {
					throw new RuntimeException(
							"object not instance of RenderingOptionsPostProcessor");
				}

				options = ((RenderingOptionsPostProcessor) object)
						.postProcessOptions(options);
			} catch (CoreException ex) {
				throw new RuntimeException(ex);
			}
		}
		return options;
	}

	public String getPreference(String key) {
		return Platform.getPreferencesService().getString(PLUGIN_ID, key, null,
				null);
	}

	public boolean getBooleanPreference(String key) {
		return Platform.getPreferencesService().getBoolean(PLUGIN_ID, key,
				false, null);
	}

	public FontData[] getFontData() {
		String fontValue = Platform.getPreferencesService().getString(
				PLUGIN_ID, PreferenceKeys.FONT, null, null);
		if (fontValue != null) {
			return PreferenceConverter.basicGetFontData(fontValue);
		} else {
			return JFaceResources.getDefaultFont().getFontData();
		}
	}

}
