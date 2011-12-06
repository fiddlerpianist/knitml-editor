package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.block.Row
import com.knitml.core.model.directions.information.Information
import com.knitml.core.model.directions.information.Message
import com.knitml.core.model.directions.information.NumberOfStitches
import com.knitml.core.model.directions.inline.UsingNeedle
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class UsingNeedleConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.UsingNeedle> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public UsingNeedle convert(com.knitml.dsl.knittingExpressionLanguage.UsingNeedle emfUsingNeedle) {
		def usingNeedle = new UsingNeedle()
		usingNeedle.needle = emfHelper.getNeedle(emfUsingNeedle.needle.name)
		usingNeedle.operations = emfHelper.convertOperations (emfUsingNeedle.operations)
		return usingNeedle
	}
}
