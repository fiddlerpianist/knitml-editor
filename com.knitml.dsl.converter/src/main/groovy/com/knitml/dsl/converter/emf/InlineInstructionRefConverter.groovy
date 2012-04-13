package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.operations.block.InstructionRef;
import com.knitml.core.model.operations.inline.InlineInstructionRef;
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class InlineInstructionRefConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.InlineInstructionRef> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public InlineInstructionRef convert(com.knitml.dsl.knittingExpressionLanguage.InlineInstructionRef emfInstructionRef) {
		return new InlineInstructionRef(emfHelper.getInlineInstruction(emfInstructionRef.referencedInstruction.name))
	}
}
