package com.knitml.dsl.ui.editor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;

import com.google.inject.Inject;
import com.knitml.core.model.Pattern;
import com.knitml.renderer.service.RenderingService;

public class WriteKnitMLJob extends WorkspaceJob {

	private IResource resource;
	private Pattern pattern;
	@Inject
	private RenderingService renderingService;

	public WriteKnitMLJob(IResource resource, Pattern pattern) {
		super("Write KnitML result");
		this.resource = resource;
		this.pattern = pattern;
	}

	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor)
			throws CoreException {
		try {
			String shortName = resource.getName().substring(0,
					resource.getName().lastIndexOf('.'));
			IFile newKnitMLFile = resource.getParent().getFile(
					new Path(shortName + ".xml"));
			// PipedWriter writer = new PipedWriter();
			// PipedReader reader = new PipedReader(writer);
			Writer writer = new StringWriter();
			renderingService.serializePattern(pattern, writer);
			InputStream is = new ByteArrayInputStream(writer.toString()
					.getBytes());
			if (newKnitMLFile.exists()) {
				newKnitMLFile.delete(true, true, monitor);
			}
			newKnitMLFile.create(is, true, monitor);
			// newKnitMLFile.appendContents(new
			// InputStream(writer.toString().getBytes()), true, true, null);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		return Status.OK_STATUS;
	}
}
