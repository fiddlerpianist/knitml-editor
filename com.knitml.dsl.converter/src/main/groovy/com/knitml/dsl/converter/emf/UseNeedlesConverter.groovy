package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.block.UseNeedles
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class UseNeedlesConverter implements DomainModelConverter<EObject> {

	static final Log log = LogFactory.getLog(UseNeedlesConverter)

	@Inject
	protected EmfHelper emfHelper
	
	@Override
	public UseNeedles convert(emfUseNeedles) {
		def useNeedles = new UseNeedles()
		useNeedles.needles = []
		emfUseNeedles.needles.each {
			useNeedles.needles << emfHelper.getNeedle(it.name)
		}
		return useNeedles
	}
}
