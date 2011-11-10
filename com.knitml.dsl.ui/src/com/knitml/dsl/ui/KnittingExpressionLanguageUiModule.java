package com.knitml.dsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.knitml.gpec.renderer.preferences.RenderingPreferencesPlugin;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;

/**
 * Use this class to register components to be used within the IDE.
 */
public class KnittingExpressionLanguageUiModule extends com.knitml.dsl.ui.AbstractKnittingExpressionLanguageUiModule {
	
	public KnittingExpressionLanguageUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public RenderingPreferencesService bindRenderingPreferencesService() {
		return RenderingPreferencesPlugin.getDefault().getPreferencesService();
	}


}
