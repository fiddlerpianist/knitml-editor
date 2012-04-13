package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.operations.block.CastOn;
import com.knitml.core.model.operations.block.Information;
import com.knitml.core.model.operations.block.Instruction;
import com.knitml.core.model.operations.block.RepeatInstruction;
import com.knitml.core.model.operations.block.Row;
import com.knitml.core.model.pattern.Section;

class SectionConverterTests extends AbstractConverterTests {

	@Test
	void instructionWithColonAndLineFeed() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		PARAGRAPHS

		Cast on 17
		Row 1: p to end
		
		Instruction needmore: 
			Row: k to end
			Row: p to end 

		Repeat needmore for 3 inches

		Next Row: bind off all sts
		"Sit back and enjoy your finished work!"
		'''
		((List<Section>) pattern.directions.operations).with {
			assertThat size(), is (3)
			assertThat it[0], instanceOf (Section)
			assertThat it[1], instanceOf (Section)
			assertThat it[2], instanceOf (Section)
			it[0].operations.with {
				assertThat it[0], instanceOf (CastOn)
				assertThat it[1], instanceOf (Row)
			}
			it[1].operations.with {
				assertThat it[0], instanceOf (Instruction)
				assertThat it[1], instanceOf (RepeatInstruction)
			}
			it[2].operations.with {
				assertThat it[0], instanceOf (Row)
				assertThat it[1], instanceOf (Information)
			}
		}
	}
}
