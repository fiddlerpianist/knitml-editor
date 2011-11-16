package com.knitml.dsl.converter.emf

import static com.knitml.dsl.knittingExpressionLanguage.Language.*

import javax.measure.Measure

import com.knitml.core.model.header.Author
import com.knitml.core.model.header.Gauge
import com.knitml.core.model.header.GeneralInformation
import com.knitml.core.model.header.Supplies
import com.knitml.core.units.Units
import com.knitml.dsl.knittingExpressionLanguage.Header

class HeaderConverter {

	GeneralInformation extractGeneralInformation(Header emfHeader) {
		def genInfo = new GeneralInformation()
		genInfo.patternName = emfHeader.name
		genInfo.description = emfHeader.description
		genInfo.dimensions = emfHeader.dimensions
		if (emfHeader.languageCode != null) {
			genInfo.languageCode = emfHeader.languageCode
		} else {
			genInfo.languageCode = emfHeader.languageEnum.name.toLowerCase()
		}
		if (emfHeader.gauge != null)  {
			com.knitml.dsl.knittingExpressionLanguage.Gauge emfGauge = emfHeader.gauge
			genInfo.gauge = new Gauge()
			// stitch gauge
			def valueToUse = emfGauge.stitchValue
			if (valueToUse == null) {
				valueToUse = emfGauge.stitchDecimalValue
			}
			if (valueToUse != null) {
				genInfo.gauge.stitchGauge = Measure.valueOf valueToUse, Units.valueOf(emfGauge.stitchUnit.literal)
			}
			// row gauge
			valueToUse = emfGauge.rowValue
			if (valueToUse == null) {
				valueToUse = emfGauge.rowDecimalValue
			}
			if (valueToUse != null) {
				genInfo.gauge.rowGauge = Measure.valueOf valueToUse, Units.valueOf(emfGauge.rowUnit.literal)
			}
		}
		if (emfHeader.author != null)  {
			genInfo.author = new Author()
			int lastSpacePosition = emfHeader.author.lastIndexOf(' ')
			genInfo.author.firstName = emfHeader.author.substring(0, lastSpacePosition)
			genInfo.author.lastName = emfHeader.author.substring(lastSpacePosition+1)
		}
		def techniques = []
		emfHeader.techniques.each { techniques << it }
		if (techniques.size() > 0) {
			genInfo.techniques = techniques
		}
		genInfo.copyright = emfHeader.copyright
		return genInfo
	}

	Supplies extractSupplies(Header emfHeader) {
		// TODO needles, yarns, accessories
		return null
	}
}
