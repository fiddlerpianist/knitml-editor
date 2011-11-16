package com.knitml.dsl.converter.emf
import static com.knitml.core.units.Units.*
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.block.Instruction
import com.knitml.core.model.directions.block.InstructionRef
import com.knitml.core.model.directions.block.RepeatInstruction
import com.knitml.core.model.directions.block.RepeatInstruction.Until


class InstructionRefConverterTests extends AbstractConverterTests {

	@Test
	void workNeedmore() {
		Pattern pattern = convert '''
			Instruction needmore:
				Row 1: knit

			Work needmore
		''' 
		((InstructionRef) pattern.directions.operations[1]).with {
			assertThat it.ref, instanceOf (Instruction)
		}
	}

	@Test
	void workNeedmoreInstruction() {
		Pattern pattern = convert '''
			Instruction needmore:
				Row 1: knit

			Work needmore instruction
		''' 
		((InstructionRef) pattern.directions.operations[1]).with {
			assertThat it.ref, instanceOf (Instruction)
		}
	}
}
