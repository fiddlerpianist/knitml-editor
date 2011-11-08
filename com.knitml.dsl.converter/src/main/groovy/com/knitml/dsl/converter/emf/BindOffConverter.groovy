package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.common.Wise
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.InlineOperation
import com.knitml.core.model.directions.inline.BindOff
import com.knitml.core.model.directions.inline.BindOffAll

public class BindOffConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.BindOff> {

	static final Log log = LogFactory.getLog(BindOffConverter)

	@Override
	public InlineOperation convert(com.knitml.dsl.knittingExpressionLanguage.BindOff emfBindOff) {
		def wise = null
		if (emfBindOff?.wise == com.knitml.dsl.knittingExpressionLanguage.Wise.KNITWISE) {
			wise = Wise.KNITWISE
		} else if (emfBindOff?.wise == com.knitml.dsl.knittingExpressionLanguage.Wise.PURLWISE) {
			wise = Wise.PURLWISE
		}
		if (emfBindOff.all) {
			return new BindOffAll(wise, emfBindOff.yarnRef, true)
		} else {
			return new BindOff(emfBindOff.value, wise, emfBindOff.yarnRef)
		}
	}
}
