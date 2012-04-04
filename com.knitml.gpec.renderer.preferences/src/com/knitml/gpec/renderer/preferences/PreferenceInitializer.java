package com.knitml.gpec.renderer.preferences;

import static com.knitml.gpec.renderer.preferences.keys.PluginConstants.DEFAULT_RENDERING_FONT_ID;
import static com.knitml.gpec.renderer.preferences.keys.PluginConstants.PLUGIN_ID;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.ui.PlatformUI;
import org.osgi.service.prefs.Preferences;

import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.renderer.chart.advisor.impl.TextArtSymbolAdvisor;
import com.knitml.renderer.impl.html.HtmlRenderer;

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
		final Preferences preferences = DefaultScope.INSTANCE.getNode(PLUGIN_ID);
		preferences.putBoolean(PreferenceKeys.CHART_GLOBALLY, false);
		preferences.put(PreferenceKeys.RENDERER, HtmlRenderer.class.getName());
		preferences.put(PreferenceKeys.SYSTEM_OF_UNITS, "");
		preferences.putBoolean(PreferenceKeys.SQUARE_GAUGE, true);
		preferences.put(PreferenceKeys.LANGUAGE, "");
		preferences.put(PreferenceKeys.CHART_SYMBOL_PROVIDER,
				TextArtSymbolAdvisor.class.getName());
		preferences.putBoolean(PreferenceKeys.USE_GREY_NO_STITCH, true);
		preferences.putBoolean(PreferenceKeys.ENABLE_GAUGE_TRANSFORMATION,
				false);
		// initialize rendering font
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			public void run() {
				FontData[] initialRenderingFont = JFaceResources.getFont(
						DEFAULT_RENDERING_FONT_ID).getFontData();
				preferences.put(PreferenceKeys.FONT, PreferenceConverter
						.getStoredRepresentation(initialRenderingFont));
			}
		});

	}
}
