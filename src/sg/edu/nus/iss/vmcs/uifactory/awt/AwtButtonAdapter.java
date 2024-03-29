package sg.edu.nus.iss.vmcs.uifactory.awt;

import java.awt.Button;
import java.awt.event.ActionListener;

import sg.edu.nus.iss.vmcs.uifactory.AbstractButton;

/**
 * @version 1.0
 * @author Chen Changfeng
 */
public class AwtButtonAdapter extends Button implements AbstractButton {
	
	public void addEventHandler(sg.edu.nus.iss.vmcs.uifactory.VMCSEventHandler e) {
		if (e instanceof ActionListener) {
			super.addActionListener((ActionListener)e);
		}
	}

	public void setActive(boolean bool) {
		super.setEnabled(bool);
	}

}
