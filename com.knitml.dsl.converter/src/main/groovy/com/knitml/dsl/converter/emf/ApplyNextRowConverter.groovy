package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.inline.ApplyNextRow
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class ApplyNextRowConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.ApplyNextRow> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public ApplyNextRow convert(com.knitml.dsl.knittingExpressionLanguage.ApplyNextRow emfApplyNextRow) {
		return new ApplyNextRow(emfHelper.getInstruction(emfApplyNextRow.referencedInstruction.name))
	}
}
