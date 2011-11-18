package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.common.KnittingShape
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.Operation
import com.knitml.core.model.directions.block.Instruction
import com.knitml.dsl.converter.emf.helper.EmfHelper;

public class InstructionConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Instruction> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public Instruction convert(com.knitml.dsl.knittingExpressionLanguage.Instruction emfInstruction) {
		def id = emfInstruction.name
		def label = emfInstruction.label
		def messageKey = null
		if (emfInstruction.withKey != null) {
			if (emfInstruction.withKey.messageKey == null) {
				// can specify "with key" without the key,
				// which defaults to the literal 'instruction.'
				//with the supplied ID
				messageKey = 'instruction.' + emfInstruction.name
			} else {
				messageKey = emfInstruction.withKey.messageKey
			}
		}
		def rowCount = emfInstruction.rowCount
		def knittingShape = null
		if (emfInstruction.shape != null) {
			knittingShape = emfInstruction.shape.equals('round') ? KnittingShape.ROUND : KnittingShape.FLAT
		}
		def rows = emfHelper.convertOperations (emfInstruction.rows)
		Instruction instruction = new Instruction(id, label, messageKey, knittingShape, rows, rowCount)
		emfHelper.addInstruction(instruction)
		return instruction
	}
}
