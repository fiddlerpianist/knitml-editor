package com.knitml.dsl.converter.emf.helper

import java.util.List

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.google.inject.Singleton
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.common.Identifiable;
import com.knitml.core.model.common.Needle;
import com.knitml.core.model.common.StitchHolder;
import com.knitml.core.model.common.Yarn;
import com.knitml.core.model.operations.inline.Repeat.Until
import com.knitml.core.model.operations.Operation;
import com.knitml.core.model.operations.inline.InlineInstruction;
import com.knitml.core.model.operations.inline.Repeat;
import com.knitml.dsl.converter.OperationContainer
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec

@Singleton // FIXME This should be a pre-thread scope, not a singleton. Use Guice's SimpleScope for this instead.
public class EmfHelper {

	static final Log log = LogFactory.getLog(EmfHelper)

	@Inject
	DomainModelConverterLocator<EObject> locator

	private Map<String, Identifiable> instructionMap = [:]
	private Map<String, InlineInstruction> inlineInstructionMap = [:]
	private Map<String, Needle> needleMap = [:]
	private Map<String, Yarn> yarnMap = [:]
	private Map<String, StitchHolder> stitchHolderMap = [:]
	
	private Map<Operation, EObject> operationToEmfTraceMap = new HashMap<Operation, EObject>(500)

	public void reset() {
		// FIXME we won't need this method once the correct scope is implemented
		instructionMap = [:]
		inlineInstructionMap = [:]
		needleMap = [:]
		yarnMap = [:]
		stitchHolderMap = [:]
		operationToEmfTraceMap = new HashMap<Operation, EObject>(500)
	}

	void addInstruction(Identifiable modelInstruction) {
		instructionMap.put(modelInstruction.id, modelInstruction)
	}

	Identifiable getInstruction(String id) {
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

	StitchHolder getStitchHolder(String id) {
		stitchHolderMap.get(id)
	}

	void addStitchHolder(StitchHolder modelStitchHolder) {
		if (modelStitchHolder.id != null) {
			stitchHolderMap.put(modelStitchHolder.id, modelStitchHolder)
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
					operationToEmfTraceMap.put(it, emfOperation)
				}
			} else {
				operations << operation
				operationToEmfTraceMap.put(operation, emfOperation)
			}
		}
		return operations
	}
	
	EObject getEObjectForOperation(Operation operation) {
		operationToEmfTraceMap.get(operation)
	}
}
