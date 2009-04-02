package com.knitml.gpec.renderer.preferences.operations;

import java.util.Arrays;

import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */
public class SamplePreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public SamplePreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("A demonstration of a preference page implementation");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		Preferences preferences = new DefaultScope()
				.getNode(Activator.PLUGIN_ID);
		try {
			String[] keys = preferences.keys();
			Arrays.sort(keys);
			for (String key : keys) {
				if (!key.startsWith("operation.")) {
					continue;
				}
				String label = key.substring(10); // lops off "operations."
				if (key.endsWith(".$$$")) {
					label = label.replace(".$$$", " (plural)");
				}
				addField(new StringFieldEditor(key, label, getFieldEditorParent()));
			}
		} catch (BackingStoreException ex) {
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}