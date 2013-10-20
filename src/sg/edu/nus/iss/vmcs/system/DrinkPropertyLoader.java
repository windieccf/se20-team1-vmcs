package sg.edu.nus.iss.vmcs.system;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.io.IOException;

import sg.edu.nus.iss.vmcs.store.*;

/**
 *
 *
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */

public class DrinkPropertyLoader extends PropertyLoader {

	private static final String NAME_LABEL     = "Name";
	private static final String PRICE_LABEL    = "Price";
	private static final String QUANTITY_LABEL = "Quantity";
	
	public DrinkPropertyLoader(String filename){
		super(filename);
	}
	
	public DrinkPropertyLoader(ProperytyLoaderImpl propImpl){
		super(propImpl);
	}
	
	@Override
	public void saveProperty() throws IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getNumOfItems() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setNumOfItems(int numItems) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public StoreItem getItem(int index) {
		// TODO Auto-generated method stub
		int idx = index + 1;
		DrinksBrand brand = new DrinksBrand();

		String name = new String(NAME_LABEL + idx);
		String value = getValue(name);
		brand.setName(value);

		name = new String(PRICE_LABEL + idx);
		value = getValue(name);
		brand.setPrice(Integer.parseInt(value));

		name = new String(QUANTITY_LABEL + idx);
		value = getValue(name);
		int qty = Integer.parseInt(value);

		DrinksStoreItem item = new DrinksStoreItem(brand, qty);
		return item;
	}
	@Override
	public void setItem(int index, StoreItem drinksItem) {
		// TODO Auto-generated method stub
		int idx = index + 1;

		DrinksStoreItem item = (DrinksStoreItem) drinksItem;
		DrinksBrand brand = (DrinksBrand) item.getContent();
		String itn = new String(NAME_LABEL + idx);
		setValue(itn, brand.getName());

		itn = new String(PRICE_LABEL + idx);
		setValue(itn, String.valueOf(brand.getPrice()));

		itn = new String(QUANTITY_LABEL + idx);
		setValue(itn, String.valueOf(item.getQuantity()));
	}

	
	/*public DrinkPropertyLoader(String filen) {
		super(filen);
	}

	public StoreItem getItem(int index) {
		int idx = index + 1;
		DrinksBrand brand = new DrinksBrand();

		String name = new String(NAME_LABEL + idx);
		String value = getValue(name);
		brand.setName(value);

		name = new String(PRICE_LABEL + idx);
		value = getValue(name);
		brand.setPrice(Integer.parseInt(value));

		name = new String(QUANTITY_LABEL + idx);
		value = getValue(name);
		int qty = Integer.parseInt(value);

		DrinksStoreItem item = new DrinksStoreItem(brand, qty);
		return item;

	}

	public void setItem(int index, StoreItem drinksItem) {
		int idx = index + 1;

		DrinksStoreItem item = (DrinksStoreItem) drinksItem;
		DrinksBrand brand = (DrinksBrand) item.getContent();
		String itn = new String(NAME_LABEL + idx);
		setValue(itn, brand.getName());

		itn = new String(PRICE_LABEL + idx);
		setValue(itn, String.valueOf(brand.getPrice()));

		itn = new String(QUANTITY_LABEL + idx);
		setValue(itn, String.valueOf(item.getQuantity()));

	}
*/
}
