package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic
import org.eclipse.xtext.resource.XtextResource
import org.junit.runner.RunWith

import com.google.inject.Inject
import com.google.inject.Injector
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.dsl.converter.KnittingExpressionLanguageInjectorProvider
import com.knitml.dsl.converter.emf.exception.ConversionException
import com.knitml.dsl.converter.emf.exception.LinkingException

@RunWith(XtextRunner)
@InjectWith(KnittingExpressionLanguageInjectorProvider)
abstract protected class AbstractConverterTests {

	@Inject Injector injector;
	@Inject DomainModelConverterLocator<EObject> converterLocator

	protected com.knitml.core.model.Pattern convert (String input) {
		def resource = new XtextResource()
		injector.injectMembers(resource)
		// parse and link
		resource.reparse(input)
		if (resource.parseResult.hasSyntaxErrors()) {
			throw new ConversionException('Syntax errors on parse')
		}
		else if (!resource.errors.empty) {
			for (Diagnostic diag : resource.errors) {
				if (diag instanceof XtextLinkingDiagnostic) {
					throw new LinkingException(diag.message)
				}
			}
			throw new ConversionException('Unknown error occurred after parsing ')
		}

		// convert!
		def emfPattern = resource.parseResult.rootASTElement
		com.knitml.core.model.Pattern pattern = converterLocator.locateConverter(emfPattern).convert(emfPattern)
	}

}
