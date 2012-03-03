package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.Wise
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.block.PickUpStitches;

public class PickUpStitchesConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.PickUpStitches> {

	static final Log log = LogFactory.getLog(PickUpStitchesConverter)

	@Override
	public PickUpStitches convert(com.knitml.dsl.knittingExpressionLanguage.PickUpStitches emfPickUpStitches) {
		def wise = Wise.KNITWISE
		if (emfPickUpStitches?.wise == com.knitml.dsl.knittingExpressionLanguage.Wise.PURLWISE) {
			wise = Wise.PURLWISE
		}
		def yarnRefId = null
		if (emfPickUpStitches.yarnRef != null) {
			yarnRefId = emfPickUpStitches.yarnRef.name
		}
		return new PickUpStitches(emfPickUpStitches.number, yarnRefId, wise)
	}
}
