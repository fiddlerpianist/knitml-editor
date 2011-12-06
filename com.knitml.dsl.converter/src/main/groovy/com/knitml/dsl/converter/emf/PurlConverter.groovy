package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.DecreaseType
import com.knitml.core.common.LoopToWork
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.InlineOperation
import com.knitml.core.model.directions.inline.Decrease
import com.knitml.core.model.directions.inline.DoubleDecrease
import com.knitml.core.model.directions.inline.Purl
import com.knitml.core.model.directions.inline.Repeat
import com.knitml.core.model.directions.inline.Repeat.Until
import com.knitml.dsl.converter.emf.exception.ConversionException
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec

public class PurlConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Purl> {

	static final Log log = LogFactory.getLog(PurlConverter)

	@Override
	public InlineOperation convert(com.knitml.dsl.knittingExpressionLanguage.Purl emfPurl) {
		def purl = new Purl(emfPurl.number, emfPurl.yarnRef, (emfPurl?.throughTrailingLoop ? LoopToWork.TRAILING: null ))

		if (emfPurl.together) {
			// actually a decrease in the model
			switch (emfPurl.number) {
				case 2:
					purl = new Decrease()
					purl.type = emfPurl?.throughTrailingLoop ? DecreaseType.P2TOG_TBL: DecreaseType.P2TOG
					break;
				case 3:
					purl = new DoubleDecrease()
					if (emfPurl?.throughTrailingLoop) {
						log.warn("p3tog through trailing loop not supported by the model; changing to p3tog")
					}
					purl.type = DecreaseType.P3TOG
					break;
				default:
					throw new ConversionException("p${emfPurl.number}tog not supported by the model")
					break;
			}
		}

		if (emfPurl.repeat != null) {
			// handle repeats such as 'p to end'
			RepeatSpec emfRepeat = emfPurl.repeat
			def repeat = new Repeat()
			repeat.value = emfRepeat.value
			if (emfRepeat.toEnd) {
				repeat.until = Until.END
			} else if (emfRepeat.toMarker) {
				repeat.until = Until.MARKER
			} else if (emfRepeat.beforeEnd) {
				repeat.until = Until.BEFORE_END
			} else if (emfRepeat.beforeGap) {
				repeat.until = Until.BEFORE_GAP
			} else if (emfRepeat.beforeMarker) {
				repeat.until = Until.BEFORE_MARKER
			} else if (emfRepeat.times) {
				repeat.until = Until.TIMES
			}
			repeat.operations = []
			repeat.operations << purl
			return repeat
		} else {
			return purl
		}
	}
}
