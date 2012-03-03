package com.knitml.dsl.converter.emf

import static com.google.inject.Key.get
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.common.DecreaseType
import com.knitml.core.common.LoopToWork
import com.knitml.core.model.operations.inline.Repeat.Until
import com.knitml.core.model.operations.inline.Decrease;
import com.knitml.core.model.operations.inline.DoubleDecrease;
import com.knitml.core.model.operations.inline.Knit;
import com.knitml.core.model.operations.inline.PassPreviousStitchOver;
import com.knitml.core.model.operations.inline.Repeat;
import com.knitml.core.model.pattern.Pattern;
import com.knitml.dsl.converter.emf.exception.ConversionException

class DecreaseConverterTests extends AbstractConverterTests {

	@Test
	void ssk() {
		Pattern pattern = convert 'Row: ssk'
		((Decrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.SSK)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	@Test
	void ssk3TimesWithA() {
		Pattern pattern = convert '''
			Pattern name: "Thing"
			Description: "Thing 2"
			Yarn: 50g of sport weight yarn named A
					
			Row: ssk 3 times with A
		'''
		((Decrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.SSK)
			assertThat numberOfTimes, is (3)
			assertThat yarnIdRef, is ('A')
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
	void ssp() {
		Pattern pattern = convert 'Row: ssp'
		((Decrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.SSP)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	@Test
	void p2tog() {
		Pattern pattern = convert 'Row: p2tog'
		((Decrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.P2TOG)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	@Test
	void skp() {
		Pattern pattern = convert 'Row: skp'
		((Decrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.SKP)
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
	void p2togTbl() {
		Pattern pattern = convert 'Row: p2tog tbl'
		((Decrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.P2TOG_TBL)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	@Test
	void sssk() {
		Pattern pattern = convert 'Row: sssk'
		((DoubleDecrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.SSSK)
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
	void p3tog() {
		Pattern pattern = convert 'Row: p3tog'
		((DoubleDecrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.P3TOG)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	
	@Test
	void cdd() {
		Pattern pattern = convert 'Row: cdd'
		((DoubleDecrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.CDD)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	@Test
	void s2kp() {
		Pattern pattern = convert 'Row: s2kp'
		((DoubleDecrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.CDD)
			assertThat numberOfTimes, is (null)
			assertThat yarnIdRef, is (null)
		}
	}
	@Test
	void sk2p() {
		Pattern pattern = convert 'Row: sk2p'
		((DoubleDecrease) pattern.directions.operations[0].operations[0]).with {
			assertThat type, is (DecreaseType.SK2P)
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
	 * Not currently supported
	 */
	@Test(expected=ConversionException)
	void k4tog() {
		Pattern pattern = convert 'Row: k4tog'
	}

	@Test
	void ppso() {
		Pattern pattern = convert 'Row: ppso'
		((PassPreviousStitchOver) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfTimes, is (null)
		}
	}

	@Test
	void ppso3Times() {
		Pattern pattern = convert 'Row: ppso 3 times'
		((PassPreviousStitchOver) pattern.directions.operations[0].operations[0]).with {
			assertThat numberOfTimes, is (3)
		}
	}
}
