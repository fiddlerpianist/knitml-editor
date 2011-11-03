package com.knitml.dsl.converter.emf;

import java.util.ArrayList
import java.util.List

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.BlockOperation
import com.knitml.core.model.directions.Directions
import com.knitml.core.model.directions.Operation

public class PatternConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Pattern> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator

	@Override
	public Pattern convert(com.knitml.dsl.knittingExpressionLanguage.Pattern emfPattern) {

		List<com.knitml.dsl.knittingExpressionLanguage.BlockOperation> emfOperations = emfPattern.elements;
		// initialize domain model elements
		Pattern pattern = new Pattern(new Directions())

		List<Operation> operations = []
		// iterate through each object in the operation list
		for (def emfOperation : emfOperations) {
			Operation operation = locator.locateConverter(emfOperation).convert(emfOperation)
			operations << operation
		}
		
		pattern.directions.operations = operations
		return pattern
	}

}
