package com.knitml.gpec.renderer.preferences.operations;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.osgi.service.prefs.Preferences;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		Preferences preferences = new DefaultScope()
				.getNode(Activator.PLUGIN_ID);
		ResourceBundle defaultOperations = ResourceBundle.getBundle("resources/operations");
		Enumeration<String> keys = defaultOperations.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			preferences.put(key, defaultOperations.getString(key));
		}
	}
}
