package com.knitml.dsl.converter.emf
import static com.knitml.core.units.Units.*
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import javax.measure.Measurable

import org.junit.Test

import com.knitml.core.model.operations.block.RepeatInstruction.Until
import com.knitml.core.model.operations.block.Instruction;
import com.knitml.core.model.operations.block.RepeatInstruction;
import com.knitml.core.model.pattern.Pattern;
import com.knitml.core.units.Units
import com.knitml.dsl.converter.emf.exception.LinkingException


class RepeatInstructionConverterTests extends AbstractConverterTests {

	@Test
	void repeat3MoreTimes() {
		Pattern pattern = convert '''
			Instruction needmore:
				Row 1: knit

			Repeat needmore 3 more times
		''' 
		((RepeatInstruction) pattern.directions.operations[1]).with {
			assertThat it.ref, instanceOf (Instruction)
			assertThat it.value, is (3)
			assertThat it.until, is (Until.ADDITIONAL_TIMES)
		}
	}
	@Test
	void repeatUntil3StitchesRemain() {
		Pattern pattern = convert '''
			Instruction needmore:
				Row 1: knit

			Repeat needmore until 3 sts remain
		''' 
		((RepeatInstruction) pattern.directions.operations[1]).with {
			assertThat it.ref, instanceOf (Instruction)
			assertThat it.value, is (3)
			assertThat it.until, is (Until.UNTIL_STITCHES_REMAIN)
		}
	}
	@Test
	void repeatFor3Inches() {
		Pattern pattern = convert '''
			Instruction needmore:
				Row 1: knit

			Repeat needmore for 3 inches
		''' 
		((RepeatInstruction) pattern.directions.operations[1]).with {
			assertThat it.value, instanceOf (Measurable)
			assertThat it.ref, instanceOf (Instruction)
			assertThat it.until, is (Until.UNTIL_MEASURES)
			assertThat it.value.longValue(INCH), is (3L)
		}
	}
	
	@Test(expected=LinkingException)
	void repeatInvalidInstructionName() {
		Pattern pattern = convert '''
			Instruction needmore:
				Row 1: knit	

			Repeat needless for 3 inches
		''' 
	}
	
	@Test
	void repeatFor3Point5Inches() {
		Pattern pattern = convert '''
			Instruction needmore:
				Row 1: knit

			Repeat needmore for 3.5 cm
		''' 
		((RepeatInstruction) pattern.directions.operations[1]).with {
			assertThat it.value, instanceOf (Measurable)
			assertThat it.ref, instanceOf (Instruction)
			assertThat it.until, is (Until.UNTIL_MEASURES)
			assertThat it.value.doubleValue(CENTIMETER), is (3.5d)
		}
	}
	@Test
	void repeatForDesiredLength() {
		Pattern pattern = convert '''
			Instruction needmore:
				Row 1: knit

			Repeat needmore for desired length
		''' 
		((RepeatInstruction) pattern.directions.operations[1]).with {
			assertThat it.value, is (null)
			assertThat it.ref, instanceOf (Instruction)
			assertThat it.until, is (Until.UNTIL_DESIRED_LENGTH)
		}
	}
}
