package com.knitml.gpec.renderer.preferences.operations.impl;




import org.osgi.service.prefs.Preferences;

import com.knitml.gpec.renderer.preferences.operations.Activator;
import com.knitml.gpec.renderer.preferences.service.RenderingOptionsPostProcessor;
import com.knitml.renderer.context.Options;

public class OptionsPostProcessorImpl implements RenderingOptionsPostProcessor {

	public Options postProcessOptions(Options originalOptions) {
		Preferences preferences = Activator.getDefault().getOperationPreferences();
		originalOptions.setProgramMessageSource(new PreferencesMessageSource(preferences));
		return originalOptions;
	}

}
