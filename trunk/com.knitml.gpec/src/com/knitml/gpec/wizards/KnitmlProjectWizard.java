package com.knitml.gpec.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.knitml.gpec.builder.KnitmlNature;

public class KnitmlProjectWizard extends BasicNewProjectResourceWizard {

	public static final String WIZARD_ID = "com.knitml.gpec.KnitmlProjectWizard";
	
	public KnitmlProjectWizard() {
		super();
	}
	
	@Override
	public boolean performFinish() {
		boolean projectCreated = super.performFinish();
		if (projectCreated) {
			IProject project = getNewProject();
			if (project != null) {
				addNature(project);
			}
		}
		return projectCreated;
	}

	/**
	 * Toggles sample nature on a project
	 * 
	 * @param project
	 *            to have sample nature added or removed
	 */
	private void addNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();

			// Add the nature
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = KnitmlNature.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} catch (CoreException e) {
		}
	}

}
