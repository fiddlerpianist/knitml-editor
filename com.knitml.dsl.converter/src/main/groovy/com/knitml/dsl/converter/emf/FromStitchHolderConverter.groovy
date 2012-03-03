package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.operations.inline.FromStitchHolder;
import com.knitml.core.model.operations.inline.UsingNeedle;
import com.knitml.dsl.converter.emf.helper.EmfHelper

public class FromStitchHolderConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.FromStitchHolder> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public FromStitchHolder convert(com.knitml.dsl.knittingExpressionLanguage.FromStitchHolder emfFromStitchHolder) {
		def fromStitchHolder = new FromStitchHolder()
		fromStitchHolder.stitchHolder = emfHelper.getStitchHolder(emfFromStitchHolder.holder.name)
		fromStitchHolder.operations = emfHelper.convertOperations (emfFromStitchHolder.operations)
		return fromStitchHolder
	}
}
