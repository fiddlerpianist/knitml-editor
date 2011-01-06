package com.knitml.gpec.renderer.preferences.service.impl;

import static com.knitml.gpec.renderer.preferences.keys.PluginConstants.PLUGIN_ID;
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

import com.knitml.gpec.renderer.preferences.RenderingPreferencesPlugin;
import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.gpec.renderer.preferences.service.RenderingOptionsPostProcessor;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.gpec.renderer.preferences.values.SystemOfUnits;
import com.knitml.renderer.RendererFactory;
import com.knitml.renderer.chart.advisor.impl.TextArtSymbolAdvisor;
import com.knitml.renderer.chart.stylesheet.StylesheetProvider;
import com.knitml.renderer.chart.symbol.SymbolProvider;
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

	public synchronized Configuration retrieveConfiguration() {
		Options optionsToReturn = new Options();
		// make a copy in case someone else modifies the options for a different
		// execution at the same time
		BeanUtils.copyProperties(options, optionsToReturn);
		return new Configuration(rendererFactory, optionsToReturn);
	}

	public void refreshPreferences() {
		Options localOptions = configureOptions();
		RendererFactory localRendererFactory = null;

		// prepare the renderer factory
		Class<?> baseRendererFactoryClass = findBaseRendererFactoryClass();
		SymbolProvider symbolProvider = findSymbolProvider();
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

	protected SymbolProvider findSymbolProvider() {
		String symbolProviderName = Platform.getPreferencesService().getString(PLUGIN_ID, CHART_SYMBOL_PROVIDER, "", null);
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
		return new TextArtSymbolAdvisor();
	}

	protected Class<?> findBaseRendererFactoryClass() {
		try {
			String fallbackRendererFactoryClassName = Platform.getPreferencesService().getString(PLUGIN_ID, RENDERER_FACTORY, BasicTextRendererFactory.class.getName(), null);
			return Class.forName(fallbackRendererFactoryClassName);
		} catch (Exception ex) {
			logExceptionHandledWarning(
					"Could not create the specified renderer factory class. Will use the default",
					ex);
			return BasicTextRendererFactory.class;
		}
	}

	private void logExceptionHandledWarning(String message, Exception ex) {
		RenderingPreferencesPlugin.getDefault().getLog().log(
				new Status(IStatus.WARNING,
						PLUGIN_ID, IStatus.OK,
						message, ex));
	}

	protected Options configureOptions() {
		Options options = new Options();

		boolean chartGlobally = Platform.getPreferencesService().getBoolean(PLUGIN_ID, CHART_GLOBALLY, false, null);
		options.setGlobalChart(chartGlobally);
		boolean squareGauge = Platform.getPreferencesService().getBoolean(PLUGIN_ID, SQUARE_GAUGE, true, null);
		options.setSquareGauge(squareGauge);
		
		String systemOfUnits = Platform.getPreferencesService().getString(PLUGIN_ID, SYSTEM_OF_UNITS, "", null);
		if (!"".equals(systemOfUnits)) {
			if (systemOfUnits.equals(SystemOfUnits.US.name())) {
				options.useUsCustomaryUnits();
			} else if (systemOfUnits.equals(SystemOfUnits.INTERNATIONAL.name())) {
				options.useInternationalUnits();
			}
		}
		
		String language = Platform.getPreferencesService().getString(PLUGIN_ID, LANGUAGE, "", null);
		if (!"".equals(language)) {
			options.setLocale(new Locale(language));
		}
		
		FontData[] fontData = getFontData();
		options.setFontNames(new String[] { fontData[0].getName(), "serif" });
		
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IConfigurationElement[] elements = registry.getConfigurationElementsFor(PLUGIN_ID, "optionPostProcessors");
		for (IConfigurationElement element : elements) {
			try {
			Object object = element.createExecutableExtension("class");
			if (!(object instanceof RenderingOptionsPostProcessor)) {
				throw new RuntimeException("object not instance of RenderingOptionsPostProcessor");
			}
			
			options = ((RenderingOptionsPostProcessor)object).postProcessOptions(options);
			} catch (CoreException ex) {
				throw new RuntimeException(ex);
			}
		}
		return options;
	}

	public String getPreference(String key) {
		return Platform.getPreferencesService().getString(PLUGIN_ID, key, null, null);
	}
	
	public boolean getBooleanPreference(String key) {
		return Platform.getPreferencesService().getBoolean(PLUGIN_ID, key, false, null);
	}

	public FontData[] getFontData() {
		String fontValue = Platform.getPreferencesService().getString(PLUGIN_ID, PreferenceKeys.FONT, null, null);
		if (fontValue != null) {
			return PreferenceConverter.basicGetFontData(fontValue);
		} else {
			return JFaceResources.getDefaultFont().getFontData();
		}
	}

}
