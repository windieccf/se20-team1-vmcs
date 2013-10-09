package sg.edu.nus.iss.vmcs.maintenance;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.awt.event.*;
import java.awt.*;

import sg.edu.nus.iss.vmcs.uifactory.EventArgs;
import sg.edu.nus.iss.vmcs.uifactory.VMCSEventHandler;

/**
 * @version 1.0
 * @author Chen Changfeng
 */

public class PriceDisplayListener implements ActionListener, VMCSEventHandler {
	private MaintenanceController mctrl;

	public PriceDisplayListener(MaintenanceController mc) {
		mctrl = mc;
	}
	public void actionPerformed(ActionEvent e) {
		TextField txt;

		String sp;
		int ip;

		txt = (TextField) e.getSource();
		sp = txt.getText();

		ip = Integer.parseInt(sp);

		mctrl.setPrice(ip);
	}
	
	public void vmcsActionPerformed(Object eventSource, EventArgs args) {
		ActionEvent event = new ActionEvent(null, 0, null);
		this.actionPerformed(event);
	}
}