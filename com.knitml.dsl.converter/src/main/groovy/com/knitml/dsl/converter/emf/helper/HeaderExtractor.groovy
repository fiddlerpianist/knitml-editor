package com.knitml.dsl.converter.emf.helper

import static com.knitml.dsl.knittingExpressionLanguage.Language.*

import org.eclipse.emf.ecore.util.EcoreUtil

import com.google.inject.Inject
import com.knitml.core.common.NeedleStyle
import com.knitml.core.model.Identifiable
import com.knitml.core.model.header.Author
import com.knitml.core.model.header.Gauge
import com.knitml.core.model.header.GeneralInformation
import com.knitml.core.model.header.Needle
import com.knitml.core.model.header.NeedleType
import com.knitml.core.model.header.StitchHolder;
import com.knitml.core.model.header.Supplies
import com.knitml.core.units.KnittingMeasure
import com.knitml.core.units.Units
import com.knitml.dsl.knittingExpressionLanguage.Header

class HeaderExtractor {

	@Inject
	private YarnTypeExtractor yarnTypeExtractor
	@Inject
	private EmfHelper emfHelper

	GeneralInformation extractGeneralInformation(Header emfHeader) {
		def genInfo = new GeneralInformation()
		genInfo.patternName = emfHeader.patternName
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
				genInfo.gauge.stitchGauge = KnittingMeasure.valueOf(String.valueOf(valueToUse), Units.valueOf(emfGauge.stitchUnit.literal))
			}
			// row gauge
			valueToUse = emfGauge.rowValue
			if (valueToUse == null) {
				valueToUse = emfGauge.rowDecimalValue
			}
			if (valueToUse != null) {
				genInfo.gauge.rowGauge = KnittingMeasure.valueOf(String.valueOf(valueToUse), Units.valueOf(emfGauge.rowUnit.literal))
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
		Supplies supplies = new Supplies()
		if (!emfHeader.needleTypes.isEmpty()) {
			supplies.needleTypes = []
			emfHeader.needleTypes.each {
				def needleType = extractNeedleType(it)
				supplies.needles.addAll(needleType.needles)
				supplies.needleTypes << needleType
			}
		}
		if (!emfHeader.yarnTypes.isEmpty()) {
			supplies.yarnTypes = []
			emfHeader.yarnTypes.each {
				def yarnType = yarnTypeExtractor.extractYarnType(it)
				supplies.yarns.addAll(yarnType.yarns)
				supplies.yarnTypes << yarnType
			}
		}
		if (!emfHeader.stitchHolders.isEmpty()) {
			supplies.stitchHolders = []
			emfHeader.stitchHolders.each {
				supplies.stitchHolders << extractStitchHolder(it)
			}
		}
		supplies.afterPropertiesSet()
		return supplies
	}

	private NeedleType extractNeedleType(com.knitml.dsl.knittingExpressionLanguage.NeedleType it) {
		NeedleType needleType = new NeedleType()
		// brand
		needleType.brand = it.brand
		// size (i.e., diameter of the needle)
		def valueToUse = it.sizeValue
		if (valueToUse == null) {
			valueToUse = it.sizeDecimalValue
		}
		if (valueToUse == null) {
			valueToUse = it.sizeZerosValue
		}
		if (valueToUse != null) {
			needleType.needleSize = KnittingMeasure.valueOf (String.valueOf(valueToUse), Units.valueOf(it.sizeUnit.literal))
		}
		// length
		if (it.lengthValue != null) {
			needleType.length = KnittingMeasure.valueOf (String.valueOf(it.lengthValue), Units.valueOf(it.lengthUnit.literal))
		}
		// style
		needleType.style = NeedleStyle.valueOf(it.style.name)
		needleType.id = EcoreUtil.generateUUID()

		// needles defined using this type
		it.needles.each {
			//Needle needle = new Needle()
			String id = it.name
			// bi-directional relationship
			def type = needleType
			def label = it.label
			def messageKey = null
			if (it.withKey != null) {
				if (it.withKey.messageKey == null) {
					messageKey = 'needle.' + id
				} else {
					messageKey = it.withKey.messageKey
				}
			}
			Needle needle = new Needle(id, type, label, messageKey)
			emfHelper.addNeedle(needle)
			needleType.needles << needle
		}
		return needleType
	}

	private StitchHolder extractStitchHolder(com.knitml.dsl.knittingExpressionLanguage.StitchHolder it) {
		StitchHolder holder = new StitchHolder()
		holder.id = it.name
		holder.label = it.label
		def messageKey = null
		if (it.withKey != null) {
			if (it.withKey.messageKey == null) {
				messageKey = 'stitch-holder.' + holder.id
			} else {
				messageKey = it.withKey.messageKey
			}
		}
		holder.messageKey = messageKey
		emfHelper.addStitchHolder(holder)
		return holder
	}
}
