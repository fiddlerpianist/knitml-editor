package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.CrossType;
import com.knitml.core.common.Side
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.BlockOperation;
import com.knitml.core.model.operations.block.DeclareFlatKnitting;
import com.knitml.core.model.operations.block.DeclareRoundKnitting;
import com.knitml.core.model.operations.inline.CrossStitches;

public class CrossStitchesConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.CrossStitches> {

	static final Log log = LogFactory.getLog(CrossStitchesConverter)

	@Override
	public CrossStitches convert(com.knitml.dsl.knittingExpressionLanguage.CrossStitches emfObject) {
		CrossStitches crossStitches = new CrossStitches()
		crossStitches.first = emfObject.first
		crossStitches.next = emfObject.next
		if (emfObject.direction.equals('front')) {
			crossStitches.type = CrossType.FRONT
		} else {
			crossStitches.type = CrossType.BACK
		}
		return crossStitches
	}
}
