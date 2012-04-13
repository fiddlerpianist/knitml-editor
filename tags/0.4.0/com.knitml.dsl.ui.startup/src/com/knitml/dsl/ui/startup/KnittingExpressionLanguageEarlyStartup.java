package com.knitml.dsl.ui.startup;

import org.eclipse.ui.IStartup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.knitml.dsl.ui.internal.KnittingExpressionLanguageUIPlugin;

public class KnittingExpressionLanguageEarlyStartup implements IStartup {

	private static final Logger logger = LoggerFactory.getLogger(KnittingExpressionLanguageEarlyStartup.class);
	
	public void earlyStartup() {
		logger.info("Eagerly activating the com.knitml.dsl.ui plugin");
		// this will force activation of the target bundle
		KnittingExpressionLanguageUIPlugin.getInstance();	
	}

}
