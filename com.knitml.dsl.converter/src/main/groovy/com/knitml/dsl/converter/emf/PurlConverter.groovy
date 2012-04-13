package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject
import com.knitml.core.common.DecreaseType
import com.knitml.core.common.Lean
import com.knitml.core.common.LoopToWork
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.InlineOperation
import com.knitml.core.model.operations.StitchNature
import com.knitml.core.model.operations.inline.Decrease
import com.knitml.core.model.operations.inline.DoubleDecrease
import com.knitml.core.model.operations.inline.MultipleDecrease
import com.knitml.core.model.operations.inline.Purl
import com.knitml.core.model.operations.inline.Repeat
import com.knitml.core.model.operations.inline.Repeat.Until
import com.knitml.dsl.converter.emf.helper.EmfHelper
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec

public class PurlConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Purl> {

	static final Log log = LogFactory.getLog(PurlConverter)
	@Inject
	protected EmfHelper emfHelper

	@Override
	public InlineOperation convert(com.knitml.dsl.knittingExpressionLanguage.Purl emfPurl) {
		def purl = new Purl(emfPurl.number, (emfPurl?.throughTrailingLoop ? LoopToWork.TRAILING: null ), emfPurl.yarnRef?.name)

		if (emfPurl.together) {
			// actually a decrease in the model
			switch (emfPurl.number) {
				case 2:
					purl = new Decrease()
					purl.type = emfPurl?.throughTrailingLoop ? DecreaseType.P2TOG_TBL: DecreaseType.P2TOG
					break;
				case 3:
					purl = new DoubleDecrease()
					purl.type = emfPurl?.throughTrailingLoop ? DecreaseType.P3TOG_TBL: DecreaseType.P3TOG
					break;
				default:
					Lean lean = emfPurl?.throughTrailingLoop ? Lean.RIGHT : Lean.LEFT
					purl = new MultipleDecrease(emfPurl.number, StitchNature.PURL, lean, emfPurl.yarnRef?.name)
					break;
			}
		}

		if (emfPurl.stitchBelow) {
			purl.rowsBelow = 1
		}

		if (emfPurl.repeat != null) {
			// handle repeats such as 'p to end'
			def repeat = emfHelper.processRepeatSpec(emfPurl.repeat)
			repeat.operations = []
			repeat.operations << purl
			return repeat
		} else {
			return purl
		}
	}
}
