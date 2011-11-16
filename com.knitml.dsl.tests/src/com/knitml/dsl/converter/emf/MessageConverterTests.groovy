package com.knitml.dsl.converter.emf
import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test

import com.knitml.core.model.Pattern
import com.knitml.core.model.directions.information.Information
import com.knitml.core.model.directions.information.Message

class MessageConverterTests extends AbstractConverterTests {

	@Test
	void message() {
		Pattern pattern = convert '''
			"The next row will look funny."
		'''
		((Information) pattern.directions.operations[0]).with {
			assertThat details[0], instanceOf (Message)
			assertThat details[0].label, is ("The next row will look funny.")
			assertThat details[0].messageKey, is (null)
		}
	}

	@Test
	void messageUseKeyQuoted() {
		Pattern pattern = convert '''
			"The next row will look funny." (use key 'msg-1')
		'''
		((Information) pattern.directions.operations[0]).with {
			assertThat details[0], instanceOf (Message)
			assertThat details[0].label, is ("The next row will look funny.")
			assertThat details[0].messageKey, is ("msg-1")
		}
	}
	
	@Test
	void messageUseKeyAsId() {
		Pattern pattern = convert '''
			"The next row will look funny." (use key messageOne)
		'''
		((Information) pattern.directions.operations[0]).with {
			assertThat details[0], instanceOf (Message)
			assertThat details[0].label, is ("The next row will look funny.")
			assertThat details[0].messageKey, is ("messageOne")
		}
	}
}
