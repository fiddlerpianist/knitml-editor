package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.inline.DesignateEndOfRow

public class EndOfRowConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.EndOfRow> {

	static final Log log = LogFactory.getLog(EndOfRowConverter)

	@Override
	public DesignateEndOfRow convert(com.knitml.dsl.knittingExpressionLanguage.EndOfRow emfEndOfRow) {
		return new DesignateEndOfRow()
	}
}
