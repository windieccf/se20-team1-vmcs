package sg.edu.nus.iss.vmcs.store;


/**
*
*
* @version 14 Oct 2013
* @author Song Lei
*/

public class CBDStrategy implements PricingStrategy {
	
	@Override
	public int getPrice(int price, String name){
		// TODO Auto-generated method stub
		return 3*price;
	}
}
