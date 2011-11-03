package com.knitml.dsl.converter.emf

import org.eclipse.emf.ecore.EObject

import com.google.inject.Inject
import com.knitml.core.common.KnittingShape
import com.knitml.core.common.RowDefinitionScope
import com.knitml.core.common.Side
import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.Operation
import com.knitml.core.model.directions.block.Row

public class RowConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Row> {

	@Inject
	protected DomainModelConverterLocator<EObject> locator

	protected List<Operation> convertChildren(List emfOperations) {
		List<Operation> operations = []
		for (def emfOperation : emfOperations) {
			Operation operation = locator.locateConverter(emfOperation).convert(emfOperation)
			operations << operation
		}
		return operations
	}
	
	@Override
	public com.knitml.core.model.directions.block.Row convert(com.knitml.dsl.knittingExpressionLanguage.Row emfRow) {
		def row = new Row()
		if (!emfRow.number.empty) {
			row.numbers = emfRow.number
		} else if (emfRow.range != null) {
			int min = emfRow.range.min
			int max = emfRow.range.max
			if (min <= max) {
				def len = max-min+1
				int[] rowNumbers = new int[len]
				for (int i = 0; i < len; i++) {
					rowNumbers[i] = min + i
				}
				row.numbers = rowNumbers
			}
		}
		if (emfRow.label != null) {
			if (emfRow.label.toLowerCase().startsWith('round')) {
				row.type = KnittingShape.ROUND
			}
		}
		
		row.resetRowCount = emfRow.reset
		row.shortRow = emfRow.shortRow
		row.longRow = emfRow.longRow
		if (emfRow.nextRow) {
			row.assignRowNumber = false
		}
		
		if (emfRow.side?.toLowerCase().equals('ws')) {
			row.side = Side.WRONG
		} else if (emfRow.side?.toLowerCase().equals('rs')) {
			row.side = Side.RIGHT
		}
		if (emfRow.subsequent?.equals('even')) {
			row.subsequent = RowDefinitionScope.EVEN
		} else	if (emfRow.subsequent?.equals('odd')) {
			row.subsequent = RowDefinitionScope.ODD
		}
		row.informSide = emfRow.inform
		row.yarnIdRef = emfRow.yarnRef
		row.operations = convertChildren (emfRow.operations)
		return row
	}
}
