package sg.edu.nus.iss.vmcs.util;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import sg.edu.nus.iss.vmcs.uifactory.AbstractLabel;
import sg.edu.nus.iss.vmcs.uifactory.AbstractPanel;
import sg.edu.nus.iss.vmcs.uifactory.AbstractTextField;
import sg.edu.nus.iss.vmcs.uifactory.UIFactory;
import sg.edu.nus.iss.vmcs.uifactory.VMCSEventHandler;

/**
 * @version 1.0
 * @author Chen Changfeng
 */

public class LabelledDisplay {

	public final static int DEFAULT = 5;
	public final static int FLOW = 1;
	public final static int GRID = 2;

	private AbstractTextField value;
	private AbstractLabel labelComponent;
	private AbstractPanel panel;
	
	public LabelledDisplay(String label, int length, int lt) {
		panel = UIFactory.getInstance().createPanel();
		if (lt == FLOW)
			panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		else if (lt == GRID)
			panel.setLayout(new GridLayout(1, 2));

		labelComponent = UIFactory.getInstance().createLabel();
		System.out.println("LabelledDisplay:" + label);
		labelComponent.setAlignment(java.awt.Label.RIGHT);
		labelComponent.setText(label);
		AbstractPanel tp = UIFactory.getInstance().createPanel();
		tp.setLayout(new FlowLayout());
		value = UIFactory.getInstance().createTextField();
		value.setColumns(length);

		tp.add(value);

		panel.add(labelComponent);
		panel.add(tp);
	}

	public void addListener(VMCSEventHandler listener) {

		value.addEventHandler(listener);
	}

	public void setEditable(boolean v) {
		value.setEditable(v);
		if (v == false) {
			value.setBackground(java.awt.Color.blue.getRed(),java.awt.Color.blue.getGreen(),java.awt.Color.blue.getBlue());
		}
	}
	public void setValue(String vl) {
		value.setText(vl);
	}

	public void setValue(int vl) {
		setValue(String.valueOf(vl));
	}

	public void setActive(boolean st) {
		System.out.println("LabelledDisplay.setActive");
		value.setEnabled(st);
		labelComponent.setEnabled(st);
	}

	public void setTextBackground(Color c) {
		value.setBackground(c.getRed(),c.getGreen(),c.getBlue());
	}

	public void setTextForeground(Color c) {
		value.setForeground(c.getRed(),c.getGreen(),c.getBlue());
	}
	
	public AbstractPanel getLabelledDisplay() {
		return panel;
	}
}