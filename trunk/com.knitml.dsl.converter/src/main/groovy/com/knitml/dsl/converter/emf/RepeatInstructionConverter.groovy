package com.knitml.dsl.converter.emf

import javax.measure.Measurable
import javax.measure.Measure

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.block.RepeatInstruction
import com.knitml.core.model.directions.block.RepeatInstruction.Until
import com.knitml.core.units.Units

public class RepeatInstructionConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.RepeatInstruction> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public RepeatInstruction convert(com.knitml.dsl.knittingExpressionLanguage.RepeatInstruction emfRepeatInstruction) {
		def repeat = new RepeatInstruction()
		// This is probably more work than we really need to do; could create a reference here
		//repeat.ref = locator.locateConverter(emfRepeatInstruction.instruction).convert(emfRepeatInstruction.instruction)
		repeat.ref = emfHelper.getInstruction(emfRepeatInstruction.instruction.name)
		repeat.value = emfRepeatInstruction.value
		if (emfRepeatInstruction.additionalTimes) {
			repeat.until = Until.ADDITIONAL_TIMES
		} else if (emfRepeatInstruction.desiredLength) {
			repeat.until = Until.UNTIL_DESIRED_LENGTH
		} else if (emfRepeatInstruction.remain) {
			repeat.until = Until.UNTIL_STITCHES_REMAIN
		} else if (emfRepeatInstruction.unit != null) {
			def valueToUse = emfRepeatInstruction.value == null ? emfRepeatInstruction.decimalValue : emfRepeatInstruction.value
			repeat.until = Until.UNTIL_MEASURES
			repeat.value = Measure.valueOf valueToUse, Units.valueOf(emfRepeatInstruction.unit.literal)
		}
		return repeat
	}
}
