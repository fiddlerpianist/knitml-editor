package com.knitml.gpec.renderer.preferences;

import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;

import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;


public class RenderingPreferenceChangeListener implements
		IPreferenceChangeListener {
	
	private RenderingPreferencesService service;
	
	public RenderingPreferenceChangeListener(RenderingPreferencesService service) {
		this.service = service;
	}

	public void preferenceChange(PreferenceChangeEvent event) {
		this.service.refreshConfiguration(event.getNode());
	}

}
