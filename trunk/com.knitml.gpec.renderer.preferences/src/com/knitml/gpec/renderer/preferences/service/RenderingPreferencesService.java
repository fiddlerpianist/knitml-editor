package com.knitml.gpec.renderer.preferences.service;

import org.eclipse.swt.graphics.FontData;

import com.knitml.renderer.config.Configuration;

public interface RenderingPreferencesService {
	
	void refreshPreferences();
	Configuration retrieveConfiguration();
	String getPreference(String key);
	boolean getBooleanPreference(String key);
	FontData[] getFontData();

}
