package com.knitml.dsl.converter.emf

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.CrossType;
import com.knitml.core.common.SlipDirection
import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.inline.CrossStitches

class CrossStitchesConverterTests extends AbstractConverterTests {

	@Test
	void cross2InFrontOf3() {
		Pattern pattern = convert 'Row: cross 2 in front of 3'
		((CrossStitches) pattern.directions.operations[0].operations[0]).with {
			assertThat first, is (2)
			assertThat type, is (CrossType.FRONT)
			assertThat next, is (3)
		}
	}
	@Test
	void cross2Behind3() {
		Pattern pattern = convert 'Row: cross 2 behind 3'
		((CrossStitches) pattern.directions.operations[0].operations[0]).with {
			assertThat first, is (2)
			assertThat type, is (CrossType.BACK)
			assertThat next, is (3)
		}
	}
}
