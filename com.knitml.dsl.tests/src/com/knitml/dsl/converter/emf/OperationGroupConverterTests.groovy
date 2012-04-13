package com.knitml.dsl.converter.emf

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.operations.block.Row
import com.knitml.core.model.operations.inline.Increase
import com.knitml.core.model.operations.inline.OperationGroup
import com.knitml.core.model.operations.inline.Slip

class OperationGroupConverterTests extends AbstractConverterTests {

	@Test
	void operationGroup() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Row: group of 1 [sl1 wyif, yo] 
		'''
		((Row)pattern.directions.operations[0]).with {
			assertThat operations.size(), is (1)
			assertThat operations[0], instanceOf (OperationGroup)
			assertThat operations[0].size, is (1)
			assertThat operations[0].operations.size(), is (2)
			assertThat operations[0].operations[0], instanceOf (Slip)
			assertThat operations[0].operations[1], instanceOf (Increase)
		}
	}
}
