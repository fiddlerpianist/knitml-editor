package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject
import com.knitml.core.common.DecreaseType
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.inline.PassPreviousStitchOver
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class PassPreviousStitchOverConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.PassPreviousStitchOver> {

	static final Log log = LogFactory.getLog(PassPreviousStitchOverConverter)

	@Inject
	private EmfHelper emfHelper
	
	@Override
	public PassPreviousStitchOver convert(com.knitml.dsl.knittingExpressionLanguage.PassPreviousStitchOver emfPpso) {
		def ppso = new PassPreviousStitchOver()
		ppso.numberOfTimes = emfPpso.number
		return ppso
	}
}
