package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject
import com.knitml.core.common.DecreaseType
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.inline.DoubleDecrease;
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class DoubleDecreaseConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.DoubleDecrease> {

	static final Log log = LogFactory.getLog(DoubleDecreaseConverter)

	@Inject
	private EmfHelper emfHelper
	
	@Override
	public DoubleDecrease convert(com.knitml.dsl.knittingExpressionLanguage.DoubleDecrease emfDecrease) {
		def decrease = new DoubleDecrease()
		decrease.type = DecreaseType.valueOf(emfDecrease.type.name)
		decrease.numberOfTimes = emfDecrease.number
		if (emfDecrease.yarnRef != null) {
			decrease.yarnIdRef = emfHelper.getYarn(emfDecrease.yarnRef.name)
		}
		return decrease
	}
}
