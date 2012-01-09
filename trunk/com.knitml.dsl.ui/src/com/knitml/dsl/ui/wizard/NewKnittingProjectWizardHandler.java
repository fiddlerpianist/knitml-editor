package com.knitml.dsl.ui.wizard;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.eclipse.ui.wizards.IWizardRegistry;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class NewKnittingProjectWizardHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public NewKnittingProjectWizardHandler() {
	}

	public static final String NEW_KNITTING_PROJECT_WIZARD_ID = "com.knitml.dsl.ui.wizard.KnittingExpressionLanguageNewProjectAndPatternWizard";

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow activeWindow = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		IWizardRegistry wizardRegistry = PlatformUI.getWorkbench()
				.getNewWizardRegistry();
		IWizardDescriptor wizardDescriptor = wizardRegistry
				.findWizard(NEW_KNITTING_PROJECT_WIZARD_ID);
		if (wizardDescriptor == null) {
			throw new ExecutionException(
					"unable to instantiate a KnittingExpressionLanguageNewProjectWizard because its ID was not found");
		}

		try {
			IWorkbenchWizard wizard = wizardDescriptor.createWizard();
			ISelection selection = HandlerUtil.getCurrentSelection(event);
			IStructuredSelection selectionToPass = StructuredSelection.EMPTY;
			if (selection instanceof IStructuredSelection) {
				selectionToPass = (IStructuredSelection) selection;
			}
			wizard.init(PlatformUI.getWorkbench(), selectionToPass);

			if (wizardDescriptor.canFinishEarly()
					&& !wizardDescriptor.hasPages()) {
				wizard.performFinish();
				return null;
			}

			Shell parent = activeWindow.getShell();
			WizardDialog dialog = new WizardDialog(parent, wizard);
			dialog.create();
			dialog.open();

		} catch (CoreException ex) {
			throw new ExecutionException("error creating wizard", ex); //$NON-NLS-1$
		}
		return null;
	}
}
