package com.knitml.dsl.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.ProjectFactory;
import org.eclipse.xtext.ui.wizard.AbstractProjectCreator;

import com.knitml.gpec.builder.KnitmlBuilder;
import com.knitml.gpec.builder.KnitmlNature;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class KnittingExpressionLanguageProjectAndPatternCreator extends
		AbstractProjectCreator {

	@Inject
	private Provider<ProjectFactory> projectFactoryProvider;

	@Override
	protected ProjectFactory createProjectFactory() {
		return projectFactoryProvider.get();
	}

	@Override
	protected KnittingExpressionLanguageProjectInfo getProjectInfo() {
		return (KnittingExpressionLanguageProjectInfo) super.getProjectInfo();
	}

	protected String getModelFolderName() {
		return "/" + getProjectInfo().getProjectName();
	}

	protected IFile getModelFile(IProject project) throws CoreException {
		final String expectedExtension = getPrimaryModelFileExtension();
		final IFile[] result = new IFile[1];
		project.accept(new IResourceVisitor() {
			public boolean visit(IResource resource) throws CoreException {
				if (IResource.FILE == resource.getType() && expectedExtension.equals(resource.getFileExtension())) {
					result[0] = (IFile) resource;
					return false;
				}
				return IResource.FOLDER == resource.getType() || IResource.PROJECT == resource.getType();
			}
		});
		return result[0];
	}
	
	protected String[] getProjectNatures() {
		return new String[] { XtextProjectHelper.NATURE_ID, KnitmlNature.NATURE_ID };
	}

	@Override
	protected List<String> getAllFolders() {
		return new ArrayList<String>();
	}

	protected String[] getBuilders() {
		return new String[] { XtextProjectHelper.BUILDER_ID, KnitmlBuilder.BUILDER_ID };
	}

	protected void enhanceProject(final IProject project,
			final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project
				.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(
				output, null);
		execCtx.getResourceManager().setFileEncoding("ISO-8859-1");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate(
				"com::knitml::dsl::ui::wizard::KnittingExpressionLanguageNewProject::main",
				getProjectInfo());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

}