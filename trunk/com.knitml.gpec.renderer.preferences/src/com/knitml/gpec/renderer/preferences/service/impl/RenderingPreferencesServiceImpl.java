package com.knitml.gpec.renderer.preferences.service.impl;

import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.CHART_GLOBALLY;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.CHART_SYMBOL_PROVIDER;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.LANGUAGE;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.RENDERER_FACTORY;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.SQUARE_GAUGE;
import static com.knitml.gpec.renderer.preferences.keys.PreferenceKeys.SYSTEM_OF_UNITS;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.osgi.service.prefs.Preferences;
import org.springframework.beans.BeanUtils;

import com.knitml.gpec.renderer.preferences.RenderingPreferencesPlugin;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.gpec.renderer.preferences.values.SystemOfUnits;
import com.knitml.renderer.RendererFactory;
import com.knitml.renderer.chart.stylesheet.StylesheetProvider;
import com.knitml.renderer.chart.symbol.SymbolProvider;
import com.knitml.renderer.chart.symbol.impl.TextArtSymbolProvider;
import com.knitml.renderer.chart.writer.ChartWriterFactory;
import com.knitml.renderer.chart.writer.impl.HtmlChartWriterFactory;
import com.knitml.renderer.chart.writer.impl.TextChartWriterFactory;
import com.knitml.renderer.context.Options;
import com.knitml.renderer.impl.basic.BasicTextRendererFactory;
import com.knitml.renderer.impl.charting.ChartingRendererFactory;
import com.knitml.renderer.impl.html.HtmlRendererFactory;
import com.knitml.renderer.util.Configuration;

public class RenderingPreferencesServiceImpl implements
		RenderingPreferencesService {

	private Options options;
	private RendererFactory rendererFactory;
	private Preferences preferences;
	
	public RenderingPreferencesServiceImpl(Preferences originalPreferences) {
		this.preferences = originalPreferences;
	}

	public synchronized Configuration retrieveConfiguration() {
		Options optionsToReturn = new Options();
		// make a copy in case someone else modifies the options for a different
		// execution at the same time
		BeanUtils.copyProperties(options, optionsToReturn);
		return new Configuration(rendererFactory, optionsToReturn);
	}

	public void refreshConfiguration(Preferences preferences) {
		Options localOptions = configureOptions(preferences);
		RendererFactory localRendererFactory = null;

		// prepare the
		Class<?> baseRendererFactoryClass = findBaseRendererFactoryClass(preferences);
		SymbolProvider symbolProvider = findSymbolProvider(preferences);
		RendererFactory baseRendererFactory = createBaseRendererFactory(
				baseRendererFactoryClass, symbolProvider);

		List<SymbolProvider> symbolProviders = new ArrayList<SymbolProvider>();
		
		ChartWriterFactory chartWriterFactory = new HtmlChartWriterFactory();
		// this is probably a dangerous assumption to make
		if (!(baseRendererFactory instanceof HtmlRendererFactory)) {
			chartWriterFactory = new TextChartWriterFactory();
		}

		if (symbolProvider != null) {
			symbolProviders.add(symbolProvider);
		}
		localRendererFactory = new ChartingRendererFactory(baseRendererFactory,
				chartWriterFactory, symbolProviders);

		// do this all at once so that we don't accidentally get a mismatch in
		// configuration
		synchronized (this) {
			this.options = localOptions;
			this.rendererFactory = localRendererFactory;
			// probably the same object, but just in case...
			this.preferences = preferences;
		}
	}

	protected RendererFactory createBaseRendererFactory(
			Class<?> baseRendererFactoryClass, SymbolProvider advisor) {
		try {
			if (HtmlRendererFactory.class
					.isAssignableFrom(baseRendererFactoryClass)
					&& advisor instanceof StylesheetProvider) {
				Constructor<?> fallbackConstructor = baseRendererFactoryClass
						.getConstructor(StylesheetProvider.class);
				return (RendererFactory) fallbackConstructor
						.newInstance(advisor);
			} else {
				return (RendererFactory) baseRendererFactoryClass.newInstance();
			}
		} catch (Exception ex) {
			logExceptionHandledWarning(
					"Could not instantiate the specified renderer factory. Will use the default",
					ex);
			return new BasicTextRendererFactory();
		}
	}

	protected SymbolProvider findSymbolProvider(Preferences preferences) {
		String symbolProviderName = preferences.get(CHART_SYMBOL_PROVIDER,
				"");
		if (!"".equals(symbolProviderName)) {
			try {
				Class<?> providerClass = Class.forName(symbolProviderName);
				Object provider = providerClass.newInstance();
				if (provider instanceof SymbolProvider) {
					return (SymbolProvider) provider;
				} else {
					logExceptionHandledWarning(
							"The chart symbol provider specified in the preferences is not of type "
									+ SymbolProvider.class.getName(), null);
				}
			} catch (Exception ex) {
				logExceptionHandledWarning(
						"Could not instantiate the chart symbol advisor specified in the preferences. Using no symbol advisor",
						ex);
			}
		}
		return new TextArtSymbolProvider();
	}

	protected Class<?> findBaseRendererFactoryClass(Preferences preferences) {
		try {
			String fallbackRendererFactoryClassName = preferences.get(
					RENDERER_FACTORY, BasicTextRendererFactory.class.getName());
			return Class.forName(fallbackRendererFactoryClassName);
		} catch (Exception ex) {
			logExceptionHandledWarning(
					"Could not create the specified renderer factory class. Will use the default",
					ex);
			return BasicTextRendererFactory.class;
		}
	}

	private void logExceptionHandledWarning(String message, Exception ex) {
		RenderingPreferencesPlugin.getDefault().getLog().log(new Status(IStatus.WARNING, RenderingPreferencesPlugin.PLUGIN_ID, IStatus.OK,
				message, ex));
	}

	protected Options configureOptions(Preferences preferences) {
		Options options = new Options();
		options.setGlobalChart(preferences.getBoolean(CHART_GLOBALLY, false));
		options.setSquareGauge(preferences.getBoolean(SQUARE_GAUGE, true));
		String systemOfUnits = preferences.get(SYSTEM_OF_UNITS, "");
		if (!"".equals(systemOfUnits)) {
			if (systemOfUnits.equals(SystemOfUnits.US.name())) {
				options.useUsCustomaryUnits();
			} else if (systemOfUnits.equals(SystemOfUnits.INTERNATIONAL.name())) {
				options.useInternationalUnits();
			}
		}
		String language = preferences.get(LANGUAGE, "");
		if (!"".equals(language)) {
			options.setLocale(new Locale(language));
		}
		return options;
	}

	public Preferences getCurrentPreferences() {
		return preferences;
	}

}
