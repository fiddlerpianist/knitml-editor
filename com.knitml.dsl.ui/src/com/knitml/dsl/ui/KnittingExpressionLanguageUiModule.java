package com.knitml.dsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider;

import com.knitml.dsl.ui.folding.KnittingExpressionLanguageFoldingRegionProvider;
import com.knitml.dsl.ui.folding.KnittingExpressionLanguageLocationInFileProvider;
import com.knitml.dsl.ui.internal.KnittingExpressionLanguageUIPlugin;
import com.knitml.dsl.ui.syntaxcoloring.KnittingExpressionLanguageHighlightingConfiguration;
import com.knitml.gpec.renderer.preferences.service.RenderingPreferencesService;
import com.knitml.renderer.service.RenderingService;

/**
 * Use this class to register components to be used within the IDE.
 */
public class KnittingExpressionLanguageUiModule extends
		com.knitml.dsl.ui.AbstractKnittingExpressionLanguageUiModule {

	public KnittingExpressionLanguageUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public RenderingPreferencesService bindRenderingPreferencesService() {
		return KnittingExpressionLanguageUIPlugin.getInstance()
				.getRenderingPreferencesService();
	}

	public RenderingService bindRenderingService() {
		return KnittingExpressionLanguageUIPlugin.getInstance()
				.getRenderingService();
	}

	public Class<? extends IFoldingRegionProvider> bindIFoldingRegionProvider() {
		return KnittingExpressionLanguageFoldingRegionProvider.class;
	}

	public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
		return KnittingExpressionLanguageLocationInFileProvider.class;
	}

	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return KnittingExpressionLanguageHighlightingConfiguration.class;
	}

	public Class<? extends org.eclipse.xtext.ui.wizard.IProjectCreator> bindIProjectCreator() {
		return com.knitml.dsl.ui.wizard.KnittingExpressionLanguageProjectAndPatternCreator.class;
	}

	// the following 3 dependencies remove the dependency on the JDT
	@Override
	public Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
		return ResourceForIEditorInputFactory.class;
	}

	@Override
	public Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		return SimpleResourceSetProvider.class;
	}

	@Override
	public com.google.inject.Provider<org.eclipse.xtext.resource.containers.IAllContainersState> provideIAllContainersState() {
		return org.eclipse.xtext.ui.shared.Access.getWorkspaceProjectsState();
	}

}
