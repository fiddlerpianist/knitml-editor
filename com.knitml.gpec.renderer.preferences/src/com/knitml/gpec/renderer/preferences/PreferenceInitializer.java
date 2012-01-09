package com.knitml.gpec.renderer.preferences;

import static com.knitml.gpec.renderer.preferences.keys.PluginConstants.PLUGIN_ID;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.osgi.service.prefs.Preferences;

import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.renderer.chart.advisor.impl.TextArtSymbolAdvisor;
import com.knitml.renderer.impl.html.HtmlRendererFactory;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		Preferences preferences = DefaultScope.INSTANCE.getNode(PLUGIN_ID);
		preferences.putBoolean(PreferenceKeys.CHART_GLOBALLY, false);
		preferences.put(PreferenceKeys.RENDERER_FACTORY, HtmlRendererFactory.class.getName());
		preferences.put(PreferenceKeys.SYSTEM_OF_UNITS, "");
		preferences.putBoolean(PreferenceKeys.SQUARE_GAUGE, true);
		preferences.put(PreferenceKeys.LANGUAGE, "");
		preferences.put(PreferenceKeys.CHART_SYMBOL_PROVIDER, TextArtSymbolAdvisor.class.getName());
	}
}
