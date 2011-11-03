
package com.knitml.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KnittingExpressionLanguageStandaloneSetup extends KnittingExpressionLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new KnittingExpressionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

