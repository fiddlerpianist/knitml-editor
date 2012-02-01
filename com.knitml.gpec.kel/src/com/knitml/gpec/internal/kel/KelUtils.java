package com.knitml.gpec.internal.kel;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.osgi.framework.Bundle;


public class KelUtils {
	
	private static final KelUtils singleton = new KelUtils();

	public static KelUtils getDefault() {
		return singleton;
	}
	
	private KelUtils() {
		super();
	}
	
	public Bundle getBundle() {
		return KelPlugin.getDefault().getBundle();
	}
	
	public URL getResource(IPath path) {
		return FileLocator.find(getBundle(), path, null);
	}

	public InputStream openStream(IPath path) throws IOException {
		return FileLocator.openStream(getBundle(), path, false);
	}
}
