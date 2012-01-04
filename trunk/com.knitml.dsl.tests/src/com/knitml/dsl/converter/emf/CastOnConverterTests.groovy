package com.knitml.dsl.converter.emf
import static com.knitml.core.units.Units.*
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.block.CastOn
import com.knitml.core.model.directions.inline.InlineCastOn


class CastOnConverterTests extends AbstractConverterTests {

	@Test
	void castOn10Sts() {
		Pattern pattern = convert '''
			Cast on 10 sts
		''' 
		((CastOn) pattern.directions.operations[0]).with {
			assertThat it.numberOfStitches, is (10)
			assertThat it.style, is (null)
			assertThat it.yarnIdRef, is (null)
			assertThat it.countAsRow, is (false)
		}
	}

	@Test
	void castOn10StsWithAUsingTheLongTailMethodCountAsRow() {
		Pattern pattern = convert '''
			Pattern name: "Thing"
			Description: "Thing 2"
			Yarn: 50g of worsted weight yarn named A

			Cast on 10 sts with A using the long-tail method (count as row)
		''' 
		((CastOn) pattern.directions.operations[0]).with {
			assertThat it.numberOfStitches, is (10)
			assertThat it.style, is ('long-tail')
			assertThat it.yarnIdRef, is ('A')
			assertThat it.countAsRow, is (true)
		}
	}

	@Test
	void inlineCastOn10Sts() {
		Pattern pattern = convert '''
			Row: cast on 10 sts
		''' 
		((InlineCastOn) pattern.directions.operations[0].operations[0]).with {
			assertThat it.numberOfStitches, is (10)
			assertThat it.style, is (null)
			assertThat it.yarnIdRef, is (null)
		}
	}
	@Test
	void inlineCastOn10StsWithA() {
		Pattern pattern = convert '''
			Pattern name: "Thing"
			Description: "Thing 2"
			Yarn: 50g of worsted weight yarn named A

			Row: cast on 10 sts with A
		''' 
		((InlineCastOn) pattern.directions.operations[0].operations[0]).with {
			assertThat it.numberOfStitches, is (10)
			assertThat it.style, is (null)
			assertThat it.yarnIdRef, is ('A')
		}
	}
}
