package com.knitml.dsl.converter.emf
import static com.knitml.core.units.Units.*
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.block.UseNeedles


class UseNeedlesConverterTests extends AbstractConverterTests {

	@Test
	void useOneNeedle() {
		Pattern pattern = convert '''
		Pattern name: "Big Sweater"
		Description: "A big sweater knit with small needles; one of my favorite types of knits!"
		Needles:
			Size 1 US circulars
				NeedleOne "Needle 1"
				NeedleTwo "Needle 2"

		Use NeedleOne
		''' 
		assertThat pattern.directions.operations[0], instanceOf (UseNeedles)
		assertThat pattern.directions.operations[0].needles.size(), is (1)
		assertThat pattern.directions.operations[0].silentRendering, is (false)
	}
	@Test
	void useOneSilentNeedle() {
		Pattern pattern = convert '''
		Pattern name: "Big Sweater"
		Description: "A big sweater knit with small needles; one of my favorite types of knits!"
		Needles:
			Size 1 US circulars
				NeedleOne "Needle 1"
				NeedleTwo "Needle 2"

		(Use NeedleOne)
		''' 
		assertThat pattern.directions.operations[0], instanceOf (UseNeedles)
		assertThat pattern.directions.operations[0].needles.size(), is (1)
		assertThat pattern.directions.operations[0].silentRendering, is (true)
	}
	@Test
	void useTwoNeedles() {
		Pattern pattern = convert '''
		Pattern name: "Big Sweater"
		Description: "A big sweater knit with small needles; one of my favorite types of knits!"
		Needles:
			Size 1 US circulars
				NeedleOne "Needle 1"
				NeedleTwo "Needle 2"

		Use NeedleOne, NeedleTwo
		''' 
		assertThat pattern.directions.operations[0], instanceOf (UseNeedles)
		assertThat pattern.directions.operations[0].needles.size(), is (2)
		assertThat pattern.directions.operations[0].silentRendering, is (false)
	}
}
