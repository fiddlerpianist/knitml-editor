package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject
import com.knitml.core.common.DecreaseType
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.inline.Decrease;
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class DecreaseConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Decrease> {

	static final Log log = LogFactory.getLog(DecreaseConverter)

	@Inject
	private EmfHelper emfHelper
	
	@Override
	public Decrease convert(com.knitml.dsl.knittingExpressionLanguage.Decrease emfDecrease) {
		def decrease = new Decrease()
		decrease.type = DecreaseType.valueOf(emfDecrease.type.name)
		decrease.numberOfTimes = emfDecrease.number
		if (emfDecrease.yarnRef != null) {
			decrease.yarnIdRef = emfHelper.getYarn(emfDecrease.yarnRef.name)
		}
		return decrease
	}
}
