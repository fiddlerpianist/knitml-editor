package com.knitml.dsl.converter.emf

import static com.google.inject.Key.get
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.DecreaseType
import com.knitml.core.common.LoopToWork
import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.inline.Decrease
import com.knitml.core.model.directions.inline.DoubleDecrease
import com.knitml.core.model.directions.inline.Knit
import com.knitml.core.model.directions.inline.Repeat
import com.knitml.core.model.directions.inline.Repeat.Until
import com.knitml.dsl.converter.emf.exception.ConversionException

class KnitConverterTests extends AbstractConverterTests {

	@Test
	void knit() {
		Pattern pattern = convert 'Row: knit'
		((Knit) pattern.directions.operations[0].operations[0]).with {
			assertThat loopToWork, is (null)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}

	@Test
	void knit5() {
		Pattern pattern = convert 'Row: knit 5'
		((Knit) pattern.directions.operations[0].operations[0]).with {
			assertThat loopToWork, is (null)
			assertThat numberOfTimes, is (5)
			assertThat yarnIdRef, is (null)
		}
	}

	@Test
	void knit5WithA() {
		Pattern pattern = convert 'Row: knit 5 with A'
		((Knit) pattern.directions.operations[0].operations[0]).with {
			assertThat loopToWork, is (null)
			assertThat numberOfTimes, is (5)
			assertThat yarnIdRef, is ('A')
		}
	}
	
	@Test
	void k5tbl() {
		Pattern pattern = convert 'Row: k5tbl'
		((Knit) pattern.directions.operations[0].operations[0]).with {
			assertThat loopToWork, is (LoopToWork.TRAILING)
			assertThat numberOfTimes, is (5)
			assertThat yarnIdRef, is (null)
		}
	}

	@Test
	void k2tog() {
		Pattern pattern = convert 'Row: k2tog'
		((Decrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.K2TOG)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}

	@Test
	void k2togTbl() {
		Pattern pattern = convert 'Row: k2tog tbl'
		((Decrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.K2TOG_TBL)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	
	@Test
	void k3tog() {
		Pattern pattern = convert 'Row: k3tog'
		((DoubleDecrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.K3TOG)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	
	@Test
	void k2tog2Times() {
		Pattern pattern = convert 'Row: k2tog 2 times'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat until, is (Until.TIMES)
			assertThat value, is (2)
			assertThat operations[0], instanceOf (Decrease)
			assertThat operations[0].type, is (DecreaseType.K2TOG)
			assertThat operations[0].numberOfTimes, is (null)
		}
	}

	/**
	 * Not fully supported
	 */
	@Test
	void k3togTbl() {
		Pattern pattern = convert 'Row: k3tog tbl'
		((DoubleDecrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.K3TOG)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	
	
	/**
	 * Not currently supported
	 */
	@Test(expected=ConversionException)
	void k4tog() {
		Pattern pattern = convert 'Row: k4tog'
	}

	@Test
	void kToEnd() {
		Pattern pattern = convert 'Row: k to end'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat until, is (Until.END)
			assertThat operations[0], instanceOf (Knit)
		}
	}

	@Test
	void kToMarker() {
		Pattern pattern = convert 'Row: k to marker'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat until, is (Until.MARKER)
			assertThat operations[0], instanceOf (Knit)
		}
	}

	@Test
	void kTo3BeforeEnd() {
		Pattern pattern = convert 'Row: k to 3 before end'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat value, is (3)
			assertThat until, is (Until.BEFORE_END)
			assertThat operations[0], instanceOf (Knit)
		}
	}

	@Test
	void kTo3BeforeMarker() {
		Pattern pattern = convert 'Row: k to 3 before marker'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat value, is (3)
			assertThat until, is (Until.BEFORE_MARKER)
			assertThat operations[0], instanceOf (Knit)
		}
	}

	@Test
	void kTo3BeforeGap() {
		Pattern pattern = convert 'Row: k to 3 before gap'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat value, is (3)
			assertThat until, is (Until.BEFORE_GAP)
			assertThat operations[0], instanceOf (Knit)
		}
	}

	@Test
	void kTbl3Times() {
		Pattern pattern = convert 'Row: k tbl 3 times'
		((Repeat) pattern.directions.operations[0].operations[0]).with {
			assertThat value, is (3)
			assertThat until, is (Until.TIMES)
			assertThat operations[0], instanceOf (Knit)
			assertThat operations[0].loopToWork, is (LoopToWork.TRAILING)
		}
	}
}
