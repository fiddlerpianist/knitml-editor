package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*
import static com.knitml.core.units.Units.*

import org.junit.Test

import com.knitml.core.common.NeedleStyle;
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
	@Test
	void decimalGauge() {
		com.knitml.core.model.Pattern pattern = convert '''
		Pattern name: "Emmaheld"
		Description: "A fair isle piece inspired by my trip to the Shetlands"
		Gauge: 3.5 st/in, 5.5 rows/in

		Row: knit
		'''
		assertThat pattern.generalInformation.gauge.stitchGauge.doubleValue(STITCHES_PER_INCH), is (3.5d)
		assertThat pattern.generalInformation.gauge.rowGauge.doubleValue(STITCHES_PER_INCH), is (5.5d)
	}
	@Test
	void needleTypes() {
		com.knitml.core.model.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Needles:
			Size 00 US circulars, 24 in, brand "Addi Turbo"
				LittleNeedleOne "Little Needle 1"
				LittleNeedleTwo "Little Needle 2" (with key)
			Size 3.25 mm dpns, 40 cm long
				DPNOne "DP Needle 1"
				DPNTwo "DP Needle 2"
				DPNThree "DP Needle 3"
				DPNFour "DP Needle 4"
			Size 2 mm
				StraightOne "Straight Needle 1" (with key 'straight-needle-one')

		Row: knit
		'''
		assertThat pattern.supplies, not (null)
		assertThat pattern.supplies.needleTypes.size(), is (3)
		assertThat pattern.supplies.needleTypes[0].id, not (null)
		assertThat pattern.supplies.needleTypes[0].brand, is ('Addi Turbo')
		assertThat pattern.supplies.needleTypes[0].style, is (NeedleStyle.CIRCULAR)
		assertThat pattern.supplies.needleTypes[0].length.longValue(INCH), is (24L)
		assertThat pattern.supplies.needleTypes[0].needleSize.stringValue(NEEDLE_SIZE_US), is ('00')
		pattern.supplies.needleTypes[0].needles.with {
			assertThat it.size(), is (2)
			assertThat it[0].id, is ('LittleNeedleOne')
			assertThat it[0].label, is ('Little Needle 1')
			assertThat it[0].messageKey, is (null)
			assertThat it[0].type.id, is (pattern.supplies.needleTypes[0].id)
			assertThat it[1].id, is ('LittleNeedleTwo')
			assertThat it[1].label, is ('Little Needle 2')
			assertThat it[1].messageKey, is ('needle.LittleNeedleTwo')
			assertThat it[1].type.id, is (pattern.supplies.needleTypes[0].id)
		}

		assertThat pattern.supplies.needleTypes[1].id, not (null)
		assertThat pattern.supplies.needleTypes[1].brand, is (null)
		assertThat pattern.supplies.needleTypes[1].style, is (NeedleStyle.DPN)
		assertThat pattern.supplies.needleTypes[1].length.longValue(CENTIMETER), is (40L)
		assertThat pattern.supplies.needleTypes[1].needleSize.doubleValue(NEEDLE_SIZE_MM), is (3.25d)
		pattern.supplies.needleTypes[1].needles.with {
			assertThat it.size(), is (4)
			assertThat it[0].id, is ('DPNOne')
			assertThat it[0].label, is ('DP Needle 1')
			assertThat it[0].messageKey, is (null)
			// ... good enough!
		}

		assertThat pattern.supplies.needleTypes[2].id, not (null)
		assertThat pattern.supplies.needleTypes[2].brand, is (null)
		assertThat pattern.supplies.needleTypes[2].style, is (NeedleStyle.STRAIGHT)
		assertThat pattern.supplies.needleTypes[2].length, is (null)
		assertThat pattern.supplies.needleTypes[2].needleSize.longValue(NEEDLE_SIZE_MM), is (2L)
		pattern.supplies.needleTypes[2].needles.with {
			assertThat it.size(), is (1)
			assertThat it[0].id, is ('StraightOne')
			assertThat it[0].label, is ('Straight Needle 1')
			assertThat it[0].messageKey, is ('straight-needle-one')
		}
	}

	@Test
	void singleYarnWithYarnTypesNoBrandInfo() {
		com.knitml.core.model.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Yarn:
			50g of worsted weight yarn
			75yd of worsted weight
			50g (75yd) of worsted weight yarn 
			50g (75yd) of worsted weight yarn named A 

		Row: knit
		'''
		assertThat pattern.supplies.yarnTypes.size(), is (4)
		assertThat pattern.supplies.yarns.size(), is (4)
		pattern.supplies.yarnTypes[0].with {
			assertThat it.id, not (null)
			assertThat it.weight, is ('worsted')
			assertThat it.yarns[0].totalWeight.longValue(GRAM), is (50L)
		}
		pattern.supplies.yarnTypes[1].with {
			assertThat it.id, not (null)
			assertThat it.yarns[0].totalLength.longValue(YARD), is (75L)
		}
		pattern.supplies.yarnTypes[2].with {
			assertThat it.id, not (null)
			assertThat it.yarns[0].totalWeight.longValue(GRAM), is (50L)
			assertThat it.yarns[0].totalLength.longValue(YARD), is (75L)
		}
		pattern.supplies.yarnTypes[3].with {
			assertThat it.id, not (null)
			assertThat it.weight, is ('worsted')
			assertThat it.yarns[0].color, is (null)
			assertThat it.yarns[0].id, is ('A')
			assertThat it.yarns[0].symbol, is ('A')
			assertThat it.yarns[0].label, is ('A')
		}
	}
	@Test
	void singleYarnWithYarnTypesWithBrandInfo() {
		com.knitml.core.model.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Yarn:
			50g (75m) of "Lorna's Laces" (worsted weight)  
			50g (75yd) of "Lorna's Laces" #"123F" (worsted weight, ball weight: 25g, ball length: 100yd)  
			50g (75yd) of "Lorna's Laces" "Shepherd Sock" #ABCD (worsted weight, ball weight: 25g, ball length: 100yd)  
			50g (75yd) of "Lorna's Laces" "Shepherd Sock" "Vintage" #123 (worsted weight, ball weight: 50g, ball length: 100yd, thickness: 12 wpi) in Red (202) named RedYarn

		Row: knit
		'''
		assertThat pattern.supplies.yarnTypes.size(), is (4)
		assertThat pattern.supplies.yarns.size(), is (4)
		pattern.supplies.yarnTypes[0].with {
			assertThat it.id, not (null)
			assertThat it.brand, is ("Lorna's Laces")
			assertThat it.category, is (null)
			assertThat it.subcategory, is (null)
			assertThat it.yarns[0].totalLength.longValue(METER), is (75L)
		}
		pattern.supplies.yarnTypes[1].with {
			assertThat it.id, not (null)
			assertThat it.brand, is ("Lorna's Laces")
			assertThat it.catalogId, is ('123F')
			assertThat it.weight, is ('worsted')
			assertThat it.ballWeight.longValue(GRAM), is (25L)
			assertThat it.ballLength.longValue(YARD), is (100L)
			assertThat it.yarns[0].totalWeight.longValue(GRAM), is (50L)
			assertThat it.yarns[0].totalLength.longValue(YARD), is (75L)
		}
		pattern.supplies.yarnTypes[2].with {
			assertThat it.id, not (null)
			assertThat it.brand, is ("Lorna's Laces")
			assertThat it.category, is ("Shepherd Sock")
			assertThat it.subcategory, is (null)
			assertThat it.catalogId, is ('ABCD')
		}
		pattern.supplies.yarnTypes[3].with {
			assertThat it.id, not (null)
			assertThat it.brand, is ("Lorna's Laces")
			assertThat it.category, is ("Shepherd Sock")
			assertThat it.subcategory, is ("Vintage")
			assertThat it.catalogId, is ('123')
			assertThat it.thickness.longValue(WRAPS_PER_INCH), is (12L)
			assertThat it.yarns[0].color.name, is ('Red')
			assertThat it.yarns[0].color.number, is ('202')
			assertThat it.yarns[0].id, is ('RedYarn')
			assertThat it.yarns[0].symbol, is ('RedYarn')
			assertThat it.yarns[0].label, is ('RedYarn')
		}
	}

	@Test
	void multipleYarnsPerYarnType() {
		com.knitml.core.model.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Yarn:
			"Lorna's Laces"
				50g (75yd) in Red (203): A
				50g in Blue: B
				in Green: yarn C
			50g of "Purly Gates" (lace weight)

		Row: knit
		'''
		assertThat pattern.supplies.yarnTypes.size(), is (2)
		assertThat pattern.supplies.yarns.size(), is (4)
		pattern.supplies.yarnTypes[0].with {
			assertThat it.id, not (null)
			assertThat it.brand, is ("Lorna's Laces")
			assertThat it.category, is (null)
			assertThat it.subcategory, is (null)
		}
		pattern.supplies.yarnTypes[1].with {
			assertThat it.id, not (null)
			assertThat it.brand, is ("Purly Gates")
			assertThat it.weight, is ('lace')
			assertThat it.yarns[0].totalWeight.longValue(GRAM), is (50L)
			assertThat it.yarns[0].totalLength, is (null)
		}
	}

	@Test
	void yarnWithoutWeight() {
		com.knitml.core.model.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Yarn: worsted weight yarn

		Row: knit
		'''
		assertThat pattern.supplies.yarnTypes.size(), is (1)
		assertThat pattern.supplies.yarns.size(), is (1)
	}
	
	@Test
	void stitchHolders() {
		com.knitml.core.model.Pattern pattern = convert '''
		Pattern name: "Thing"
		Description: "Thing 2"
		Stitch Holders:
			Holder-A
			Holder-B "Holder B" (with key)
			Holder-C (with key 'HolderC')

		Row: knit
		'''
		assertThat pattern.supplies, not (null)
		assertThat pattern.supplies.stitchHolders.size(), is (3)
		assertThat pattern.supplies.stitchHolders[0].id, is ('Holder-A')
		assertThat pattern.supplies.stitchHolders[0].label, is (null)
		assertThat pattern.supplies.stitchHolders[0].messageKey, is (null)
		assertThat pattern.supplies.stitchHolders[1].id, is ('Holder-B')
		assertThat pattern.supplies.stitchHolders[1].label, is ('Holder B')
		assertThat pattern.supplies.stitchHolders[1].messageKey, is ('stitch-holder.Holder-B')
		assertThat pattern.supplies.stitchHolders[2].id, is ('Holder-C')
		assertThat pattern.supplies.stitchHolders[2].label, is (null)
		assertThat pattern.supplies.stitchHolders[2].messageKey, is ('HolderC')
	}


}
