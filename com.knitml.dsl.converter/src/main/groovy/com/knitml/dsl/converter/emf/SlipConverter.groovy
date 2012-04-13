package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject;
import com.knitml.core.common.LoopToWork
import com.knitml.core.common.SlipDirection;
import com.knitml.core.common.Wise
import com.knitml.core.common.YarnPosition
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.InlineOperation;
import com.knitml.core.model.operations.inline.Slip;
import com.knitml.core.model.operations.inline.SlipToStitchHolder;
import com.knitml.dsl.converter.emf.helper.EmfHelper;

public class SlipConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Slip> {

	static final Log log = LogFactory.getLog(SlipConverter)

	@Inject
	protected EmfHelper emfHelper
	
	@Override
	public InlineOperation convert(com.knitml.dsl.knittingExpressionLanguage.Slip emfSlip) {
		if (emfSlip.holder != null) {
			return convertSlipToHolder(emfSlip)
		}
		
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
	
	protected SlipToStitchHolder convertSlipToHolder(com.knitml.dsl.knittingExpressionLanguage.Slip emfSlip) {
		def slip = new SlipToStitchHolder()
		slip.numberOfStitches = emfSlip.number
		slip.stitchHolder = emfHelper.getStitchHolder(emfSlip.holder.name)
		return slip
	}
}
