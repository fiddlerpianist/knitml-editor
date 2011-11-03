package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.KnittingShape;
import com.knitml.core.model.directions.block.Instruction
import com.knitml.core.model.directions.inline.Knit
import com.knitml.dsl.converter.emf.exception.ConversionException

class InstructionConverterTests extends AbstractConverterTests {

	@Test
	void instructionWithColonAndLineFeed() {
		com.knitml.core.model.Pattern pattern = convert '''
		Instruction one:
			Row: knit

		'''
		((Instruction) pattern.directions.operations[0]).with {
			assertThat it, instanceOf (Instruction)
			assertThat it.operations[0].operations[0], instanceOf (Knit)
		}
	}
	@Test
	void instructionWithBrackets() {
		com.knitml.core.model.Pattern pattern = convert '''
		Instruction one { Row: knit }'''
		((Instruction) pattern.directions.operations[0]).with {
			assertThat it, instanceOf (Instruction)
			assertThat it.operations[0].operations[0], instanceOf (Knit)
		}
	}
	@Test
	void fullInstruction() {
		com.knitml.core.model.Pattern pattern = convert '''
		Instruction SunnyDayStitch "Sunny Day Stitch" (with key, round shape, 2 rounds):
			Row: knit
			Row: knit
		
		'''
		((Instruction) pattern.directions.operations[0]).with {
			assertThat it, instanceOf (Instruction)
			assertThat it.id, is ('SunnyDayStitch')
			assertThat it.label, is ('Sunny Day Stitch')
			assertThat it.messageKey, is ('instruction.SunnyDayStitch')
			assertThat it.knittingShape, is (KnittingShape.ROUND)
			assertThat it.rowCount, is (2)
			assertThat it.operations.size(), is (2)
		}
	}

	// test cases which demonstrate invalid syntax
	@Test(expected=ConversionException)
	void instructionWithColonWithoutLineFeed() {
		com.knitml.core.model.Pattern pattern = convert '''
		Instruction one:
			Row: knit
		'''
	}

}
