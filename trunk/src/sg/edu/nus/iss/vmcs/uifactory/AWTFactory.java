package sg.edu.nus.iss.vmcs.uifactory;

import sg.edu.nus.iss.vmcs.uifactory.awt.AwtButtonAdapter;
import sg.edu.nus.iss.vmcs.uifactory.awt.AwtLabelAdapter;
import sg.edu.nus.iss.vmcs.uifactory.awt.AwtPanelAdapter;
import sg.edu.nus.iss.vmcs.uifactory.awt.AwtTextFieldAdapter;


/**
 * @version 1.0
 * @author Chen Changfeng
 */
public class AWTFactory extends UIFactory {
	
	@Override
	public AbstractButton createButton() {
		return new AwtButtonAdapter();
	}

	@Override
	public AbstractLabel createLabel() {
		return new AwtLabelAdapter();
	}

	@Override
	public AbstractPanel createPanel() {
		return new AwtPanelAdapter();
	}

	@Override
	public AbstractTextField createTextField() {
		return new AwtTextFieldAdapter();
	}

	

}
