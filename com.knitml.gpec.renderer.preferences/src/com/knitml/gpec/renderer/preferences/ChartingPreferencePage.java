package com.knitml.gpec.renderer.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.knitml.gpec.renderer.preferences.keys.PreferenceKeys;
import com.knitml.renderer.chart.advisor.impl.AireRiverSymbolAdvisor;
import com.knitml.renderer.chart.advisor.impl.KnittersSymbolsWSymbolAdvisor;
import com.knitml.renderer.chart.advisor.impl.StitchMasterySymbolAdvisor;
import com.knitml.renderer.chart.advisor.impl.StitchMasterySymbolDashAdvisor;
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

	BooleanFieldEditor chartGloballyField;
	FieldEditor symbolProviderField;
	FieldEditor useNoStitchField;

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

		this.chartGloballyField = new BooleanFieldEditor(
				PreferenceKeys.CHART_GLOBALLY,
				"Enable c&hart creation for instructions",
				getFieldEditorParent());
		addField(chartGloballyField);

		this.symbolProviderField = new RadioGroupFieldEditor(
				PreferenceKeys.CHART_SYMBOL_PROVIDER,
				"Chart Symbol Set",
				1,
				new String[][] {
						{ "&Aire River Knitting Font",
								AireRiverSymbolAdvisor.class.getName() },
						{ "Knitter's S&ymbols",
								KnittersSymbolsWSymbolAdvisor.class.getName() },
						{ "Te&xt Art", TextArtSymbolAdvisor.class.getName() },
						{ "&StitchMastery Font Set (Dot style)",
								StitchMasterySymbolAdvisor.class.getName() },
						{ "StitchMastery Font Set (&Dash style)",
								StitchMasterySymbolDashAdvisor.class.getName() } },
				getFieldEditorParent());
		addField(symbolProviderField);

		this.useNoStitchField = new BooleanFieldEditor(
				PreferenceKeys.USE_GREY_NO_STITCH,
				"Use &grey color for \"no stitch\" symbol",
				getFieldEditorParent());
		addField(useNoStitchField);
	}
	
	@Override
	protected void initialize() {
		super.initialize();
		toggleChartingEnableIfAppropriate(chartGloballyField.getBooleanValue());
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);
		if (event.getSource().equals(chartGloballyField)) {
			toggleChartingEnableIfAppropriate((Boolean)event.getNewValue());
		}
	}

	private void toggleChartingEnableIfAppropriate(Boolean newValue) {
		if (newValue.equals(Boolean.FALSE)) {
			symbolProviderField.setEnabled(false, getFieldEditorParent());
			useNoStitchField.setEnabled(false, getFieldEditorParent());
		} else {
			symbolProviderField.setEnabled(true, getFieldEditorParent());
			useNoStitchField.setEnabled(true, getFieldEditorParent());
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