package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.KnittingShape
import com.knitml.core.model.operations.block.Instruction;
import com.knitml.core.model.operations.inline.InlineInstruction;
import com.knitml.core.model.operations.inline.Knit;
import com.knitml.core.model.operations.inline.Purl;
import com.knitml.dsl.converter.emf.exception.ConversionException

class InstructionConverterTests extends AbstractConverterTests {

	@Test
	void instructionWithColonAndLineFeed() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
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
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Instruction one { Row: knit }'''
		((Instruction) pattern.directions.operations[0]).with {
			assertThat it, instanceOf (Instruction)
			assertThat it.operations[0].operations[0], instanceOf (Knit)
		}
	}
	@Test
	void fullInstruction() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
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
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Instruction one:
			Row: knit'''
	}

	@Test
	void basicInlineInstruction() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Row: instruction one: [k, p]
		'''
		((InlineInstruction) pattern.directions.operations[0].operations[0]).with {
			assertThat id, is ('one')
			assertThat label, is (null)
			assertThat messageKey, is (null)
			assertThat it.operations[0], instanceOf (Knit)
			assertThat it.operations[1], instanceOf (Purl)
		}
	}
	@Test
	void fullInlineInstruction() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Row: instruction one "Number One" (with key): [k, p]
		'''
		((InlineInstruction) pattern.directions.operations[0].operations[0]).with {
			assertThat id, is ('one')
			assertThat label, is ("Number One")
			assertThat messageKey, is ("inline-instruction.one")
			assertThat it.operations[0], instanceOf (Knit)
			assertThat it.operations[1], instanceOf (Purl)
		}
	}
}
