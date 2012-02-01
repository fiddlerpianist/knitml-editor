package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.block.Section
import com.knitml.core.model.directions.inline.Repeat
import com.knitml.dsl.converter.emf.helper.EmfHelper;

public class SectionConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Section> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public Section convert(com.knitml.dsl.knittingExpressionLanguage.Section emfSection) {
		Section section = new Section()
		section.operations = emfHelper.convertOperations(emfSection.elements)
		return section
	}
}
