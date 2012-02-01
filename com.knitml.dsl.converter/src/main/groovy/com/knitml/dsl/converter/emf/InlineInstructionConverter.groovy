package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.common.KnittingShape
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.Operation
import com.knitml.core.model.directions.block.Instruction
import com.knitml.core.model.directions.inline.InlineInstruction;
import com.knitml.dsl.converter.emf.helper.EmfHelper;

public class InlineInstructionConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.InlineInstruction> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public InlineInstruction convert(com.knitml.dsl.knittingExpressionLanguage.InlineInstruction emfInlineInstruction) {
		def id = emfInlineInstruction.name
		def label = emfInlineInstruction.label
		def messageKey = null
		if (emfInlineInstruction.withKey != null) {
			if (emfInlineInstruction.withKey.messageKey == null) {
				// can specify "with key" without the key,
				// which defaults to the literal 'instruction.'
				//with the supplied ID
				messageKey = 'inline-instruction.' + emfInlineInstruction.name
			} else {
				messageKey = emfInlineInstruction.withKey.messageKey
			}
		}
		def operations = emfHelper.convertOperations (emfInlineInstruction.operations)
		InlineInstruction instruction = new InlineInstruction(id, label, messageKey, operations)
		emfHelper.addInlineInstruction(instruction)
		return instruction
	}
}
