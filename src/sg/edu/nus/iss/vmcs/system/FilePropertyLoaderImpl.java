package sg.edu.nus.iss.vmcs.system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import sg.edu.nus.iss.vmcs.store.ProperytyLoaderImpl;
import sg.edu.nus.iss.vmcs.store.StoreItem;

public class FilePropertyLoaderImpl implements ProperytyLoaderImpl{
	private static final String PROP_NUM_ITEMS = "NumOfItems";

	private Properties prop;
	private String fileName;
	
	public FilePropertyLoaderImpl(String fileName) {
		this.fileName = fileName;
	}
	
	public void initialize() throws IOException {
		prop = new Properties(System.getProperties());
		FileInputStream stream = new FileInputStream(fileName);
		prop.load(stream);
		stream.close();
	}

	public void saveProperty() throws IOException {
		FileOutputStream stream = new FileOutputStream(fileName);
		prop.store(stream, "");
		stream.close();
	}

	public int getNumOfItems() {
		String nm = prop.getProperty(PROP_NUM_ITEMS);
		int nmi;
		nmi = Integer.parseInt(nm);
		return nmi;
	}

	public void setNumOfItems(int vl) {
		prop.setProperty(PROP_NUM_ITEMS, String.valueOf(vl));
	}

	// Utility methoids for accessing the hashtable 

	public String getValue(String key) {
		return prop.getProperty(key);
	}

	public void setValue(String key, String value) {
		prop.setProperty(key, value);
	}

	@Override
	public StoreItem getItem(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setItem(String key, String value) {
		// TODO Auto-generated method stub
		
	}

	/*public FilePropertyLoaderImpl(String fileName) {
		this.fileName = fileName;
	}

	public void initialize() throws IOException {
		prop = new Properties(System.getProperties());
		FileInputStream stream = new FileInputStream(fileName);
		prop.load(stream);
		stream.close();
	}

	public void saveProperty() throws IOException {
		FileOutputStream stream = new FileOutputStream(fileName);
		prop.store(stream, "");
		stream.close();
	}

	public int getNumOfItems() {
		String nm = prop.getProperty(PROP_NUM_ITEMS);
		int nmi;
		nmi = Integer.parseInt(nm);
		return nmi;
	}

	public void setNumOfItems(int vl) {
		prop.setProperty(PROP_NUM_ITEMS, String.valueOf(vl));
	}

	// Utility methoids for accessing the hashtable 

	public String getValue(String key) {
		return prop.getProperty(key);
	}

	public void setValue(String key, String value) {
		prop.setProperty(key, value);
	}
*/

}
