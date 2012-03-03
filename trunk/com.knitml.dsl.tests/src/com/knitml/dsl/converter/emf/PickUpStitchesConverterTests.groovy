package com.knitml.dsl.converter.emf
import static com.knitml.core.units.Units.*
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.Wise
import com.knitml.core.model.operations.block.PickUpStitches;
import com.knitml.core.model.operations.inline.InlinePickUpStitches;
import com.knitml.core.model.pattern.Pattern;


class PickUpStitchesConverterTests extends AbstractConverterTests {

	@Test
	void inlinePickUp10Sts() {
		Pattern pattern = convert '''
			Row: pick up 10 sts
		''' 
		((InlinePickUpStitches) pattern.directions.operations[0].operations[0]).with {
			assertThat it.numberOfTimes, is (10)
			assertThat it.yarnIdRef, is (null)
			assertThat it.type, is (Wise.KNITWISE)
		}
	}
	@Test
	void inlinePickUp10StsPurlwiseWithYarnA() {
		Pattern pattern = convert '''
			Pattern name: "Thing"
			Description: "Thing 2"
			Yarn: 50g of worsted weight yarn named A

			Row: pick up 10 sts pw with A
		''' 
		((InlinePickUpStitches) pattern.directions.operations[0].operations[0]).with {
			assertThat it.numberOfTimes, is (10)
			assertThat it.yarnIdRef, is ('A')
			assertThat it.type, is (Wise.PURLWISE)
		}
	}
	@Test
	void pickUp10Sts() {
		Pattern pattern = convert '''
			Pick up 10 sts
		''' 
		((PickUpStitches) pattern.directions.operations[0]).with {
			assertThat it.numberOfTimes, is (10)
			assertThat it.yarnIdRef, is (null)
			assertThat it.type, is (Wise.KNITWISE)
		}
	}
	@Test
	void pickUp10StsPurlwiseWithYarnA() {
		Pattern pattern = convert '''
			Pattern name: "Thing"
			Description: "Thing 2"
			Yarn: 50g of worsted weight yarn named A

			Pick up 10 sts pw with A
		''' 
		((PickUpStitches) pattern.directions.operations[0]).with {
			assertThat it.numberOfTimes, is (10)
			assertThat it.yarnIdRef, is ('A')
			assertThat it.type, is (Wise.PURLWISE)
		}
	}
}
