package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.operations.inline.OperationGroup
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class OperationGroupConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.OperationGroup> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public OperationGroup convert(com.knitml.dsl.knittingExpressionLanguage.OperationGroup emfOperationGroup) {
		OperationGroup group = new OperationGroup()
		group.size = emfOperationGroup.size
		group.operations = emfHelper.convertOperations (emfOperationGroup.operations)
		return group
	}
}
