package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.google.inject.Inject;
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.block.JoinInRound
import com.knitml.core.model.directions.block.UseNeedles
import com.knitml.dsl.converter.emf.helper.EmfHelper;

public class UseSilentNeedlesConverter extends UseNeedlesConverter {

	@Override
	public UseNeedles convert(emfUseNeedles) {
		UseNeedles result = super.convert(emfUseNeedles)
		result.silentRendering = true
		return result
	}
}
