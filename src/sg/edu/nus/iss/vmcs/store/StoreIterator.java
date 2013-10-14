package sg.edu.nus.iss.vmcs.store;
/**
 * @version 1.0
 * @author Yue Yang
 */
public interface StoreIterator {

	public StoreItem first();
	
	public StoreItem next();
	
	public boolean hasNext();
	
	public StoreItem current();
}
