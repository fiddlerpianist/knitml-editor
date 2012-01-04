package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.DecreaseType
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.InlineOperation
import com.knitml.core.model.directions.inline.Decrease
import com.knitml.core.model.directions.inline.DoubleDecrease
import com.knitml.core.model.directions.inline.Repeat
import com.knitml.core.model.directions.inline.WorkEven
import com.knitml.core.model.directions.inline.Repeat.Until
import com.knitml.dsl.converter.emf.exception.ConversionException
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec

public class WorkEvenConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.WorkEven> {

	static final Log log = LogFactory.getLog(WorkEvenConverter)

	@Override
	public InlineOperation convert(com.knitml.dsl.knittingExpressionLanguage.WorkEven emfWorkEven) {
		def workEven = new WorkEven(null, emfWorkEven.yarnRef?.name)

		if (emfWorkEven.repeat != null) {
			// handle repeats such as 'k to end'
			RepeatSpec emfRepeat = emfWorkEven.repeat
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
			repeat.operations << workEven
			return repeat
		} else {
			return workEven
		}
	}
}
