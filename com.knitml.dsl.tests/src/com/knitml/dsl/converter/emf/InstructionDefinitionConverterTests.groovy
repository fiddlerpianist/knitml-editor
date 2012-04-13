package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.KnittingShape
import com.knitml.core.common.MergePoint
import com.knitml.core.common.MergeType
import com.knitml.core.model.operations.block.Instruction;
import com.knitml.core.model.operations.block.MergedInstruction;
import com.knitml.core.model.operations.block.Row;
import com.knitml.core.model.operations.inline.InlineInstruction;
import com.knitml.core.model.operations.inline.Knit;
import com.knitml.core.model.operations.inline.Purl;

class InstructionDefinitionConverterTests extends AbstractConverterTests {

	@Test
	void basicInstructionDefinition() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Instructions:
			Instruction one (flat):
				Row: knit

		Row: knit
		'''
		assertThat pattern.directives.instructionDefinitions.size(), is (1)
		assertThat pattern.directives.instructionDefinitions[0], instanceOf (Instruction)
		((Instruction)pattern.directives.instructionDefinitions[0]).with {
			assertThat it.forEachRowInInstruction, is (null)
			assertThat it.id, is ('one')
			assertThat it.label, is (null)
			assertThat it.knittingShape, is (KnittingShape.FLAT)
			assertThat it.rowCount, is (null)
			assertThat it.messageKey, is (null)
			assertThat it.operations[0], instanceOf (Row)
			assertThat it.operations[0].operations[0], instanceOf (Knit)
		}
	}
	@Test
	void fullInstructionDefinition() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Instructions:
			Instruction one "One and Only" (with key, round shape, 3 rounds, 5 starting sts):
				Row: knit

		Row: knit
		'''
		assertThat pattern.directives.instructionDefinitions.size(), is (1)
		assertThat pattern.directives.instructionDefinitions[0], instanceOf (Instruction)
		((Instruction)pattern.directives.instructionDefinitions[0]).with {
			assertThat it.forEachRowInInstruction, is (null)
			assertThat it.id, is ('one')
			assertThat it.label, is ('One and Only')
			assertThat it.knittingShape, is (KnittingShape.ROUND)
			assertThat it.rowCount, is (3)
			assertThat it.startingStitchCount, is (5)
			assertThat it.messageKey, is ('instruction.one')
		}
	}

	@Test
	void mergedInstructionAtRow() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Instructions:
			Instruction one (flat):
				Row: knit 4
			Instruction two (flat):
				Row: purl 4
			Merged Instruction Ribbing: join one with two at row

		Row: knit
		'''
		assertThat pattern.directives.instructionDefinitions.size(), is (3)
		assertThat pattern.directives.instructionDefinitions[2], instanceOf (MergedInstruction)
		((MergedInstruction)pattern.directives.instructionDefinitions[2]).with {
			assertThat it.id, is ('Ribbing')
			assertThat it.label, is (null)
			assertThat it.messageKey, is (null)
			assertThat it.instructions[0].ref.id, is ('one')
			assertThat it.instructions[1].ref.id, is ('two')
			assertThat it.mergePoint, is (MergePoint.ROW)
			assertThat it.type, is (MergeType.PHYSICAL)
		}
	}
	
	@Test
	void mergedInstructionAtEnd() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Instructions:
			Instruction one (flat):
				Row: knit 4
			Instruction two (flat):
				Row: purl 4
			Merged Instruction Ribbing: join one with two at end

		Row: knit
		'''
		assertThat pattern.directives.instructionDefinitions.size(), is (3)
		assertThat pattern.directives.instructionDefinitions[2], instanceOf (MergedInstruction)
		((MergedInstruction)pattern.directives.instructionDefinitions[2]).with {
			assertThat it.id, is ('Ribbing')
			assertThat it.label, is (null)
			assertThat it.messageKey, is (null)
			assertThat it.instructions[0].ref.id, is ('one')
			assertThat it.instructions[1].ref.id, is ('two')
			assertThat it.mergePoint, is (MergePoint.END)
			assertThat it.type, is (MergeType.PHYSICAL)
		}
	}
	
	@Test
	void mergedInstructionWithForwardLink() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Instructions:
			Merged Instruction Ribbing: join one with two at row
			Instruction one (flat):
				Row: knit 4
			Instruction two (flat):
				Row: purl 4

		Row: knit
		'''
		assertThat pattern.directives.instructionDefinitions.size(), is (3)
		assertThat pattern.directives.instructionDefinitions[0], instanceOf (MergedInstruction)
		((MergedInstruction)pattern.directives.instructionDefinitions[0]).with {
			assertThat it.id, is ('Ribbing')
			assertThat it.label, is (null)
			assertThat it.messageKey, is (null)
			assertThat it.instructions[0].ref.id, is ('one')
			assertThat it.instructions[1].ref.id, is ('two')
			assertThat it.mergePoint, is (MergePoint.ROW)
			assertThat it.type, is (MergeType.PHYSICAL)
		}
	}

	@Test
	void basicInlineInstructionDefinition() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Instructions:
			twist: k1 tbl, p2 tbl

		Row: knit
		'''
		assertThat pattern.directives.instructionDefinitions.size(), is (1)
		assertThat pattern.directives.instructionDefinitions[0], instanceOf (InlineInstruction)
		((InlineInstruction)pattern.directives.instructionDefinitions[0]).with {
			assertThat it.id, is ('twist')
			assertThat it.label, is (null)
			assertThat it.messageKey, is (null)
			assertThat it.operations.size(), is (2)
			assertThat it.operations[0], instanceOf (Knit)
			assertThat it.operations[1], instanceOf (Purl)
		}
	}

	@Test
	void fullInlineInstructionDefinition() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Instructions:
			twist "Twist and Shout" with key: k1 tbl, p2 tbl

		Row: knit
		'''
		assertThat pattern.directives.instructionDefinitions.size(), is (1)
		assertThat pattern.directives.instructionDefinitions[0], instanceOf (InlineInstruction)
		((InlineInstruction)pattern.directives.instructionDefinitions[0]).with {
			assertThat it.id, is ('twist')
			assertThat it.label, is ('Twist and Shout')
			assertThat it.messageKey, is ('inline-instruction.twist')
		}
	}

	@Test
	void inlineInstructionDefinitionWithKeySpecified() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Instructions:
			twist "Twist and Shout" with key 'twist-and-shout': k1 tbl, p2 tbl

		Row: knit
		'''
		assertThat pattern.directives.instructionDefinitions.size(), is (1)
		assertThat pattern.directives.instructionDefinitions[0], instanceOf (InlineInstruction)
		((InlineInstruction)pattern.directives.instructionDefinitions[0]).with {
			assertThat it.id, is ('twist')
			assertThat it.label, is ('Twist and Shout')
			assertThat it.messageKey, is ('twist-and-shout')
		}
	}
	
	@Test
	void mixedInstructions() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Instructions:
			twist: k1 tbl, p2 tbl
			Instruction one (flat):
				Row: knit
			twistTwo: k2 tbl, p4 tbl

		Row: knit
		'''
		assertThat pattern.directives.instructionDefinitions.size(), is (3)
		assertThat pattern.directives.instructionDefinitions[0], instanceOf (InlineInstruction)
		assertThat pattern.directives.instructionDefinitions[1], instanceOf (Instruction)
		assertThat pattern.directives.instructionDefinitions[2], instanceOf (InlineInstruction)
	}

}
