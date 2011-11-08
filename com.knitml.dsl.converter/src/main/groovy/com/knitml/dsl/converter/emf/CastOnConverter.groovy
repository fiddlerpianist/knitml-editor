package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.Wise
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.block.CastOn
import com.knitml.core.model.directions.inline.BindOff
import com.knitml.core.model.directions.inline.BindOffAll

public class CastOnConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.CastOn> {

	static final Log log = LogFactory.getLog(CastOnConverter)

	@Override
	public CastOn convert(com.knitml.dsl.knittingExpressionLanguage.CastOn emfCastOn) {
		def castOn = new CastOn(emfCastOn.value, emfCastOn.yarnRef, emfCastOn.style)
		if (emfCastOn.countAsRow) {
			castOn.countAsRow = emfCastOn.countAsRow
		}
		return castOn
	}
}
