package com.knitml.dsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;

import com.knitml.dsl.ui.folding.KnittingExpressionLanguageFoldingRegionProvider;
import com.knitml.dsl.ui.folding.KnittingExpressionLanguageLocationInFileProvider;
import com.knitml.dsl.ui.internal.KnittingExpressionLanguageUIPlugin;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.renderer.service.RenderingService;

/**
 * Use this class to register components to be used within the IDE.
 */
public class KnittingExpressionLanguageUiModule extends com.knitml.dsl.ui.AbstractKnittingExpressionLanguageUiModule {
	
	public KnittingExpressionLanguageUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public RenderingPreferencesService bindRenderingPreferencesService() {
		return KnittingExpressionLanguageUIPlugin.getInstance().getRenderingPreferencesService();
	}

	public RenderingService bindRenderingService() {
		return KnittingExpressionLanguageUIPlugin.getInstance().getRenderingService();
	}

	public Class<? extends IFoldingRegionProvider> bindIFoldingRegionProvider() {
		return KnittingExpressionLanguageFoldingRegionProvider.class;
	}
	
	public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
		return KnittingExpressionLanguageLocationInFileProvider.class;
	}
	
}
