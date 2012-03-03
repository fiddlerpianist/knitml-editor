package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.Wise
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.inline.BindOff;
import com.knitml.core.model.operations.inline.InlinePickUpStitches;

public class InlinePickUpStitchesConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.InlinePickUpStitches> {

	static final Log log = LogFactory.getLog(InlinePickUpStitchesConverter)

	@Override
	public InlinePickUpStitches convert(com.knitml.dsl.knittingExpressionLanguage.InlinePickUpStitches emfInlinePickUpStitches) {
		def wise = Wise.KNITWISE
		if (emfInlinePickUpStitches?.wise == com.knitml.dsl.knittingExpressionLanguage.Wise.PURLWISE) {
			wise = Wise.PURLWISE
		}
		def yarnRefId = null
		if (emfInlinePickUpStitches.yarnRef != null) {
			yarnRefId = emfInlinePickUpStitches.yarnRef.name
		}
		return new InlinePickUpStitches(emfInlinePickUpStitches.number, yarnRefId, wise)
	}
}
