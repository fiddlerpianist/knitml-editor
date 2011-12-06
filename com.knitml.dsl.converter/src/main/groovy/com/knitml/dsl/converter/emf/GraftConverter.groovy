package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.block.GraftTogether
import com.knitml.dsl.converter.emf.helper.EmfHelper
import com.knitml.dsl.knittingExpressionLanguage.Graft

public class GraftConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Graft> {

	static final Log log = LogFactory.getLog(GraftConverter)

	@Inject
	protected EmfHelper emfHelper
	
	@Override
	public GraftTogether convert(Graft emfGraft) {
		def graftTogether = new GraftTogether()
		graftTogether.needles = []
		graftTogether.needles << emfHelper.getNeedle(emfGraft.firstNeedle.name)
		graftTogether.needles << emfHelper.getNeedle(emfGraft.secondNeedle.name)
		return graftTogether
	}
}
