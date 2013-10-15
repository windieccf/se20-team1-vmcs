package sg.edu.nus.iss.vmcs.store;

public class PricingStrategyFactory {
	
	private PricingStrategyFactory() 
	{
	}

	public static PricingStrategy create(String type) {

		PricingStrategy strategy = null;

		if (type.equalsIgnoreCase(strategy.STRATEGY_CBD)) {
			strategy = new CBDStrategy();
		} else if (type.equalsIgnoreCase(strategy.STRATEGY_HDB)) {
			strategy = new HDBStrategy();
		} else if (type.equalsIgnoreCase(strategy.STRATEGY_SCHOOL)) {
			strategy = new SchoolStrategy();
		}

		return strategy;
	}
}
