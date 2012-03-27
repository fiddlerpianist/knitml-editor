package com.knitml.dsl.converter.emf

import static com.google.inject.Key.get
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.IncreaseType
import com.knitml.core.model.operations.inline.Increase
import com.knitml.core.model.operations.inline.IncreaseIntoNextStitch
import com.knitml.core.model.operations.inline.Knit
import com.knitml.core.model.pattern.Pattern

class IncreaseIntoNextStitchConverterTests extends AbstractConverterTests {

	@Test
	void incIntoNextSt() {
		Pattern pattern = convert 'Row: inc into next st [k,p,k]'
		((IncreaseIntoNextStitch) pattern.directions.operations[0].operations[0]).with {
			assertThat yarnIdRef, is (null)
			assertThat operations.size(), is (3)
			assertThat operations[0], instanceOf (Knit)
		}
	}
	@Test
	void incIntoNextStWithYarn() {
		Pattern pattern = convert '''
Pattern name: "Thing"
Description: "Thing 2"
Yarn: 50g of sport weight yarn named A

Row: inc into next st with A [k,p,k]'''
		((IncreaseIntoNextStitch) pattern.directions.operations[0].operations[0]).with {
			assertThat yarnIdRef, is ('A')
			assertThat operations.size(), is (3)
			assertThat operations[0], instanceOf (Knit)
		}
	}
}
