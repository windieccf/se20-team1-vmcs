package sg.edu.nus.iss.vmcs.store;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

/**
 *
 *
 * @version 14 Oct 2013
 * @author Song Lei
 */

public class DrinksBrand extends StoreObject {

	private int price;
	static private PricingStrategy strategy = null;


	public DrinksBrand() {
	}

	public DrinksBrand(String name, int price) {
		this.price = price;
		this.name = name;
	}

	public void setPrice(int p) {
		price = p;
	}

	public int getPrice() {
		return (price);
	}
	
	/**
	 * Set the strategy
	 * @return void
	 */	
	public static void setStrategy(String type){
		strategy = PricingStrategyFactory.create(type);
	}
	
	/**
	 * Gets the selling price 
	 * @return int
	 */	
	public int getSellingPrice() {
		if (strategy==null) {
			return this.getPrice();
		} 
		else {
			return strategy.getPrice(this.price, this.name);	
		}
	}

}
