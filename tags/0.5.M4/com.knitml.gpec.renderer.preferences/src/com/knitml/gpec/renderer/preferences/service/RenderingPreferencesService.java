package com.knitml.gpec.renderer.preferences.service;

import org.osgi.service.prefs.Preferences;

import com.knitml.renderer.util.Configuration;

public interface RenderingPreferencesService {
	
	Preferences getCurrentPreferences();
	void refreshConfiguration(Preferences preferences);
	Configuration retrieveConfiguration();

}
