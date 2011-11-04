package com.knitml.dsl.converter;


import org.eclipse.emf.ecore.EObject;

import com.knitml.core.converter.DomainModelConverterLocator;
import com.knitml.dsl.converter.emf.EmfDomainModelConverterLocator;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class KnittingExpressionLanguageRuntimeModule extends com.knitml.dsl.KnittingExpressionLanguageRuntimeModule {

	public Class<? extends DomainModelConverterLocator<EObject>> bindDomainModelConverterLocatorEObject() {
		return EmfDomainModelConverterLocator.class;
	}
}