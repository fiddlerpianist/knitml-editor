package com.knitml.dsl.converter.emf

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.operations.block.CastOn;
import com.knitml.core.model.operations.block.Instruction;
import com.knitml.core.model.operations.block.RepeatInstruction;
import com.knitml.core.model.operations.block.Row;
import com.knitml.core.model.pattern.InstructionGroup;
import com.knitml.core.model.pattern.Section;

class InstructionGroupConverterTests extends AbstractConverterTests {

	@Test
	void basicInstructionGroup() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Group cast-on:
		Row: knit
		'''
		((InstructionGroup) pattern.directions.operations[0]).with {
			assertThat it, instanceOf (InstructionGroup)
			assertThat it.id, is ('cast-on')
			assertThat it.label, is (null)
			assertThat it.messageKey, is (null)
			assertThat it.resetRowCount, is (false)
		}
	}
	
	@Test
	void instructionGroupWithLabelAndResetCountApplied() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Group cast-on "Set up your work" (with key, reset count):
		Row: knit
		'''
		((InstructionGroup) pattern.directions.operations[0]).with {
			assertThat it, instanceOf (InstructionGroup)
			assertThat it.id, is ('cast-on')
			assertThat it.label, is ('Set up your work')
			assertThat it.messageKey, is ('instruction-group.cast-on')
			assertThat it.resetRowCount, is (true)
		}
	}
	
	@Test
	void instructionGroupNoParagraphs() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Group cast-on "Setup your work":
		Cast on 20

		Group body "Knit the body":
		Instruction stockinette: 
			Row: k to end
			Row: p to end 

		Repeat stockinette for 3 inches

		Group finish-off "Finish":
		Next Row: bind off all sts'''
		((List<InstructionGroup>) pattern.directions.operations).with {
			assertThat size(), is (3)
			assertThat it[0], instanceOf (InstructionGroup)
			it[0].operations.with {
				assertThat it[0], instanceOf (CastOn)
			}
			assertThat it[1], instanceOf (InstructionGroup)
			it[1].operations.with {
				assertThat it[0], instanceOf (Instruction)
				assertThat it[1], instanceOf (RepeatInstruction)
			}
			assertThat it[2], instanceOf (InstructionGroup)
			it[2].operations.with {
				assertThat it[0], instanceOf (Row)
			}
		}
	}

	@Test
	void instructionGroupWithParagraphs() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		PARAGRAPHS

		Group cast-on "Setup your work":
		-- Group 1, paragraph 1
		Cast on 20

		-- Group 1, paragraph 2
		"Detailed instructions about something in its own paragraph."

		Group body "Knit the body":
		-- Group 2, paragraph 1
		Instruction stockinette:
			Row: k to end
			Row: p to end

		-- Group 2, paragraph 1 continued
		Repeat stockinette for 3 inches

		-- Group 2, paragraph 2
		"More instructions here!"

		-- Group 3, paragraph 1
		Group finish-off "Finish":
		Next Row: bind off all sts
		'''
		((List<InstructionGroup>) pattern.directions.operations).with {
			assertThat size(), is (3)
			assertThat it[0], instanceOf (InstructionGroup)
			it[0].operations.with {
				assertThat it[0], instanceOf (Section)
				assertThat it[1], instanceOf (Section)
			}
			assertThat it[1], instanceOf (InstructionGroup)
			it[1].operations.with {
				assertThat it[0], instanceOf (Section)
				assertThat it[1], instanceOf (Section)
			}
			assertThat it[2], instanceOf (InstructionGroup)
			it[2].operations.with {
				assertThat it[0], instanceOf (Section)
			}
		}
	}
}
