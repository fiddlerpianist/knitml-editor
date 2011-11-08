package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.LoopToWork
import com.knitml.core.common.SlipDirection;
import com.knitml.core.common.Wise
import com.knitml.core.common.YarnPosition
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.InlineOperation
import com.knitml.core.model.directions.inline.Slip

public class SlipConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Slip> {

	static final Log log = LogFactory.getLog(SlipConverter)

	@Override
	public InlineOperation convert(com.knitml.dsl.knittingExpressionLanguage.Slip emfSlip) {
		Wise wise = null
		switch (emfSlip.wise) {
			case com.knitml.dsl.knittingExpressionLanguage.Wise.KNITWISE:
				wise = Wise.KNITWISE
				break;
			case com.knitml.dsl.knittingExpressionLanguage.Wise.PURLWISE:
				wise = Wise.PURLWISE
				break;
		}
		YarnPosition yarnPosition = null
		if (emfSlip?.yarnPosition.equals('wyib')) {
			yarnPosition = YarnPosition.BACK
		} else if (emfSlip?.yarnPosition.equals('wyif')) {
			yarnPosition = YarnPosition.FRONT
		}
		def slip = new Slip(emfSlip.number, wise, yarnPosition, emfSlip?.reverse ? SlipDirection.REVERSE : SlipDirection.FORWARD )
		return slip
	}
}
