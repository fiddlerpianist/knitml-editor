package com.knitml.dsl.converter.emf

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic
import org.junit.runner.RunWith

import com.google.inject.Inject
import com.google.inject.Injector
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.Pattern
import com.knitml.dsl.converter.KnittingExpressionLanguageInjectorProvider
import com.knitml.dsl.converter.emf.exception.ConversionException
import com.knitml.dsl.converter.emf.exception.LinkingException


@RunWith(XtextRunner)
@InjectWith(KnittingExpressionLanguageInjectorProvider)
abstract protected class AbstractConverterTests {

	@Inject Injector injector
	@Inject DomainModelConverterLocator<EObject> converterLocator

	protected Pattern convert (String input) {
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet)
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, true)
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/dummy.kelp"))
		InputStream is = new ByteArrayInputStream(input.bytes)
		resource.load(is, resourceSet.loadOptions)

		if (!resource.errors.empty) {
			for (Diagnostic diag : resource.errors) {
				if (diag instanceof XtextSyntaxDiagnostic) {
					throw new ConversionException('The file has syntax errors on parse: ' + diag.message)
				} else if (diag instanceof XtextLinkingDiagnostic) {
					throw new LinkingException(diag.message)
				}
			}
			throw new ConversionException('Unknown error occurred after parsing ')
		}

		// convert!
		def emfPattern = resource.contents.get(0)
		Pattern pattern = converterLocator.locateConverter(emfPattern).convert(emfPattern)
	}
}
