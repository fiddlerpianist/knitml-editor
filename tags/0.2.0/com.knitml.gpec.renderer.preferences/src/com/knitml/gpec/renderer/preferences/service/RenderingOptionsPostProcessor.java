package com.knitml.gpec.renderer.preferences.service;

import com.knitml.renderer.context.Options;

public interface RenderingOptionsPostProcessor {
	
	Options postProcessOptions(Options originalOptions);

}
