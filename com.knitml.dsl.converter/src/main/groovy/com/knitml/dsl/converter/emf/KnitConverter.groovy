package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.DecreaseType
import com.knitml.core.common.LoopToWork
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.InlineOperation
import com.knitml.core.model.directions.inline.Decrease
import com.knitml.core.model.directions.inline.DoubleDecrease
import com.knitml.core.model.directions.inline.Knit
import com.knitml.core.model.directions.inline.Repeat
import com.knitml.core.model.directions.inline.Repeat.Until
import com.knitml.dsl.converter.emf.exception.ConversionException
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec

public class KnitConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Knit> {

	static final Log log = LogFactory.getLog(KnitConverter)

	@Override
	public InlineOperation convert(com.knitml.dsl.knittingExpressionLanguage.Knit emfKnit) {
		def knit = new Knit(emfKnit.number, emfKnit.yarnRef, (emfKnit?.throughTrailingLoop ? LoopToWork.TRAILING: null ))

		if (emfKnit.together) {
			// actually a decrease in the model
			switch (emfKnit.number) {
				case 2:
					knit = new Decrease()
					knit.type = emfKnit?.throughTrailingLoop ? DecreaseType.K2TOG_TBL: DecreaseType.K2TOG
					break;
				case 3:
					knit = new DoubleDecrease()
					if (emfKnit?.throughTrailingLoop) {
						log.warn("k3tog through trailing loop not supported by the model; changing to k3tog")
					}
					knit.type = DecreaseType.K3TOG
					break;
				default:
					throw new ConversionException("k${emfKnit.number}tog not supported by the model")
					break;
			}
		}

		if (emfKnit.repeat != null) {
			// handle repeats such as 'k to end'
			RepeatSpec emfRepeat = emfKnit.repeat
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
			repeat.operations << knit
			return repeat
		} else {
			return knit
		}
	}
}
