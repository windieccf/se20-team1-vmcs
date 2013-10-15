package sg.edu.nus.iss.vmcs.maintenance;
import java.util.Observable;
import java.util.Observer;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.awt.event.*;
import java.awt.*;

import sg.edu.nus.iss.vmcs.store.*;
import sg.edu.nus.iss.vmcs.util.VMCSException;

/**
 *
 *
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */

public class ButtonItemDisplay extends Panel implements Observer{

	private ButtonItem items[];
	private int len;
	private Label lb;
	private StoreItem[] storeItems;

	public ButtonItemDisplay(String title, StoreItem sitem[], int length) {

//		storeItems = sitem;
		
		len = length;
		System.out.println("ButtonItemDisplay:" + len);
		Panel tp1 = new Panel();

		lb = new Label(title);
		tp1.add(lb);

		this.setLayout(new GridLayout(0, 1));

		this.add(tp1);

		int i;
		items = new ButtonItem[len];

		for (i = 0; i < len; i++) {
			StoreObject ob = sitem[i].getContent();

			items[i] =
				new ButtonItem(
					ob.getName(),
					ButtonItem.DEFAULT_LEN,
					ButtonItem.GRID);
			this.add(items[i]);
			
			// Add observer by Yifei
			sitem[i].addObserver(this);
		}
		
		storeItems = sitem;

	}

	public void addListener(ActionListener l) {
		int i;
		for (i = 0; i < len; i++) {
			items[i].addListener(l);
			items[i].setActionCommand(String.valueOf(i));
		}
	}

	public void setActive(boolean st) {
		int i;
		lb.setEnabled(st);
		for (i = 0; i < len; i++) {
			items[i].setActive(st);
		}
	}

	public void clear() {
		int i;
		for (i = 0; i < len; i++) {
			items[i].clear();
		}
	}

	public void displayQty(int idx, int qty) throws VMCSException {
		System.out.println("ButtonItemDisplay:" + idx);
		if (idx >= len)
			throw new VMCSException("ButtomDisplay.setQty", "Index over flow");

		items[idx].setValue(qty);
	}

	@Override
	public void update(Observable p, Object x){
		refresh();
	}
	
	private void refresh(){
		for (int i = 0; i < items.length; i++) {
			int val = storeItems[i].getQuantity();
			String sval = String.valueOf(val);
			items[i].setValue(sval);
		}
	}

}
