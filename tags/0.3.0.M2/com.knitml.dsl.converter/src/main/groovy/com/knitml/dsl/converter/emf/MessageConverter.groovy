package com.knitml.dsl.converter.emf

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.knitml.core.converter.DomainModelConverter
import com.knitml.core.model.directions.information.Information
import com.knitml.core.model.directions.information.Message
import com.knitml.dsl.converter.emf.exception.ConversionException

public class MessageConverter implements DomainModelConverter<com.knitml.dsl.knittingExpressionLanguage.Message> {

	static final Log log = LogFactory.getLog(MessageConverter)

	@Override
	public Information convert(com.knitml.dsl.knittingExpressionLanguage.Message emfMessage) {
		Message message = new Message()
		message.label = emfMessage.label
		message.messageKey = emfMessage.messageKey
		Information information = new Information()
		information.details << message
		return information
	}
}
