package com.knitml.dsl.converter.emf.helper

import java.util.List

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.google.inject.Singleton
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.Operation
import com.knitml.core.model.directions.block.Instruction
import com.knitml.core.model.directions.inline.InlineInstruction
import com.knitml.core.model.directions.inline.Repeat
import com.knitml.core.model.directions.inline.Repeat.Until
import com.knitml.core.model.header.Needle
import com.knitml.core.model.header.Yarn
import com.knitml.dsl.converter.OperationContainer
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec

@Singleton
public class EmfHelper {

	static final Log log = LogFactory.getLog(EmfHelper)

	@Inject
	DomainModelConverterLocator<EObject> locator

	private Map<String, Instruction> instructionMap = [:]
	private Map<String, InlineInstruction> inlineInstructionMap = [:]
	private Map<String, Needle> needleMap = [:]
	private Map<String, Yarn> yarnMap = [:]

	void addInstruction(Instruction modelInstruction) {
		instructionMap.put(modelInstruction.id, modelInstruction)
	}

	Instruction getInstruction(String id) {
		instructionMap.get(id)
	}

	void addInlineInstruction(InlineInstruction modelInstruction) {
		inlineInstructionMap.put(modelInstruction.id, modelInstruction)
	}

	InlineInstruction getInlineInstruction(String id) {
		inlineInstructionMap.get(id)
	}

	void addNeedle(Needle modelNeedle) {
		if (modelNeedle.id != null) {
			needleMap.put(modelNeedle.id, modelNeedle)
		}
	}

	Needle getNeedle(String id) {
		needleMap.get(id)
	}

	void addYarn(Yarn modelYarn) {
		if (modelYarn.id != null) {
			yarnMap.put(modelYarn.id, modelYarn)
		}
	}

	Yarn getYarn(String id) {
		yarnMap.get(id)
	}

	@Override
	Repeat processRepeatSpec(com.knitml.dsl.knittingExpressionLanguage.RepeatSpec emfRepeatSpec) {
		def repeat = new Repeat()
		repeat.value = emfRepeatSpec.value
		if (emfRepeatSpec.toEnd) {
			repeat.until = Until.END
		} else if (emfRepeatSpec.toMarker) {
			repeat.until = Until.MARKER
		} else if (emfRepeatSpec.beforeEnd) {
			repeat.until = Until.BEFORE_END
		} else if (emfRepeatSpec.beforeGap) {
			repeat.until = Until.BEFORE_GAP
		} else if (emfRepeatSpec.beforeMarker) {
			repeat.until = Until.BEFORE_MARKER
		} else if (emfRepeatSpec.times) {
			repeat.until = Until.TIMES
		}
		return repeat
	}

	List<Operation> convertOperations(List emfOperations) {
		List<Operation> operations = []
		for (def emfOperation : emfOperations) {
			Operation operation = locator.locateConverter(emfOperation).convert(emfOperation)
			if (operation instanceof OperationContainer) {
				operation.siblingOperations.each {
					operations << it
				}	
			} else {
				operations << operation
			}
		}
		return operations
	}
}
