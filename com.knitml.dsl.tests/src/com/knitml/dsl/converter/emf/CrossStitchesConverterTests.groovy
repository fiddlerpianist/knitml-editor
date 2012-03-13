package com.knitml.dsl.converter.emf

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.CrossType
import com.knitml.core.model.operations.inline.CrossStitches
import com.knitml.core.model.operations.inline.Knit
import com.knitml.core.model.operations.inline.OperationGroup
import com.knitml.core.model.pattern.Pattern

class CrossStitchesConverterTests extends AbstractConverterTests {

	@Test
	void leftCross2And3() {
		Pattern pattern = convert 'Row: 2/3 LC [k5]'
		((OperationGroup) pattern.directions.operations[0].operations[0]).with {
			assertThat size, is (5)
			assertThat operations.size(), is (2)
			((CrossStitches)operations[0]).with {
				assertThat first, is (2)
				assertThat type, is (CrossType.FRONT)
				assertThat next, is (3)
			}
			((Knit)operations[1]).with {
				assertThat it.numberOfTimes, is (5)
			}
		}
	}
	@Test
	void rightCross2And3() {
		Pattern pattern = convert 'Row: 2/3 RC [k5]'
		((OperationGroup) pattern.directions.operations[0].operations[0]).with {
			assertThat size, is (5)
			assertThat operations.size(), is (2)
			((CrossStitches)operations[0]).with {
				assertThat first, is (2)
				assertThat type, is (CrossType.BACK)
				assertThat next, is (3)
			}
			((Knit)operations[1]).with {
				assertThat it.numberOfTimes, is (5)
			}
		}
	}
	@Test
	void leftCross2And3And4() {
		Pattern pattern = convert 'Row: 2/3/4 LC [k9]'
		((OperationGroup) pattern.directions.operations[0].operations[0]).with {
			assertThat size, is (9)
			assertThat operations.size(), is (2)
			((CrossStitches)operations[0]).with {
				assertThat first, is (2)
				assertThat skip, is (3)
				assertThat next, is (4)
				assertThat type, is (CrossType.FRONT)
				assertThat skipType, is (CrossType.BACK)
			}
			((Knit)operations[1]).with {
				assertThat it.numberOfTimes, is (9)
			}
		}
	}
	@Test
	void leftCross2And3And4MiddleStsInFront() {
		Pattern pattern = convert 'Row: 2/3/4 LRC [k9]'
		((OperationGroup) pattern.directions.operations[0].operations[0]).with {
			assertThat size, is (9)
			assertThat operations.size(), is (2)
			((CrossStitches)operations[0]).with {
				assertThat first, is (2)
				assertThat skip, is (3)
				assertThat next, is (4)
				assertThat type, is (CrossType.FRONT)
				assertThat skipType, is (CrossType.FRONT)
			}
			((Knit)operations[1]).with {
				assertThat it.numberOfTimes, is (9)
			}
		}
	}
}
