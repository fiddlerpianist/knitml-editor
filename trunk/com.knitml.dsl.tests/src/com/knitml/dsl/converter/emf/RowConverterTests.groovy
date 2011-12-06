package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.KnittingShape
import com.knitml.core.common.RowDefinitionScope
import com.knitml.core.common.Side
import com.knitml.core.converter.DomainModelConverterLocator
import com.knitml.core.model.directions.block.Row
import com.knitml.core.model.directions.information.Message
import com.knitml.core.model.directions.information.NumberOfStitches

class RowConverterTests extends AbstractConverterTests {

	@Test
	void basicRows() {
		com.knitml.core.model.Pattern pattern = convert '''
			Pattern name:  "My Pattern" 
			Description:  "My Description" 
			Yarn: 50g of worsted weight named A

			Row 1: knit
			Row 2: knit
			Rows 3-5: knit
			Row 6: knit 
			Row: knit
			Round: knit
			Row with A: knit
		''' 
		((List<Row>) pattern.directions.operations).with {
			assertThat size(), is (7)
			// we have to define int array separately, otherwise Groovy thinks it's a list
			int[] expected = [1]
			assertThat it[0].numbers, is (expected)
			assertThat it[0].operations.size(), is (1)
			expected = [2] 
			assertThat it[1].numbers, is (expected)
			expected = [3,4,5] 
			assertThat it[2].numbers, is (expected)
			expected = [6] 
			assertThat it[3].numbers, is (expected)
			expected = null
			assertThat it[4].numbers, is (expected)
			assertThat it[5].numbers, is (expected)
			assertThat it[5].type, is (KnittingShape.ROUND)
			assertThat it[6].numbers, is (expected)
			assertThat it[6].yarnIdRef, is ('A')
		}
	}
	
	@Test
	void sideRelatedRows() {
		com.knitml.core.model.Pattern pattern = convert '''
			Row RS: knit
			Row WS: knit
			Row (state side): knit
			Row 4 and all even rows: knit
			Row 5 and all odd rows: knit
		'''
		((List<Row>) pattern.directions.operations).with {
			assertThat size(), is (5)
			assertThat it[0].side, is (Side.RIGHT)
			assertThat it[1].side, is (Side.WRONG)
			assertThat it[2].informSide, is (true)
			assertThat it[3].subsequent, is (RowDefinitionScope.EVEN)
			assertThat it[4].subsequent, is (RowDefinitionScope.ODD)
		}
	}

	
	@Test
	void shortLongNextRows() {
		com.knitml.core.model.Pattern pattern = convert '''
			Row 1: knit
			Short Row 2: knit
			Long Row 3: knit
			Short Long Row 4: knit
			Long Short Row 5: knit
			Next Short Long Row: knit
			Row (reset): knit
			Row (reset count): knit
			Row (state side): knit
			Row (state side, reset count): knit
			Row (state side, reset): knit
			Row (state side reset): knit
		''' 
		((List<Row>) pattern.directions.operations).with {
			assertThat it[0].shortRow, is (false)
			assertThat it[1].shortRow, is (true)
			assertThat it[2].longRow, is (true)
			assertThat it[3].shortRow, is (true)
			assertThat it[3].longRow, is (true)
			assertThat it[4].shortRow, is (true)
			assertThat it[4].longRow, is (true)
			assertThat it[5].shortRow, is (true)
			assertThat it[5].longRow, is (true)
			assertThat it[5].assignRowNumber, is (false)
			assertThat it[6].resetRowCount, is (true)
			assertThat it[7].resetRowCount, is (true)
			assertThat it[8].informSide, is (true)
			assertThat it[9].informSide, is (true)
			assertThat it[10].resetRowCount, is (true)
			assertThat it[10].informSide, is (true)
			assertThat it[11].resetRowCount, is (true)
			assertThat it[11].informSide, is (true)
		}
	}

	@Test
	void rowRange() {
		com.knitml.core.model.Pattern pattern = convert '''
			Rows 1-3: knit
			Rounds 4,5,6: knit
		'''
		((List<Row>) pattern.directions.operations).with {
			int[] expected = [1,2,3]
			assertThat it[0].numbers, is (expected)
			expected = [4,5,6]
			assertThat it[1].numbers, is (expected)
		}
	}

	@Test
	void rowWithStateSts() {
		com.knitml.core.model.Pattern pattern = convert '''
			Row: knit, state sts
		'''
		((Row) pattern.directions.operations[0]).with {
			assertThat followupInformation?.details, not (null)
			assertThat followupInformation.details[0], instanceOf (NumberOfStitches)
			assertThat followupInformation.details[0].number, is (null)
			assertThat followupInformation.details[0].inform, is (true)
		}
	}

	@Test
	void rowWithMessage() {
		com.knitml.core.model.Pattern pattern = convert '''
			Row: knit, "This row will look funny."
		'''
		((Row) pattern.directions.operations[0]).with {
			assertThat followupInformation?.details, not (null)
			assertThat followupInformation.details[0], instanceOf (Message)
			assertThat followupInformation.details[0].label, is ("This row will look funny.")
		}
	}

	@Test
	void rowWithState5StsAndMessage() {
		com.knitml.core.model.Pattern pattern = convert '''
			Row: knit to end, state 5 sts, "This row will look funny."
		'''
		((Row) pattern.directions.operations[0]).with {
			assertThat followupInformation?.details, not (null)
			assertThat followupInformation.details[0], instanceOf (NumberOfStitches)
			assertThat followupInformation.details[0].number, is (5)
			assertThat followupInformation.details[0].inform, is (false)
			assertThat followupInformation.details[1], instanceOf (Message)
			assertThat followupInformation.details[1].label, is ("This row will look funny.")
		}
	}
}
