package com.knitml.gpec.renderer.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FontFieldEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.gpec.renderer.preferences.values.Language;
import com.knitml.gpec.renderer.preferences.values.SystemOfUnits;

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

public class BasePreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public BasePreferencePage() {
		super(GRID);
		setPreferenceStore(RenderingPreferencesPlugin.getDefault()
				.getPreferenceStore());
		setDescription("Rendering preferences");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		addField(new ComboFieldEditor(PreferenceKeys.LANGUAGE, "Language",
				new String[][] {
						{ "English", Language.EN.name().toLowerCase() },
						{ "French", Language.FR.name().toLowerCase() },
						{ "Spanish", Language.ES.name().toLowerCase() },
						{ "Default", "" } }, getFieldEditorParent()));
		
		addField(new FontFieldEditor(PreferenceKeys.FONT, "Font", getFieldEditorParent()));

		addField(new BooleanFieldEditor(PreferenceKeys.SQUARE_GAUGE,
				"Describe gauge as a s&quare", getFieldEditorParent()));

		addField(new BooleanFieldEditor(PreferenceKeys.ENABLE_GAUGE_TRANSFORMATION,
				"Enable gauge &changes", getFieldEditorParent()));
		
		addField(new ComboFieldEditor(PreferenceKeys.SYSTEM_OF_UNITS,
				"System of units", new String[][] {
						{ "U.S. Customary", SystemOfUnits.US.name() },
						{ "International", SystemOfUnits.INTERNATIONAL.name() },
						{ "Unspecified", "" } }, getFieldEditorParent()));

		addField(new RadioGroupFieldEditor(
				PreferenceKeys.RENDERER,
				"Format",
				1,
				new String[][] {
						{ "Text",
								"com.knitml.renderer.impl.basic.BasicTextRenderer" },
						{ "HTML",
								"com.knitml.renderer.impl.html.HtmlRenderer" } },
				getFieldEditorParent()));
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