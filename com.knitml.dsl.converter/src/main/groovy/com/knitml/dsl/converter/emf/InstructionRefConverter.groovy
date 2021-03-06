package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.operations.block.InstructionRef;
import com.knitml.dsl.converter.emf.helper.EmfHelper;

public class InstructionRefConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.InstructionRef> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public InstructionRef convert(com.knitml.dsl.knittingExpressionLanguage.InstructionRef emfInstructionRef) {
		return new InstructionRef(emfHelper.getInstruction(emfInstructionRef.instruction.name))
	}
}
