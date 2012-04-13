package com.knitml.gpec.renderer.preferences.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * <p>
 * Shows the given preference page and hides the rest of the preference
 * categories. If a preference page <i>must</i> be specified in the parameters,
 * else an exception is thrown.
 * </p>
 */
public final class ShowRenderingPreferencesHandler extends AbstractHandler {

	public static final String[] displayedIDs = new String[] {"com.knitml.gpec.renderer.preferences.main","com.knitml.gpec.renderer.preferences.charting"};
	
	public final Object execute(final ExecutionEvent event) {
		final String preferencePageId = event
				.getParameter(IWorkbenchCommandConstants.WINDOW_PREFERENCES_PARM_PAGEID);
		event.getParameters();
		final IWorkbenchWindow activeWorkbenchWindow = HandlerUtil
				.getActiveWorkbenchWindow(event);

		final Shell shell;
		if (activeWorkbenchWindow == null) {
			shell = null;
		} else {
			shell = activeWorkbenchWindow.getShell();
		}

		final PreferenceDialog dialog = PreferencesUtil
				.createPreferenceDialogOn(shell, preferencePageId, displayedIDs, null);
		dialog.open();

		return null;
	}

}
