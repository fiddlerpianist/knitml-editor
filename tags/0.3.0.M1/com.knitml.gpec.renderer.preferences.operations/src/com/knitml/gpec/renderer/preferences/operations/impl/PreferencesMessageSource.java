package com.knitml.gpec.renderer.preferences.operations.impl;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.prefs.Preferences;
import org.springframework.context.support.AbstractMessageSource;

public class PreferencesMessageSource extends AbstractMessageSource {

	private Preferences preferences;
	private Map<String, Map<Locale, MessageFormat>> codeMap = new HashMap<String, Map<Locale, MessageFormat>>();

	public PreferencesMessageSource(Preferences preferences) {
		this.preferences = preferences;
	}

	@Override
	protected MessageFormat resolveCode(String code, Locale locale) {
		synchronized (this.codeMap) {
			Map<Locale, MessageFormat> localeMap = null;
			localeMap = codeMap.get(code);
			if (localeMap != null) {
				MessageFormat result = localeMap.get(locale);
				if (result != null) {
					return result;
				}
			}

			// ignore locale here, since it should be accounted for in the preferences
			String msg = preferences.get(code, null);
			if (msg != null) {
				if (localeMap == null) {
					localeMap = new HashMap<Locale, MessageFormat>();
					codeMap.put(code, localeMap);
				}
				MessageFormat result = createMessageFormat(msg, locale);
				localeMap.put(locale, result);
				return result;
			}
			return null;
		}
	}

}
