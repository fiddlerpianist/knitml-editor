package com.knitml.gpec.renderer.preferences;

import static com.knitml.gpec.renderer.preferences.keys.PluginConstants.PLUGIN_ID;

import java.util.Hashtable;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.knitml.gpec.renderer.preferences.listener.RenderingPreferenceChangeListener;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.gpec.renderer.preferences.service.impl.RenderingPreferencesServiceImpl;


/**
 * The activator class controls the plug-in life cycle
 */
public class RenderingPreferencesPlugin extends AbstractUIPlugin {

	// The shared instance
	private static RenderingPreferencesPlugin plugin;
	
	// stuff we hold onto so that we can clean up on stop() effectively
	private RenderingPreferencesService preferencesService;
	private ServiceRegistration<RenderingPreferencesService> preferencesServiceRegistration;
	private IEclipsePreferences preferences;
	private IPreferenceChangeListener listener;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		preferences = (IEclipsePreferences) InstanceScope.INSTANCE.getNode(PLUGIN_ID);
		preferencesService = new RenderingPreferencesServiceImpl();
		preferencesServiceRegistration = context.registerService(RenderingPreferencesService.class, preferencesService, new Hashtable<String, Object>());
		listener = new RenderingPreferenceChangeListener(preferencesService); 
		preferences.addPreferenceChangeListener(listener);

//		renderingOptionsPostProcessorsTracker = new ServiceTracker(context, RenderingOptionsPostProcessor.class.getName(), null);
//		renderingOptionsPostProcessorsTracker.open();
		
		preferencesService.refreshPreferences();
		
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
