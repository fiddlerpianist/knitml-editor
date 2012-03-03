package com.knitml.renderer.service.impl;

import java.io.IOException;
import java.io.Writer;

import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IMarshallingContext;
import org.jibx.runtime.JiBXException;

import com.knitml.core.model.pattern.Parameters;
import com.knitml.core.model.pattern.Pattern;
import com.knitml.engine.common.KnittingEngineException;
import com.knitml.renderer.RendererFactory;
import com.knitml.renderer.common.RenderingException;
import com.knitml.renderer.context.Options;
import com.knitml.renderer.program.RendererProgram;
import com.knitml.renderer.service.RenderingService;

public class RenderingServiceImpl implements RenderingService {

	public Pattern renderPattern(Parameters parameters, RendererFactory factory,
			Options options) throws RenderingException, KnittingEngineException {
		RendererProgram program = new RendererProgram(factory);
		//program.setVisitorFactory(new DefaultVisitorFactory());
		program.setOptions(options);
		try {
			return program.render(parameters);
		} catch (KnittingEngineException ex) {
			throw ex;
		} catch (RenderingException ex) {
			throw ex;
		} catch (Exception ex) {
			throw new RenderingException(ex);
		}
	}

	public void serializePattern(Pattern pattern, Writer writer)
			throws IOException {
		if (writer != null) {
			try {
				IBindingFactory factory = BindingDirectory
						.getFactory(Pattern.class);
				IMarshallingContext mctx = factory.createMarshallingContext();
				mctx.setOutput(writer);
				mctx.getXmlWriter().setIndentSpaces(2, null, ' ');
				mctx.getXmlWriter().writeXMLDecl("1.0", "UTF-8", null); //$NON-NLS-1$ //$NON-NLS-2$
				mctx.marshalDocument(pattern);
			} catch (JiBXException ex) {
				throw new RuntimeException(ex);
			} finally {
				if (writer != null) {
					writer.close();
				}
			}
		}
		
	}
	
}
