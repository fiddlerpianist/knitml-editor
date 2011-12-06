package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.inline.RemoveMarker

public class RemoveMarkerConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.RemoveMarker> {

	static final Log log = LogFactory.getLog(RemoveMarkerConverter)

	@Override
	public RemoveMarker convert(com.knitml.dsl.knittingExpressionLanguage.RemoveMarker emfRemoveMarker) {
		return new RemoveMarker()
	}
}
