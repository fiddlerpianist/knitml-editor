package com.knitml.dsl.converter.emf

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.operations.block.Row;
import com.knitml.core.model.operations.inline.UsingNeedle;

class UsingNeedleConverterTests extends AbstractConverterTests {

	@Test
	void usingNeedle() {
		com.knitml.core.model.pattern.Pattern pattern = convert '''
		Pattern name:  "My Pattern" 
		Description:  "My Description" 
			Needles: 
				circular 
					NeedleOne "One" 
					NeedleTwo "Two" 

		Row: 
			Using NeedleOne: k3, p2, k3 
			Using NeedleTwo: p3, k2
		'''
		((Row)pattern.directions.operations[0]).with {
			assertThat operations.size(), is (2)
			assertThat operations[0], instanceOf (UsingNeedle)
			assertThat operations[0].needle.id, is ('NeedleOne')
			assertThat operations[0].operations.size(), is (3)
			assertThat operations[1], instanceOf (UsingNeedle)
			assertThat operations[1].needle.id, is ('NeedleTwo')
			assertThat operations[1].operations.size(), is (2)
		}
	}
}
