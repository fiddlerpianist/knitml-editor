package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.common.KnittingShape
import com.knitml.core.common.RowDefinitionScope
import com.knitml.core.common.Side
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.operations.Operation;
import com.knitml.core.model.operations.block.Row;
import com.knitml.core.model.operations.inline.Repeat;
import com.knitml.dsl.converter.emf.helper.EmfHelper;

public class RepeatConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Repeat> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public Repeat convert(com.knitml.dsl.knittingExpressionLanguage.Repeat emfRepeat) {
		def repeat = emfHelper.processRepeatSpec(emfRepeat.spec)
		def obj = emfHelper.convertOperations(emfRepeat.operations)
		repeat.operations = emfHelper.convertOperations(emfRepeat.operations)
		return repeat
	}
}
