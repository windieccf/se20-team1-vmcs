package sg.edu.nus.iss.vmcs.store;

public interface PricingStrategy {

	static final String STRATEGY_CBD 	= "STRATEGY_CBD";
	static final String STRATEGY_HDB 	= "STRATEGY_HDB";
	static final String STRATEGY_SCHOOL = "STRATEGY_SCHOOL";

	public int getPrice(int price, String name);

}
