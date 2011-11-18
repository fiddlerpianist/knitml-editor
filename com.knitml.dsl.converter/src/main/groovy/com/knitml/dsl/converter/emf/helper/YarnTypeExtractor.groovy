package com.knitml.dsl.converter.emf.helper

import static com.knitml.dsl.knittingExpressionLanguage.Language.*

import org.eclipse.emf.ecore.util.EcoreUtil

import com.knitml.core.model.header.Color
import com.knitml.core.model.header.Yarn
import com.knitml.core.model.header.YarnType
import com.knitml.core.units.KnittingMeasure
import com.knitml.core.units.Units

class YarnTypeExtractor {

	YarnType extractSingleYarnWithYarnType(com.knitml.dsl.knittingExpressionLanguage.SingleYarnWithYarnType it) {
		YarnType yarnType = new YarnType()
		yarnType.id = EcoreUtil.generateUUID()
		yarnType.brand = it.brand
		yarnType.category = it.category
		yarnType.subcategory = it.subcategory
		yarnType.catalogId = it.catalogNumber != null ? it.catalogNumber : it.catalogId
		yarnType.weight = it.weight
		if (it.ballLengthValue != null) {
			yarnType.ballLength = KnittingMeasure.valueOf it.ballLengthValue, Units.valueOf(it.ballLengthUnit.literal)
		}
		if (it.ballWeightValue != null) {
			yarnType.ballWeight = KnittingMeasure.valueOf it.ballWeightValue, Units.valueOf(it.ballWeightUnit.literal)
		}
		if (it.thicknessValue != null) {
			yarnType.thickness = KnittingMeasure.valueOf it.thicknessValue, Units.valueOf(it.thicknessUnit.literal)
		}
		// create new yarn and link it to yarn type
		Yarn yarn = new Yarn()
		yarnType.yarns << yarn
		yarn.yarnType = yarnType
		
		yarn.id = it.name
		yarn.symbol = it.name
		yarn.label = it.name 
		if (it.lengthValue != null) {
			yarn.totalLength = KnittingMeasure.valueOf it.lengthValue, Units.valueOf(it.lengthUnit.literal) 
		}
		if (it.weightValue != null) {
			yarn.totalWeight = KnittingMeasure.valueOf it.weightValue, Units.valueOf(it.weightUnit.literal) 
		}
		if (it.color != null) {
			yarn.color = new Color()
			yarn.color.name = it.color.colorName
			yarn.color.number = it.color.colorNumber != null ? it.color.colorNumber : null
		}
		return yarnType
	}
}
