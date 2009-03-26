package com.knitml.gpec;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
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
	protected void makeActions(IWorkbenchWindow window) {
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

		action = ActionFactory.PROPERTIES.create(window);
		register(action);

	}

}
