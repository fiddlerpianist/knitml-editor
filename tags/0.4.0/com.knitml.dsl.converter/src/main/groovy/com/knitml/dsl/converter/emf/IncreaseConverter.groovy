package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject
import com.knitml.core.common.IncreaseType
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.inline.Increase;
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class IncreaseConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Increase> {

	static final Log log = LogFactory.getLog(IncreaseConverter)

	@Inject
	private EmfHelper emfHelper
	
	@Override
	public Increase convert(com.knitml.dsl.knittingExpressionLanguage.Increase emfIncrease) {
		def increase = new Increase()
		increase.type = IncreaseType.valueOf(emfIncrease.type.name)
		increase.numberOfTimes = emfIncrease.number
		if (emfIncrease.yarnRef != null) {
			increase.yarnIdRef = emfHelper.getYarn(emfIncrease.yarnRef.name)
		}
		return increase
	}
}
