package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject;
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.operations.block.UseNeedles
import com.knitml.dsl.converter.emf.helper.EmfHelper;
import com.knitml.dsl.knittingExpressionLanguage.UseSilentNeedles

public class UseSilentNeedlesConverter implements DomainModelConverter<UseSilentNeedles>  {

	@Inject
	protected EmfHelper emfHelper
	
	public UseNeedles convert(UseSilentNeedles emfUseNeedles) {
		def useNeedles = new UseNeedles()
		useNeedles.needles = []
		emfUseNeedles.needles.each {
			useNeedles.needles << emfHelper.getNeedle(it.name)
		}
		useNeedles.silentRendering = true
		return useNeedles
	}
}
