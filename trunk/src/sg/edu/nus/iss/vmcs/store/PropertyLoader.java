
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
	private ProperytyLoaderImpl propertyLoaderImpl=null;
	
	public PropertyLoader(){}
	public PropertyLoader(String filename){
		this.sfilename=filename;
	}
	
	public PropertyLoader(ProperytyLoaderImpl propImpl){
		this.propertyLoaderImpl=propImpl;
	}
	
	public  void saveProperty() throws IOException{
		propertyLoaderImpl.saveProperty();
	} 

	public  int getNumOfItems(){
		
		return propertyLoaderImpl.getNumOfItems();
	}

	public void setNumOfItems(int numItems){
		propertyLoaderImpl.setNumOfItems(numItems);
	}

	public abstract StoreItem getItem (int index);

	public abstract void setItem (int index, StoreItem item);
	

	
	protected ProperytyLoaderImpl getPropertyImpl(){
		return propertyLoaderImpl;
	}
	
	/*protected void setPropertyLoaderImpl(ProperytyLoaderImpl pImpl){
		this.propertyLoaderImpl=pImpl;
	}*/

	public  void initialize() throws FileNotFoundException, IOException {
		propertyLoaderImpl.initialize();
	} 
	
	public String getValue(String key){
		return propertyLoaderImpl.getValue(key);
	}
	
	public void setValue(String key, String value){
		propertyLoaderImpl.setValue(key, value);
	}
	
	public abstract void setPorpertyLoaderType(int propertyType);
}
