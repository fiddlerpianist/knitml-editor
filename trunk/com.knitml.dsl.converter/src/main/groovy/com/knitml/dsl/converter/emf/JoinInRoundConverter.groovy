package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.SlipDirection
import com.knitml.core.common.Wise
import com.knitml.core.common.YarnPosition
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.block.JoinInRound
import com.knitml.core.model.directions.inline.Slip

public class JoinInRoundConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.JoinInRound> {

	static final Log log = LogFactory.getLog(JoinInRoundConverter)

	@Override
	public JoinInRound convert(com.knitml.dsl.knittingExpressionLanguage.JoinInRound emfJoin) {
		return new JoinInRound()
	}
}
