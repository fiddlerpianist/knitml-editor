package com.knitml.gpec;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.knitml.gpec.wizards.KnitmlProjectWizard;


public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.addNewWizardShortcut(KnitmlProjectWizard.WIZARD_ID);
		return;
	}

}
