package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.Wise
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.inline.BindOff
import com.knitml.core.model.directions.inline.BindOffAll
import com.knitml.core.model.directions.inline.PlaceMarker

public class PlaceMarkerConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.PlaceMarker> {

	static final Log log = LogFactory.getLog(PlaceMarkerConverter)

	@Override
	public PlaceMarker convert(com.knitml.dsl.knittingExpressionLanguage.PlaceMarker emfPlaceMarker) {
		return new PlaceMarker()
	}
}
