package sg.edu.nus.iss.vmcs.uifactory.awt;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionListener;

import  sg.edu.nus.iss.vmcs.uifactory.AbstractTextField;
import  sg.edu.nus.iss.vmcs.uifactory.VMCSEventHandler;
/**
 * @version 1.0
 * @author Chen Changfeng
 */
public class AwtTextFieldAdapter extends TextField implements AbstractTextField {
	
	public void setColumns(int length) {
		super.setColumns(length);
	}

	@Override
	public void setBackground(int r, int g, int b) {
		super.setBackground(new Color(r, g, b));
	}

	@Override
	public void addEventHandler(VMCSEventHandler e) {
		if (e instanceof ActionListener) {
			super.addActionListener((ActionListener)e);
		}
	}

	@Override
	public void setForeground(int r, int g, int b) {
		super.setForeground(new Color(r, g, b));
	}
	
	public void setEchoChar(char c){
		super.setEchoChar(c);
	}


}
