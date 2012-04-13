package com.knitml.dsl.converter.emf.helper

import com.knitml.dsl.knittingExpressionLanguage.WeightAndLengthSpec;

import static com.knitml.dsl.knittingExpressionLanguage.Language.*

import org.eclipse.emf.ecore.util.EcoreUtil

import com.google.inject.Inject
import com.knitml.core.model.common.Color;
import com.knitml.core.model.common.Yarn;
import com.knitml.core.model.common.YarnType;
import com.knitml.core.units.KnittingMeasure
import com.knitml.core.units.Units
import com.knitml.dsl.knittingExpressionLanguage.WeightAndLengthSpec
import com.knitml.dsl.knittingExpressionLanguage.YarnColor
import com.knitml.dsl.knittingExpressionLanguage.YarnTypeSpec

class YarnTypeExtractor {

	@Inject
	private EmfHelper emfHelper
	
	YarnType extractYarnType(com.knitml.dsl.knittingExpressionLanguage.Yarn emfYarnType) {
		YarnType yarnType = createYarnType(emfYarnType.yarnTypeSpec)
		// create new yarn and link it to yarn type
		Yarn yarn = createYarn(emfYarnType)
		yarnType.yarns << yarn
		yarn.yarnType = yarnType
		yarnType.afterPropertiesSet()
		return yarnType
	}

	YarnType extractYarnType(com.knitml.dsl.knittingExpressionLanguage.MultipleYarnsWithYarnType emfYarnType) {
		YarnType yarnType = createYarnType(emfYarnType.yarnTypeSpec)
		if (emfYarnType.yarns.isEmpty()) {
			// create an empty yarn with no identifying information
			Yarn yarn = new Yarn()
			yarnType.yarns << yarn
			yarn.yarnType = yarnType
		} else {
			// create new yarn and link it to yarn type
			emfYarnType.yarns.each {
				Yarn yarn = createYarn(it)
				yarnType.yarns << yarn
				yarn.yarnType = yarnType
			}
		}
		yarnType.afterPropertiesSet()
		return yarnType
	}

	private Yarn createYarn(yarnOrYarnType) { // it is either a SingleYarnWithYarnType or a Yarn
		Yarn yarn = new Yarn()
		yarn.id = yarnOrYarnType.name
		yarn.symbol = yarn.id
		yarn.label = yarn.id
		if (yarn.id == null) {
			yarn.id = EcoreUtil.generateUUID()
		}
		((WeightAndLengthSpec)(yarnOrYarnType.quantitySpec))?.with {
			if (lengthValue != null) {
				yarn.totalLength = KnittingMeasure.valueOf(String.valueOf(lengthValue), Units.valueOf(lengthUnit.literal))
			}
			if (weightValue != null) {
				yarn.totalWeight = KnittingMeasure.valueOf(String.valueOf(weightValue), Units.valueOf(weightUnit.literal))
			}
		}
		((YarnColor)(yarnOrYarnType.color))?.with {
			yarn.color = new Color()
			yarn.color.name = colorName
			yarn.color.number = colorNumber != null ? colorNumber : null
		}
		emfHelper.addYarn(yarn)
		return yarn
	}

	private YarnType createYarnType(YarnTypeSpec it) {
		YarnType yarnType = new YarnType()
		yarnType.id = EcoreUtil.generateUUID()
		yarnType.brand = it.brand
		yarnType.category = it.category
		yarnType.subcategory = it.subcategory
		yarnType.catalogId = it.catalogNumber != null ? it.catalogNumber : it.catalogId
		yarnType.weight = it.weight
		if (it.ballLengthValue != null) {
			yarnType.ballLength = KnittingMeasure.valueOf(String.valueOf(it.ballLengthValue), Units.valueOf(it.ballLengthUnit.literal))
		}
		if (it.ballWeightValue != null) {
			yarnType.ballWeight = KnittingMeasure.valueOf(String.valueOf(it.ballWeightValue), Units.valueOf(it.ballWeightUnit.literal))
		}
		if (it.thicknessValue != null) {
			yarnType.thickness = KnittingMeasure.valueOf(String.valueOf(it.thicknessValue), Units.valueOf(it.thicknessUnit.literal))
		}
		return yarnType
	}
}
