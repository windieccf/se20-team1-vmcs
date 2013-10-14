package sg.edu.nus.iss.vmcs.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/**
 * @version 1.0
 * @author Yue Yang
 */
public class CashStoreIterator implements StoreIterator {

	private ArrayList items;
	private int idx = -1;
	private Iterator iterator;
	
	public CashStoreIterator(Store cashStore, Comparator comp) {
		items = new ArrayList();
		for (int i=0;i<cashStore.getStoreSize();i++) {
			items.add(cashStore.getStoreItem(i));
		}
		Collections.sort(items, comp);
		iterator = items.iterator();
	}
	

	public StoreItem current() {
		return (StoreItem)items.get(idx);
	}

	public StoreItem first() {
		idx = -1;
		iterator = items.iterator();
		return (StoreItem)iterator.next();
	}

	public boolean hasNext() {
		return iterator.hasNext();
	}

	public StoreItem next() {
		idx ++;
		return (StoreItem)iterator.next();
	}
}

