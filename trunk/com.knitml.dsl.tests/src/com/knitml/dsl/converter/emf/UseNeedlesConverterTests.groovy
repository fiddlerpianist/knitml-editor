package com.knitml.dsl.converter.emf
import static com.knitml.core.units.Units.*
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.operations.block.ArrangeStitchesOnNeedles;
import com.knitml.core.model.operations.block.GraftTogether;
import com.knitml.core.model.operations.block.LabelNeedle;
import com.knitml.core.model.operations.block.UseNeedles;
import com.knitml.core.model.pattern.Pattern;


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
	@Test
	void graft() {
		Pattern pattern = convert '''
		Pattern name: "Big Sweater"
		Description: "A big sweater knit with small needles; one of my favorite types of knits!"
		Needles:
			Size 1 US circulars
				NeedleOne "Needle 1"
				NeedleTwo "Needle 2"

		Graft together sts from NeedleOne and NeedleTwo
		''' 
		assertThat pattern.directions.operations[0], instanceOf (GraftTogether)
		assertThat pattern.directions.operations[0].needles.size(), is (2)
		assertThat pattern.directions.operations[0].needles[0].id, is ('NeedleOne')
		assertThat pattern.directions.operations[0].needles[1].id, is ('NeedleTwo')
	}
	@Test
	void labelNeedle() {
		Pattern pattern = convert '''
		Pattern name: "Big Sweater"
		Description: "A big sweater knit with small needles; one of my favorite types of knits!"
		Needles:
			Size 1 US circulars
				NeedleOne "Needle 1"
				NeedleTwo "Needle 2"

		Label NeedleOne as "New Needle" (with key 'NewNeedle')
		'''
		assertThat pattern.directions.operations[0], instanceOf (LabelNeedle)
		assertThat pattern.directions.operations[0].needle.id, is ('NeedleOne')
		assertThat pattern.directions.operations[0].label, is ('New Needle')
		assertThat pattern.directions.operations[0].messageKey, is ('NewNeedle')
	}

	@Test
	void arrangeStitchesOnNeedles() {
		Pattern pattern = convert '''
		Pattern name: "Big Sweater"
		Description: "A big sweater knit with small needles; one of my favorite types of knits!"
		Needles:
			Size 1 US circulars
				NeedleOne "Needle 1"
				NeedleTwo "Needle 2"

		Arrange stitches as follows: NeedleOne: 20, NeedleTwo: 18
		''' 
		assertThat pattern.directions.operations[0], instanceOf (UseNeedles)
		assertThat pattern.directions.operations[0].needles.size(), is (2)
		assertThat pattern.directions.operations[0].silentRendering, is (true)
		assertThat pattern.directions.operations[1], instanceOf (ArrangeStitchesOnNeedles)
		assertThat pattern.directions.operations[1].needles.size(), is (2)
		assertThat pattern.directions.operations[1].needles[0].needle.id, is ('NeedleOne')
		assertThat pattern.directions.operations[1].needles[0].numberOfStitches, is (20)
		assertThat pattern.directions.operations[1].needles[1].needle.id, is ('NeedleTwo')
		assertThat pattern.directions.operations[1].needles[1].numberOfStitches, is (18)
	}
}
