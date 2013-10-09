package sg.edu.nus.iss.vmcs.uifactory.awt;

import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Panel;

import  sg.edu.nus.iss.vmcs.uifactory.AbstractPanel;
import  sg.edu.nus.iss.vmcs.uifactory.VMCSComponent;

public class AWTConcretePanel extends Panel implements AbstractPanel {
	
	@Override
	public void add(VMCSComponent component) {
		super.add((Component)component);
	}

	@Override
	public void show() {
		
	}

	@Override
	public void setLayout(Object layout) {
		if(layout instanceof LayoutManager) {
			super.setLayout((LayoutManager)layout);
		}
	}

	@Override
	public void add(String name, VMCSComponent component) {
		super.add(name, (Component)component);
	}
	
	
}
