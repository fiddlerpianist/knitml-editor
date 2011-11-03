package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.common.KnittingShape
import com.knitml.core.common.RowDefinitionScope
import com.knitml.core.common.Side
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.Operation
import com.knitml.core.model.directions.block.Instruction;
import com.knitml.core.model.directions.block.Row

public class InstructionConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Instruction> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator

	protected List<Operation> convertChildren(List emfOperations) {
		List<Operation> operations = []
		for (def emfOperation : emfOperations) {
			Operation operation = locator.locateConverter(emfOperation).convert(emfOperation)
			operations << operation
		}
		return operations
	}

	@Override
	public Instruction convert(com.knitml.dsl.knittingExpressionLanguage.Instruction emfInstruction) {
		def id = emfInstruction.id
		def label = emfInstruction.label
		def messageKey = null
		if (emfInstruction.hasKey) {
			if (emfInstruction.messageKey == null) {
				// can specify "with key" without the key,
				// which defaults to the literal 'instruction.'
				//with the supplied ID
				messageKey = 'instruction.' + emfInstruction.id
			} else {
				messageKey = emfInstruction.messageKey
			}
		}
		def rowCount = emfInstruction.rowCount
		def knittingShape = null
		if (emfInstruction.shape != null) {
			knittingShape = emfInstruction.shape.equals('round') ? KnittingShape.ROUND : KnittingShape.FLAT
		}
		def rows = convertChildren (emfInstruction.rows)
		return new Instruction(id, label, messageKey, knittingShape, rows, rowCount)
	}
}
