package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.common.StitchesOnNeedle;
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.block.ArrangeStitchesOnNeedles;
import com.knitml.core.model.directions.block.UseNeedles
import com.knitml.core.model.header.Needle
import com.knitml.dsl.converter.OperationContainer
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class ArrangeStitchesConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.ArrangeStitches> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public OperationContainer convert(com.knitml.dsl.knittingExpressionLanguage.ArrangeStitches emfArrangeStitches) {
		OperationContainer result = new OperationContainer()
		// create a "use needles silently" and then "arrange stitches" sequence
		def useNeedles = new UseNeedles()
		def arrangeStitches = new ArrangeStitchesOnNeedles()
		result.addNextOperation(useNeedles)
		result.addNextOperation(arrangeStitches)
		
		useNeedles.silentRendering = true
		useNeedles.needles = []
		arrangeStitches.needles = []
		emfArrangeStitches.needleStitchCount.each {
			Needle needle = emfHelper.getNeedle(it.needle.name)
			useNeedles.needles << needle
			arrangeStitches.needles << new StitchesOnNeedle(needle, it.numberOfStitches)
		}
		
		return result
	}
}
