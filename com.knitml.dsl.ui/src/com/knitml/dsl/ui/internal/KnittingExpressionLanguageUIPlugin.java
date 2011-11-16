package com.knitml.dsl.ui.internal;

import static com.google.inject.Guice.createInjector;
import static com.google.inject.util.Modules.override;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import com.google.inject.Injector;
import com.google.inject.Module;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.renderer.service.RenderingService;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass.
 */
public class KnittingExpressionLanguageUIPlugin extends AbstractUIPlugin {

	private ServiceTracker<RenderingPreferencesService, RenderingPreferencesService> preferencesServiceTracker;
	private ServiceTracker<RenderingService, RenderingService> renderingServiceTracker;

	private Map<String, Injector> injectors = new HashMap<String, Injector>();
	private static KnittingExpressionLanguageUIPlugin INSTANCE;

	public static KnittingExpressionLanguageUIPlugin getInstance() {
		return INSTANCE;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		// register OSGi service trackers
		preferencesServiceTracker = new ServiceTracker<RenderingPreferencesService, RenderingPreferencesService>(
				context, RenderingPreferencesService.class, null);
		preferencesServiceTracker.open();
		renderingServiceTracker = new ServiceTracker<RenderingService, RenderingService>(
				context, RenderingService.class, null);
		renderingServiceTracker.open();
		INSTANCE = this;

		try {
			registerInjectorFor("com.knitml.dsl.KnittingExpressionLanguage");

		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}

	protected void registerInjectorFor(String language) throws Exception {
		injectors.put(
				language,
				createInjector(override(
						override(getRuntimeModule(language)).with(
								getSharedStateModule())).with(
						getUiModule(language))));
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		renderingServiceTracker.close();
		renderingServiceTracker = null;
		preferencesServiceTracker.close();
		preferencesServiceTracker = null;
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}

	protected Module getRuntimeModule(String grammar) {
		if ("com.knitml.dsl.KnittingExpressionLanguage".equals(grammar)) {
			return new com.knitml.dsl.converter.KnittingExpressionLanguageRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if ("com.knitml.dsl.KnittingExpressionLanguage".equals(grammar)) {
			return new com.knitml.dsl.ui.KnittingExpressionLanguageUiModule(
					this);
		}
		throw new IllegalArgumentException(grammar);
	}

	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}

	public RenderingPreferencesService getRenderingPreferencesService() {
		return preferencesServiceTracker.getService();
	}

	public RenderingService getRenderingService() {
		return renderingServiceTracker.getService();
	}

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}

}
