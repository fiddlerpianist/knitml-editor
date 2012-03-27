package com.knitml.gpec.renderer.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.renderer.chart.advisor.impl.AireRiverSymbolAdvisor;
import com.knitml.renderer.chart.advisor.impl.KnittersSymbolsWSymbolAdvisor;
import com.knitml.renderer.chart.advisor.impl.StitchMasterySymbolAdvisor;
import com.knitml.renderer.chart.advisor.impl.TextArtSymbolAdvisor;

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

public class ChartingPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public ChartingPreferencePage() {
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

		FieldEditor chartGloballyEditor = new BooleanFieldEditor(
				PreferenceKeys.CHART_GLOBALLY,
				"Enable c&hart creation for instructions",
				getFieldEditorParent());
		addField(chartGloballyEditor);

		addField(new RadioGroupFieldEditor(
				PreferenceKeys.CHART_SYMBOL_PROVIDER,
				"Chart Symbol Set",
				1,
				new String[][] {
						{ "Te&xt Art", TextArtSymbolAdvisor.class.getName() },
						{ "Knitter's S&ymbols",
								KnittersSymbolsWSymbolAdvisor.class.getName() },
						{ "&Aire River Knitting Font",
								AireRiverSymbolAdvisor.class.getName() },
						{ "&StitchMastery Font Set",
								StitchMasterySymbolAdvisor.class.getName() } },
				getFieldEditorParent()));

		addField(new BooleanFieldEditor(PreferenceKeys.USE_GREY_NO_STITCH,
				"Use grey color for \"no stitch\" symbol", getFieldEditorParent()));
		
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