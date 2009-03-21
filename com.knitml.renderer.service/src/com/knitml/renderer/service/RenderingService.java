package com.knitml.renderer.service;

import com.knitml.core.common.Parameters;
import com.knitml.core.model.Pattern;
import com.knitml.renderer.RendererFactory;
import com.knitml.renderer.common.RenderingException;
import com.knitml.renderer.context.Options;

public interface RenderingService {

	public Pattern renderPattern(Parameters parameters,
			RendererFactory factory, Options options) throws RenderingException;

}
