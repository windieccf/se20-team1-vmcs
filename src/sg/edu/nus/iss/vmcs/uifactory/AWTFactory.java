package sg.edu.nus.iss.vmcs.uifactory;

import sg.edu.nus.iss.vmcs.uifactory.awt.AWTConcreteButton;
import sg.edu.nus.iss.vmcs.uifactory.awt.AWTConcreteLabel;
import sg.edu.nus.iss.vmcs.uifactory.awt.AWTConcretePanel;
import sg.edu.nus.iss.vmcs.uifactory.awt.AWTConcreteTextField;


/**
 * @version 1.0
 * @author Chen Changfeng
 */
public class AWTFactory extends UIFactory {
	
	@Override
	public AbstractButton createButton() {
		return new AWTConcreteButton();
	}

	@Override
	public AbstractLabel createLabel() {
		return new AWTConcreteLabel();
	}

	@Override
	public AbstractPanel createPanel() {
		return new AWTConcretePanel();
	}

	@Override
	public AbstractTextField createTextField() {
		return new AWTConcreteTextField();
	}

	

}
