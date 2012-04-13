package com.knitml.dsl.converter.emf

import static com.google.inject.Key.get
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.DecreaseType
import com.knitml.core.common.IncreaseType
import com.knitml.core.model.operations.inline.Decrease;
import com.knitml.core.model.operations.inline.Increase;
import com.knitml.core.model.pattern.Pattern;

class IncreaseConverterTests extends AbstractConverterTests {

	@Test
	void m1a() {
		Pattern pattern = convert 'Row: m1a'
		((Increase) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (IncreaseType.M1A)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	@Test
	void m1a2Times() {
		Pattern pattern = convert 'Row: m1a 2 times'
		((Increase) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (IncreaseType.M1A)
			assertThat numberOfTimes, is (2)
			assertThat yarnIdRef, is (null)
		}
	}
	@Test
	void m1a3TimesWithMainColor() {
		Pattern pattern = convert '''
			Pattern name: "Thing"
			Description: "Thing 2"
			Yarn: 50g of sport weight yarn named MainColor
					
			Row: m1a 3 times with MainColor
		'''
		((Increase) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (IncreaseType.M1A)
			assertThat numberOfTimes, is (3)
			assertThat yarnIdRef, is ('MainColor')
		}
	}
}
