package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*
import static com.knitml.core.units.Units.*

import org.junit.Test

import com.knitml.core.model.directions.block.CastOn
import com.knitml.core.model.directions.block.Instruction
import com.knitml.core.model.directions.block.RepeatInstruction
import com.knitml.core.model.directions.block.Row
import com.knitml.core.model.directions.block.Section
import com.knitml.core.model.directions.information.Information

class HeaderConverterTests extends AbstractConverterTests {

	@Test
	void minimalHeader() {
		com.knitml.core.model.Pattern pattern = convert '''
		Pattern name: "Emmaheld"
		Description: "A fair isle piece inspired by my trip to the Shetlands"

		Row: knit
		'''
		assertThat pattern.generalInformation, not (null)
		assertThat pattern.generalInformation.patternName, is ('Emmaheld')
		assertThat pattern.generalInformation.description, is ('A fair isle piece inspired by my trip to the Shetlands')
		assertThat pattern.generalInformation.languageCode, is ('en')
		assertThat pattern.generalInformation.gauge, is (null)
		assertThat pattern.generalInformation.dimensions, is (null)
		assertThat pattern.generalInformation.author, is (null)
		assertThat pattern.generalInformation.techniques, is (null)
		assertThat pattern.generalInformation.copyright, is (null)
		assertThat pattern.languageCode, is ('en')
	}
	@Test
	void fullGeneralInformationHeader() {
		com.knitml.core.model.Pattern pattern = convert '''
		Pattern name: "Emmaheld"
		Description: "A fair isle piece inspired by my trip to the Shetlands"
		Language: French
		Gauge: 3 st/in, 5 rows/in
		Author: "Fred Smith"
		Dimensions: "3 inches around"
		Techniques: "stranded knitting" "knitting in the round"
		Copyright: "Copyright 2011, Fred Smith Woolery"

		Row: knit
		'''
		assertThat pattern.generalInformation.patternName, is ('Emmaheld')
		assertThat pattern.generalInformation.description, is ('A fair isle piece inspired by my trip to the Shetlands')
		assertThat pattern.generalInformation.languageCode, is ('fr')
		assertThat pattern.generalInformation.gauge.stitchGauge.longValue(STITCHES_PER_INCH), is (3L)
		assertThat pattern.generalInformation.gauge.rowGauge.longValue(STITCHES_PER_INCH), is (5L)
		assertThat pattern.generalInformation.dimensions, is ('3 inches around')
		assertThat pattern.generalInformation.author.firstName, is ('Fred')
		assertThat pattern.generalInformation.author.lastName, is ('Smith')
		assertThat pattern.generalInformation.techniques[0], is ('stranded knitting')
		assertThat pattern.generalInformation.techniques[1], is ('knitting in the round')
		assertThat pattern.generalInformation.copyright, is ('Copyright 2011, Fred Smith Woolery')
		assertThat pattern.languageCode, is ('fr')
	}
}
