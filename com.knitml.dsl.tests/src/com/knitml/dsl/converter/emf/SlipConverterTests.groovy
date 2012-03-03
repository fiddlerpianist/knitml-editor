package com.knitml.dsl.converter.emf

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.SlipDirection
import com.knitml.core.common.Wise
import com.knitml.core.common.YarnPosition
import com.knitml.core.model.operations.inline.Slip;
import com.knitml.core.model.operations.inline.SlipToStitchHolder;
import com.knitml.core.model.pattern.Pattern;

class SlipConverterTests extends AbstractConverterTests {

	@Test
	void slip() {
		Pattern pattern = convert 'Row: slip'
		((Slip) pattern.directions.operations[0].operations[0]).with {
			assertThat yarnPosition, is (null)
			assertThat type, is (null)
			assertThat numberOfTimes, is (null)
			assertThat direction, is (SlipDirection.FORWARD)
		}
	}
	@Test
	void slNextSt() {
		Pattern pattern = convert 'Row: sl next st'
		((Slip) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfTimes, is (null)
			assertThat type, is (null)
			assertThat yarnPosition, is (null)
			assertThat direction, is (SlipDirection.FORWARD)
		}
	}
	@Test
	void revSlip1() {
		Pattern pattern = convert 'Row: rev slip 1'
		((Slip) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfTimes, is (1)
			assertThat type, is (null)
			assertThat yarnPosition, is (null)
			assertThat direction, is (SlipDirection.REVERSE)
		}
	}
	@Test
	void sl1Wyif() {
		Pattern pattern = convert 'Row: sl 1 wyif'
		((Slip) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfTimes, is (1)
			assertThat type, is (null)
			assertThat yarnPosition, is (YarnPosition.FRONT)
			assertThat direction, is (SlipDirection.FORWARD)
		}
	}
	@Test
	void sl1Wyib() {
		Pattern pattern = convert 'Row: sl 1 wyib'
		((Slip) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfTimes, is (1)
			assertThat type, is (null)
			assertThat yarnPosition, is (YarnPosition.BACK)
			assertThat direction, is (SlipDirection.FORWARD)
		}
	}
	@Test
	void sl1kw() {
		Pattern pattern = convert 'Row: sl 1 kw'
		((Slip) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfTimes, is (1)
			assertThat type, is (Wise.KNITWISE)
			assertThat yarnPosition, is (null)
			assertThat direction, is (SlipDirection.FORWARD)
		}
	}
	@Test
	void sl1pw() {
		Pattern pattern = convert 'Row: sl 1 pw'
		((Slip) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfTimes, is (1)
			assertThat type, is (Wise.PURLWISE)
			assertThat yarnPosition, is (null)
			assertThat direction, is (SlipDirection.FORWARD)
		}
	}
	@Test
	void slNext10StsToHolder() {
		Pattern pattern = convert '''
			Pattern name: "Thing"
			Description: "Thing 2"
			Stitch Holders:
				Holder-A "Holder A"

			Row: slip next 10 sts to Holder-A
		'''
		((SlipToStitchHolder) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfStitches, is (10)
			assertThat stitchHolder.id, is ('Holder-A')
			assertThat stitchHolder.label, is ('Holder A')
		}
	}
}
