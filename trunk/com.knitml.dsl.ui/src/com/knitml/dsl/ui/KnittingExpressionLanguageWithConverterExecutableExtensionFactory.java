package com.knitml.dsl.ui;

import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class KnittingExpressionLanguageWithConverterExecutableExtensionFactory
		extends KnittingExpressionLanguageExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return com.knitml.dsl.ui.internal.KnittingExpressionLanguageWithConverterActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return com.knitml.dsl.ui.internal.KnittingExpressionLanguageWithConverterActivator.getInstance().getInjector("com.knitml.dsl.KnittingExpressionLanguage");
	}

}
