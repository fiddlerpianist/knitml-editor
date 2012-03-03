package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.block.Information;
import com.knitml.core.model.operations.information.NumberOfStitches;

public class StateStitchesConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.StateStitches> {

	static final Log log = LogFactory.getLog(StateStitchesConverter)

	@Override
	public Information convert(com.knitml.dsl.knittingExpressionLanguage.StateStitches emfStateStitches) {
		NumberOfStitches numberOfStitches = new NumberOfStitches()
		numberOfStitches.number = emfStateStitches.numberToState
		Information information = new Information()
		information.details << numberOfStitches
		return information
	}
}
