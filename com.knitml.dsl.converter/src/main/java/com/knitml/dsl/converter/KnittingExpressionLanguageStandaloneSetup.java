package com.knitml.dsl.converter;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KnittingExpressionLanguageStandaloneSetup extends com.knitml.dsl.KnittingExpressionLanguageStandaloneSetup {

	public static void doSetup() {
		new KnittingExpressionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new KnittingExpressionLanguageRuntimeModule());
	}
	
	
}

