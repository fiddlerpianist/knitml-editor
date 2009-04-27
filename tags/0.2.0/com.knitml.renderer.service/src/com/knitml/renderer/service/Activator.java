package com.knitml.renderer.service;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.knitml.renderer.service.impl.RenderingServiceImpl;

public class Activator implements BundleActivator {

	private ServiceRegistration renderingService;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// register the service
		renderingService = context.registerService(RenderingService.class.getName(), new RenderingServiceImpl(), new Hashtable<Object,Object>());
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		renderingService.unregister();
		renderingService = null;
	}

}
