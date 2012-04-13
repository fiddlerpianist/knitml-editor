package com.knitml.dsl.ui.editor;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IPath;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class WorkspaceContainerResourceLoader extends DefaultResourceLoader {

	private IContainer container;
	
	public WorkspaceContainerResourceLoader(IContainer container) {
		this.container = container;
	}
	
	@Override
	protected Resource getResourceByPath(String path) {
		if (path != null && path.startsWith("/")) {
			path = path.substring(1);
		}
		IPath baseLocation = container.getLocation();
		if (baseLocation == null) {
			return null;
		}
		IPath finalPath = baseLocation.append(path);
		return new FileSystemResource(finalPath.toFile());
	}

}
