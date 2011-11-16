package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.block.JoinInRound

class JoinInRoundConverterTests extends AbstractConverterTests {

	@Test
	void joinInRound() {
		Pattern pattern = convert 'Join in round'
		assertThat pattern.directions.operations[0], instanceOf (JoinInRound)
	}
	@Test
	void joinTogetherInRound() {
		Pattern pattern = convert 'Join together in round'
		assertThat pattern.directions.operations[0], instanceOf (JoinInRound)
	}
}
