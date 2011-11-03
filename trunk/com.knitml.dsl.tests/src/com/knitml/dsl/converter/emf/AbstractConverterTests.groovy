package com.knitml.dsl.converter.emf
import static com.google.inject.Key.get
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.parser.IParser
import org.junit.runner.RunWith

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.dsl.converter.KnittingExpressionLanguageInjectorProvider;
import com.knitml.dsl.converter.emf.exception.ConversionException

@RunWith(XtextRunner)
@InjectWith(KnittingExpressionLanguageInjectorProvider)
abstract protected class AbstractConverterTests {

	@Inject	IParser parser
	@Inject DomainModelConverterLocator<EObject> converterLocator

	protected com.knitml.core.model.Pattern convert (String input) {
		def reader = new StringReader (input)
		IParseResult result = parser.parse(reader)
		if (result.hasSyntaxErrors()) {
			throw new ConversionException('Syntax errors on parse')
		}
		def emfPattern = result.rootASTElement
		com.knitml.core.model.Pattern pattern = converterLocator.locateConverter(emfPattern).convert(emfPattern)
	} 

}
