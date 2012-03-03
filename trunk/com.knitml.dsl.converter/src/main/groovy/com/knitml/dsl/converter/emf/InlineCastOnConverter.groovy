package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.block.CastOn;
import com.knitml.core.model.operations.inline.InlineCastOn;

public class InlineCastOnConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.InlineCastOn> {

	static final Log log = LogFactory.getLog(InlineCastOnConverter)

	@Override
	public InlineCastOn convert(com.knitml.dsl.knittingExpressionLanguage.InlineCastOn emfInlineCastOn) {
		new InlineCastOn(emfInlineCastOn.value, emfInlineCastOn.yarnRef?.name)
	}
}
