package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

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
import com.knitml.dsl.knittingExpressionLanguage.RepeatSpec
import com.knitml.dsl.knittingExpressionLanguage.SlipSlipDecrease

public class SlipSlipDecreaseConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.SlipSlipDecrease> {

	static final Log log = LogFactory.getLog(SlipSlipDecrease)

	@Override
	public InlineOperation convert(com.knitml.dsl.knittingExpressionLanguage.SlipSlipDecrease emfDecrease) {
		boolean isPurl = emfDecrease.nature.equals("p")
		Lean lean = isPurl ? Lean.RIGHT : Lean.LEFT
		return new MultipleDecrease(emfDecrease.number, isPurl ? StitchNature.PURL : StitchNature.KNIT, lean, emfDecrease.yarnRef?.name)
	}
}
