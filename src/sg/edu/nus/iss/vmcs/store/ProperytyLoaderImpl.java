package sg.edu.nus.iss.vmcs.store;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface  ProperytyLoaderImpl {
	public abstract void saveProperty() throws IOException; 

	public int getNumOfItems();

	public void setNumOfItems(int numItems);
	
	public  void initialize() throws FileNotFoundException,IOException;
	
	public String getValue(String key);
	
	public void setValue(String key, String value);
}
