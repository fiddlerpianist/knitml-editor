package com.knitml.renderer.service;

import java.io.IOException;
import java.io.Writer;

import com.google.inject.Module;
import com.knitml.core.model.pattern.Parameters;
import com.knitml.core.model.pattern.Pattern;
import com.knitml.renderer.common.RenderingException;
import com.knitml.renderer.context.Options;

public interface RenderingService {

	public Pattern renderPattern(Parameters parameters,
			Module configurationModule, Options options) throws RenderingException;

	public void serializePattern(Pattern pattern, Writer writer) throws IOException;
}
