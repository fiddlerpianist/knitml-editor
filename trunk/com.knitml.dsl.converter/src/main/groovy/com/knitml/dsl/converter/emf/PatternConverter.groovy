package com.knitml.dsl.converter.emf;

import java.util.List

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.Pattern
import com.knitml.core.model.Version
import com.knitml.core.model.directions.Directions
import com.knitml.core.model.directions.Operation

public class PatternConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Pattern> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected HeaderConverter headerConverter

	@Override
	public Pattern convert(com.knitml.dsl.knittingExpressionLanguage.Pattern emfPattern) {
		Pattern pattern = null
		if (emfPattern.operations?.size() > 0) {
			pattern = process(emfPattern, emfPattern.operations)
		} else if (emfPattern.sections?.size() > 0) {
			pattern = process(emfPattern, emfPattern.sections)
		}
		else if (emfPattern.instructionGroups?.size() > 0) {
			pattern = process(emfPattern, emfPattern.instructionGroups)
		}
		return pattern
	}

	private Pattern process(com.knitml.dsl.knittingExpressionLanguage.Pattern emfPattern, List<?> emfOperations) {
		Pattern pattern = new Pattern(new Directions())
		pattern.version = Version.CURRENT_VERSION_ID
		if (emfPattern.header != null) {
			pattern.generalInformation = headerConverter.extractGeneralInformation(emfPattern.header)
			// copy language code from general information to top-level
			pattern.languageCode = pattern.generalInformation.languageCode
			pattern.supplies = headerConverter.extractSupplies(emfPattern.header)
		}

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
