package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.common.KnittingShape
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.operations.block.Instruction;
import com.knitml.core.model.pattern.InstructionGroup;
import com.knitml.dsl.converter.emf.helper.EmfHelper;

/**
 * This converter is generic so that subclasses can extend it.
 * @author Jonathan Whitall (fiddlerpianist@gmail.com)
 */
public class InstructionGroupConverter implements DomainModelConverter<EObject> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator
	@Inject
	protected EmfHelper emfHelper

	@Override
	public InstructionGroup convert(EObject emfInstructionGroup) {
		def id = emfInstructionGroup.name
		def label = emfInstructionGroup.label
		def messageKey = null
		if (emfInstructionGroup.withKey != null) {
			if (emfInstructionGroup.withKey.messageKey == null) {
				// can specify "with key" without the key,
				// which defaults to the literal 'instruction.'
				// with the supplied ID
				messageKey = 'instruction-group.' + emfInstructionGroup.name
			} else {
				messageKey = emfInstructionGroup.withKey.messageKey
			}
		}
		def resetRowCount = emfInstructionGroup.reset
		def operations = emfHelper.convertOperations (emfInstructionGroup.operations)
		return new InstructionGroup(id, label, messageKey, resetRowCount, operations)
	}
}
