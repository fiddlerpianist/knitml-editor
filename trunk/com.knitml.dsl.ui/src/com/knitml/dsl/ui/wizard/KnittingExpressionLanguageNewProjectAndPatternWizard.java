package com.knitml.dsl.ui.wizard;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import com.google.inject.Inject;

public class KnittingExpressionLanguageNewProjectAndPatternWizard extends XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	@Inject
	public KnittingExpressionLanguageNewProjectAndPatternWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New Knitting Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("Knitting Project");
		mainPage.setDescription("Create a new knitting project using the Knitting Expression Language");
		addPage(mainPage);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		com.knitml.dsl.ui.wizard.KnittingExpressionLanguageProjectInfo projectInfo = new com.knitml.dsl.ui.wizard.KnittingExpressionLanguageProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
