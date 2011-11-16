package com.knitml.gpec.internal.kel;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.renderer.service.RenderingService;

/**
 * The activator class controls the plug-in life cycle
 */
public class KelPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.knitml.gpec.kel";

	// The shared instance
	private static KelPlugin plugin;
	private ServiceTracker<RenderingPreferencesService, RenderingPreferencesService> preferencesServiceTracker;
	private ServiceTracker<RenderingService, RenderingService> renderingServiceTracker;

	/**
	 * The constructor
	 */
	public KelPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		preferencesServiceTracker = new ServiceTracker<RenderingPreferencesService, RenderingPreferencesService>(
				context, RenderingPreferencesService.class, null);
		preferencesServiceTracker.open();
		renderingServiceTracker = new ServiceTracker<RenderingService, RenderingService>(
				context, RenderingService.class, null);
		renderingServiceTracker.open();
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		renderingServiceTracker.close();
		renderingServiceTracker = null;
		preferencesServiceTracker.close();
		preferencesServiceTracker = null;
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static KelPlugin getDefault() {
		return plugin;
	}

	public RenderingPreferencesService getRenderingPreferencesService() {
		return (RenderingPreferencesService) preferencesServiceTracker
				.getService();
	}

	public RenderingService getRenderingService() {
		return (RenderingService) renderingServiceTracker.getService();
	}
}
