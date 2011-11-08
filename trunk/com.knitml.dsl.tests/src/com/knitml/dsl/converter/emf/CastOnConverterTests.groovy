package com.knitml.dsl.converter.emf
import static com.knitml.core.units.Units.*
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.Wise
import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.block.CastOn
import com.knitml.core.model.directions.inline.BindOff
import com.knitml.core.model.directions.inline.BindOffAll


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
			Cast on 10 sts with A using the long-tail method (count as row)
		''' 
		((CastOn) pattern.directions.operations[0]).with {
			assertThat it.numberOfStitches, is (10)
			assertThat it.style, is ('long-tail')
			assertThat it.yarnIdRef, is ('A')
			assertThat it.countAsRow, is (true)
		}
	}
}
