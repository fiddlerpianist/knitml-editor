package com.knitml.gpec;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.actions.NewWizardMenu;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * An action bar advisor is responsible for creating, adding, and disposing of
 * the actions added to a workbench window. Each window will be populated with
 * new actions.
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	// Actions - important to allocate these only in makeActions, and then use
	// them
	// in the fill methods. This ensures that the actions aren't recreated
	// when fillActionBars is called with FILL_PROXY.
	// private IWorkbenchAction exitAction;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	@Override
	protected void makeActions(final IWorkbenchWindow window) {
		IWorkbenchAction action = ActionFactory.DELETE.create(window);
		register(action);

		action = ActionFactory.COPY.create(window);
		register(action);

		action = ActionFactory.PASTE.create(window);
		register(action);

		action = ActionFactory.RENAME.create(window);
		register(action);

		action = ActionFactory.REFRESH.create(window);
		register(action);

		action = ActionFactory.SAVE.create(window);
		register(action);

		action = ActionFactory.SAVE_AS.create(window);
		register(action);

		action = ActionFactory.SAVE_ALL.create(window);
		register(action);

		action = ActionFactory.REVERT.create(window);
		register(action);

		action = ActionFactory.PROPERTIES.create(window);
		register(action);

		action = ActionFactory.HELP_CONTENTS.create(window);
		register(action);

		action = ActionFactory.INTRO.create(window);
		register(action);

		action = ActionFactory.NEW_WIZARD_DROP_DOWN.create(window);
		register(action);

		final String newQuickMenuId = "org.eclipse.ui.file.newQuickMenu"; //$NON-NLS-1$
		action = new QuickMenuAction(newQuickMenuId) {
			protected void fillMenu(IMenuManager menu) {
				menu.add(new NewWizardMenu(window));
			}
		};
		register(action);
	}

	protected void fillMenuBar(IMenuManager menuBar) {
		MenuManager fileMenu = createFileMenu();
		menuBar.add(fileMenu);
	}

	/**
	 * Creates and returns the File menu.
	 */
	private MenuManager createFileMenu() {
		MenuManager menu = new MenuManager("File",
				"com.knitml.gpec.application.file");
		menu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));
		{
			// create the New submenu, using the same id for it as the New
			// action
			String newText = "New";
			String newId = ActionFactory.NEW.getId();
			MenuManager newMenu = new MenuManager(newText, newId);
			newMenu.setActionDefinitionId("org.eclipse.ui.file.newQuickMenu"); //$NON-NLS-1$
			newMenu.add(new Separator(newId));
			NewWizardMenu newWizardMenu = new NewWizardMenu(getActionBarConfigurer().getWindowConfigurer().getWindow());
			newMenu.add(newWizardMenu);
			newMenu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
			menu.add(newMenu);
		}
		return menu;
	}

}
