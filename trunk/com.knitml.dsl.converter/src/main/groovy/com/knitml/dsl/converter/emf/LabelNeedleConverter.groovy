package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.block.GraftTogether
import com.knitml.core.model.directions.block.LabelNeedle
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class LabelNeedleConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.LabelNeedle> {

	static final Log log = LogFactory.getLog(LabelNeedleConverter)

	@Inject
	protected EmfHelper emfHelper

	@Override
	public LabelNeedle convert(com.knitml.dsl.knittingExpressionLanguage.LabelNeedle emfLabelNeedle) {
		def labelNeedle = new LabelNeedle()
		labelNeedle.label = emfLabelNeedle.label
		labelNeedle.needle = emfHelper.getNeedle(emfLabelNeedle.needle.name)
		if (emfLabelNeedle.withKey != null) {
			labelNeedle.messageKey = emfLabelNeedle.withKey.messageKey
		}
		return labelNeedle
	}
}
