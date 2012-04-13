package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.common.KnittingShape
import com.knitml.core.common.MergePoint
import com.knitml.core.common.MergeType
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.common.Identifiable;
import com.knitml.core.model.operations.block.ForEachRowInInstruction;
import com.knitml.core.model.operations.block.Instruction;
import com.knitml.core.model.operations.block.InstructionRef;
import com.knitml.core.model.operations.block.MergedInstruction;
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class InstructionConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Instruction> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public Identifiable convert(com.knitml.dsl.knittingExpressionLanguage.Instruction emfInstruction) {
		def instruction = emfHelper.getInstruction(emfInstruction.name)
		if (instruction != null) {
			// it's already been converted, so return it
			return instruction
		}
		if (emfInstruction.merged) {
			return convertMergedInstruction(emfInstruction)
		} else {
			// it may have already been processed by a forward link, so find it and if it doesn't exist, then create it
			return convertBlockInstruction(emfInstruction)
		}
	}
	
	private MergedInstruction convertMergedInstruction(com.knitml.dsl.knittingExpressionLanguage.Instruction emfInstruction) {
		MergedInstruction instruction = new MergedInstruction()
		instruction.id = emfInstruction.name
		instruction.label = emfInstruction.label
		if (emfInstruction.withKey != null) {
			if (emfInstruction.withKey.messageKey == null) {
				// can specify "with key" without the key,
				// which defaults to the literal 'instruction.'
				//with the supplied ID
				instruction.messageKey = 'instruction.' + emfInstruction.name
			} else {
				instruction.messageKey = emfInstruction.withKey.messageKey
			}
		}
		def instructionRefs = new ArrayList<InstructionRef>(2)
		instructionRefs << new InstructionRef(convert(emfInstruction.instruction1))
		instructionRefs << new InstructionRef(convert(emfInstruction.instruction2))
		instruction.instructions = instructionRefs
		instruction.mergePoint = emfInstruction.mergePoint?.equals('end') ? MergePoint.END : MergePoint.ROW
		instruction.type = MergeType.PHYSICAL
		// now add the instruction to the EMF helper repository
		emfHelper.addInstruction(instruction)
		return instruction
	}
	
	private Instruction convertBlockInstruction(com.knitml.dsl.knittingExpressionLanguage.Instruction emfInstruction) {
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
		def startingStitchCount = emfInstruction.startingStitchCount
		def knittingShape = null
		if (emfInstruction.shape != null) {
			knittingShape = emfInstruction.shape.equals('round') ? KnittingShape.ROUND : KnittingShape.FLAT
		}
		Instruction instruction
		if (emfInstruction.forEachRow != null) {
			instruction = new Instruction(id, label, messageKey, convertForEachRow(emfInstruction.forEachRow))
		} else {
			def rows = emfHelper.convertOperations (emfInstruction.rows)
			instruction = new Instruction(id, label, messageKey, knittingShape, rows, rowCount, startingStitchCount, null)
		}
		emfHelper.addInstruction(instruction)
		return instruction
	}
	
	private ForEachRowInInstruction convertForEachRow(com.knitml.dsl.knittingExpressionLanguage.ForEachRowInInstruction emfForEachRow) {
		ForEachRowInInstruction forEach = new ForEachRowInInstruction()
		forEach.ref = emfHelper.getInstruction(emfForEachRow.instruction.name)
		forEach.operations = emfHelper.convertOperations (emfForEachRow.operations)
		return forEach
	}
	
}
