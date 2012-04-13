package com.knitml.dsl.ui.dialog;

import javax.measure.Measurable;
import javax.measure.Measure;
import javax.measure.unit.Unit;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.knitml.core.units.StitchGauge;
import com.knitml.core.units.Units;

public class GaugeDialog extends InputDialog {

	private Text stitchGaugeWidget;
	private Combo unitWidget;
	private Measurable<StitchGauge> stitchGauge;
	private boolean useInternationalUnits;
	private boolean useSquare;

	public GaugeDialog(Shell parentShell, boolean useInternationalUnits,
			boolean useSquare) {
		super(parentShell, "Enter target gauge", "Enter the target gauge", "",
				null);
		this.useInternationalUnits = useInternationalUnits;
		this.useSquare = useSquare;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		// layout.horizontalAlignment = GridData.FILL;
		parent.setLayout(layout);

		// The text fields will grow with the size of the dialog
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = false;
		gridData.horizontalAlignment = SWT.FILL;

		Label label1 = new Label(parent, SWT.NONE);
		label1.setText("Stitch Gauge");
		label1.setAlignment(SWT.RIGHT);

		stitchGaugeWidget = new Text(parent, SWT.BORDER);
		stitchGaugeWidget.setLayoutData(gridData);

		unitWidget = new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY
				| SWT.BORDER);
		if (useSquare) {
			unitWidget.add("st per 10 cm");
			unitWidget.add("st per 4 in");
		} else {
			unitWidget.add("st/cm");
			unitWidget.add("st/in");
		}
		unitWidget.select(useInternationalUnits ? 0 : 1);
		unitWidget.setLayoutData(gridData);

		return parent;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		GridData gridData = new GridData();
		gridData.verticalAlignment = SWT.RIGHT;
		gridData.horizontalSpan = 3;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = SWT.CENTER;

		parent.setLayoutData(gridData);
		// Own method as we need to overview the SelectionAdapter
		createOkButton(parent, OK, "Apply Gauge", true);

		// Create Cancel button
		Button cancelButton = createButton(parent, CANCEL, "Cancel", false);
		// Add a SelectionListener
		cancelButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setReturnCode(CANCEL);
				close();
			}
		});
	}

	protected Button createOkButton(Composite parent, int id, String label,
			boolean defaultButton) {
		// increment the number of columns in the button bar
		((GridLayout) parent.getLayout()).numColumns++;
		Button button = new Button(parent, SWT.PUSH);
		button.setText(label);
		button.setFont(JFaceResources.getDialogFont());
		button.setData(new Integer(id));
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				if (isValidInput()) {
					okPressed();
				}
			}
		});
		if (defaultButton) {
			Shell shell = parent.getShell();
			if (shell != null) {
				shell.setDefaultButton(button);
			}
		}
		setButtonLayoutData(button);
		return button;
	}

	private boolean isValidInput() {
		if (unitWidget.getSelectionIndex() == -1)
			return false;
		try {
			Double.parseDouble(stitchGaugeWidget.getText().trim());
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	// We need to have the textFields into Strings because the UI gets disposed
	// and the Text Fields are not accessible any more.
	private void saveInput() {
		String unitString = unitWidget.getSelectionIndex() == 0 ? "st/cm" : "st/in";
		double value = Double.parseDouble(this.stitchGaugeWidget.getText()); 
		if (useSquare) {
			if (unitWidget.getSelectionIndex() == 0) {
				value = value / 10.0d;
			} else {
				value = value / 4.0d;
			}
		}
		Unit<StitchGauge> unit = Units.valueOf(unitString).asType(
				StitchGauge.class);
		stitchGauge = Measure.valueOf(value, unit);
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	public Measurable<StitchGauge> getStitchGauge() {
		return stitchGauge;
	}
}
