package com.knitml.dsl.converter;

import org.eclipse.xtext.linking.impl.Linker;
import org.eclipse.xtext.service.AbstractGenericModule;

public class StandaloneOverrideModule extends AbstractGenericModule {

	public Class<? extends org.eclipse.xtext.linking.ILinker> bindILinker() {
		return Linker.class;
	}

}
