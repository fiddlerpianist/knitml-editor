package com.knitml.gpec.renderer.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.osgi.service.prefs.Preferences;

import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.renderer.chart.symbol.impl.TextArtSymbolProvider;
import com.knitml.renderer.impl.basic.BasicTextRendererFactory;

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
		Preferences preferences = new DefaultScope().getNode(RenderingPreferencesPlugin.PLUGIN_ID);
		preferences.putBoolean(PreferenceKeys.CHART_GLOBALLY, false);
		preferences.put(PreferenceKeys.RENDERER_FACTORY, BasicTextRendererFactory.class.getName());
		preferences.put(PreferenceKeys.SYSTEM_OF_UNITS, "");
		preferences.putBoolean(PreferenceKeys.SQUARE_GAUGE, true);
		preferences.put(PreferenceKeys.LANGUAGE, "");
		preferences.put(PreferenceKeys.CHART_SYMBOL_PROVIDER, TextArtSymbolProvider.class.getName());
	}
}
