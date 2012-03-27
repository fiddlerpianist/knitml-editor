package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject
import com.knitml.core.common.IncreaseType
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.inline.IncreaseIntoNextStitch
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class IncreaseIntoNextStitchConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.IncreaseIntoNextStitch> {

	static final Log log = LogFactory.getLog(IncreaseIntoNextStitchConverter)

	@Inject
	private EmfHelper emfHelper
	
	@Override
	public IncreaseIntoNextStitch convert(com.knitml.dsl.knittingExpressionLanguage.IncreaseIntoNextStitch emfIncrease) {
		def increase = new IncreaseIntoNextStitch()
		if (emfIncrease.yarnRef != null) {
			increase.yarnIdRef = emfHelper.getYarn(emfIncrease.yarnRef.name)
		}
		increase.operations = emfHelper.convertOperations (emfIncrease.operations)
		return increase
	}
}
