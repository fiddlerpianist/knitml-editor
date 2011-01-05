package com.knitml.renderer.service.impl;

import com.knitml.core.common.Parameters;
import com.knitml.core.model.Pattern;
import com.knitml.renderer.RendererFactory;
import com.knitml.renderer.common.RenderingException;
import com.knitml.renderer.context.Options;
import com.knitml.renderer.program.RendererProgram;
import com.knitml.renderer.service.RenderingService;

public class RenderingServiceImpl implements RenderingService {

	public Pattern renderPattern(Parameters parameters, RendererFactory factory,
			Options options) throws RenderingException {
		RendererProgram program = new RendererProgram(factory);
		program.setOptions(options);
		try {
			return program.render(parameters);
		} catch (RenderingException ex) {
			throw ex;
		} catch (Exception ex) {
			throw new RenderingException(ex);
		}
	}
	
}