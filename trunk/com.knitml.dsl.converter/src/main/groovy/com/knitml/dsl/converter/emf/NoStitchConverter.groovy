package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.SlipDirection
import com.knitml.core.common.Wise
import com.knitml.core.common.YarnPosition
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.inline.NoStitch;
import com.knitml.core.model.operations.inline.Slip;

public class NoStitchConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.NoStitch> {

	static final Log log = LogFactory.getLog(NoStitchConverter)

	@Override
	public NoStitch convert(com.knitml.dsl.knittingExpressionLanguage.NoStitch emfNoStitch) {
		return new NoStitch(emfNoStitch.number)
	}
}
