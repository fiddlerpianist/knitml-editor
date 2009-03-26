package com.knitml.gpec.renderer.preferences;

import java.util.Hashtable;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.gpec.renderer.preferences.service.impl.RenderingPreferencesServiceImpl;


/**
 * The activator class controls the plug-in life cycle
 */
public class RenderingPreferencesPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.knitml.gpec.renderer.preferences";

	// The shared instance
	private static RenderingPreferencesPlugin plugin;
	private IPreferenceChangeListener listener;
	private IEclipsePreferences preferences;
	private ServiceRegistration preferencesServiceRegistration;
	private RenderingPreferencesService preferencesService;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		preferences = (IEclipsePreferences) new InstanceScope().getNode(PLUGIN_ID);
		preferencesService = new RenderingPreferencesServiceImpl(preferences);
		preferencesServiceRegistration = context.registerService(RenderingPreferencesService.class.getName(), preferencesService, new Hashtable<Object, Object>());
		listener = new RenderingPreferenceChangeListener(preferencesService); 
		preferences.addPreferenceChangeListener(listener);
		preferencesService.refreshConfiguration(preferences);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		preferences.removePreferenceChangeListener(listener);
		preferencesServiceRegistration.unregister();
		preferencesService = null;
		preferences = null;
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static RenderingPreferencesPlugin getDefault() {
		return plugin;
	}
	
}
