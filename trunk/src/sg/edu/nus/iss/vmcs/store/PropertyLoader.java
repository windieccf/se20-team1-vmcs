
package sg.edu.nus.iss.vmcs.store;
/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.io.*;

/**
 *
 *
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */
public abstract class PropertyLoader {
	
	private String sfilename;
	
	public static final int fileTypeProperty=1;
	public static final int xmlTypeProperty=2;
	
	public PropertyLoader(){}
	public PropertyLoader(String filename){
		this.sfilename=filename;
	}
	
	public abstract void saveProperty() throws IOException; 

	public abstract int getNumOfItems();

	public abstract void setNumOfItems(int numItems);

	public abstract StoreItem getItem (int index);

	public abstract void setItem (int index, StoreItem item);
	
	private ProperytyLoaderImpl propertyLoaderImpl=null;
	
	protected ProperytyLoaderImpl getPropertyImpl(){
		return propertyLoaderImpl;
	}
	
	protected void setPropertyLoaderImpl(ProperytyLoaderImpl pImpl){
		this.propertyLoaderImpl=pImpl;
	}

	public  void initialize() throws FileNotFoundException, IOException {
		propertyLoaderImpl.initialize();
	} 
	
	public String getValue(String key){
		return propertyLoaderImpl.getValue(key);
	}
	
	public void setValue(String key, String value){
		propertyLoaderImpl.setItem(key, value);
	}
	
}
