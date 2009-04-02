package com.knitml.gpec.renderer.preferences.operations;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.service.prefs.Preferences;
import org.osgi.util.tracker.ServiceTracker;

import com.knitml.gpec.renderer.preferences.listener.RenderingPreferenceChangeListener;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.knitml.gpec.renderer.preferences.operations";

	// The shared instance
	private static Activator plugin;
	private ServiceTracker renderingPreferencesServiceTracker;
	private IEclipsePreferences preferences;
	private IPreferenceChangeListener listener;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		preferences = (IEclipsePreferences) new InstanceScope().getNode(PLUGIN_ID);
		renderingPreferencesServiceTracker = new ServiceTracker(context, RenderingPreferencesService.class.getName(), null);
		renderingPreferencesServiceTracker.open();
		listener = new RenderingPreferenceChangeListener((RenderingPreferencesService)renderingPreferencesServiceTracker.getService()); 
		preferences.addPreferenceChangeListener(listener);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		preferences.removePreferenceChangeListener(listener);
		preferences = null;
		listener = null;
		renderingPreferencesServiceTracker.close();
		renderingPreferencesServiceTracker = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public Preferences getOperationPreferences() {
		return preferences;
	}
	
}
