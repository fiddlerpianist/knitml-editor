package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject;
import com.knitml.core.common.DecreaseType
import com.knitml.core.common.Lean
import com.knitml.core.common.LoopToWork
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.InlineOperation
import com.knitml.core.model.operations.StitchNature
import com.knitml.core.model.operations.inline.Decrease
import com.knitml.core.model.operations.inline.DoubleDecrease
import com.knitml.core.model.operations.inline.Knit
import com.knitml.core.model.operations.inline.MultipleDecrease
import com.knitml.core.model.operations.inline.Repeat
import com.knitml.core.model.operations.inline.Repeat.Until
import com.knitml.dsl.converter.emf.helper.EmfHelper;
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec

public class KnitConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Knit> {

	static final Log log = LogFactory.getLog(KnitConverter)
	@Inject
	protected EmfHelper emfHelper

	@Override
	public InlineOperation convert(com.knitml.dsl.knittingExpressionLanguage.Knit emfKnit) {
		def knit = new Knit(emfKnit.number, (emfKnit?.throughTrailingLoop ? LoopToWork.TRAILING: null ), emfKnit.yarnRef?.name)

		if (emfKnit.together) {
			// actually a decrease in the model
			switch (emfKnit.number) {
				case 2:
					knit = new Decrease()
					knit.type = emfKnit?.throughTrailingLoop ? DecreaseType.K2TOG_TBL: DecreaseType.K2TOG
					break;
				case 3:
					knit = new DoubleDecrease()
					knit.type = emfKnit?.throughTrailingLoop ? DecreaseType.K3TOG_TBL: DecreaseType.K3TOG
					break;
				default:
					Lean lean = emfKnit?.throughTrailingLoop ? Lean.LEFT : Lean.RIGHT
					knit = new MultipleDecrease(emfKnit.number, StitchNature.KNIT, lean, emfKnit.yarnRef?.name)
					break;
			}
		}

		if (emfKnit.stitchBelow) {
			knit.rowsBelow = 1
		}

		if (emfKnit.repeat != null) {
			// handle repeats such as 'k to end'
			def repeat = emfHelper.processRepeatSpec(emfKnit.repeat)
			repeat.operations = []
			repeat.operations << knit
			return repeat
		} else {
			return knit
		}
	}
}
