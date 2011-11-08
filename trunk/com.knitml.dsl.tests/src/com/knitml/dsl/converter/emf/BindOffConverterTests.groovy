package com.knitml.dsl.converter.emf
import static com.knitml.core.units.Units.*
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.Wise
import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.inline.BindOff
import com.knitml.core.model.directions.inline.BindOffAll


class BindOffConverterTests extends AbstractConverterTests {

	@Test
	void bindOffAllSts() {
		Pattern pattern = convert '''
			Row 1: knit
			Next Row: bind off all sts
		''' 
		((BindOffAll) pattern.directions.operations[1].operations[0]).with {
			assertThat it.type, is (null)
			assertThat it.yarnIdRef, is (null)
			assertThat it.fastenOffLastStitch, is (true)
		}
	}
	@Test
	void bindOffAllStsWithA() {
		Pattern pattern = convert '''
			Row 1: knit
			Next Row: bind off all sts with A
		''' 
		((BindOffAll) pattern.directions.operations[1].operations[0]).with {
			assertThat it.type, is (null)
			assertThat it.yarnIdRef, is ('A')
			assertThat it.fastenOffLastStitch, is (true)
		}
	}
	@Test
	void boAllStsKnitwise() {
		Pattern pattern = convert '''
			Row 1: knit
			Next Row: bo all sts knitwise
		''' 
		((BindOffAll) pattern.directions.operations[1].operations[0]).with {
			assertThat it.type, is (Wise.KNITWISE)
			assertThat it.yarnIdRef, is (null)
			assertThat it.fastenOffLastStitch, is (true)
		}
	}
	@Test
	void boAllStsPurlwise() {
		Pattern pattern = convert '''
			Row 1: knit
			Next Row: bo all sts pw
		''' 
		((BindOffAll) pattern.directions.operations[1].operations[0]).with {
			assertThat it.type, is (Wise.PURLWISE)
			assertThat it.yarnIdRef, is (null)
			assertThat it.fastenOffLastStitch, is (true)
		}
	}
	@Test
	void BO3kw() {
		Pattern pattern = convert '''
			Row 1: knit
			Next Row: BO 3 kw 
		''' 
		((BindOff) pattern.directions.operations[1].operations[0]).with {
			assertThat it.type, is (Wise.KNITWISE)
			assertThat it.yarnIdRef, is (null)
			assertThat it.numberOfStitches, is (3)
		}
	}
	@Test
	void BO3stWithA() {
		Pattern pattern = convert '''
			Row 1: knit
			Next Row: BO 3 sts with A 
		''' 
		((BindOff) pattern.directions.operations[1].operations[0]).with {
			assertThat it.numberOfStitches, is (3)
			assertThat it.yarnIdRef, is ('A')
			assertThat it.type, is (null)
		}
	}
}
