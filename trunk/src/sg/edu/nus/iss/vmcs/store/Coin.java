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
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */

public class Coin extends StoreObject implements Comparable,  CoinHandler {

    private int value;
    private double weight;
    private Coin successor; 

    public Coin () {
    }
    public Coin (int value, double weight) {
        this.value = value;
        this.weight = weight;
    }

    public void setValue(int v){
      value = v;
    }

    public void setWeight(double wt){
      weight = wt;
    }


    public double getWeight () {
        return (weight);
    }

    public int getValue () {
        return (value);
    }
    
    public int compareTo(Object arg0) {
    	if(arg0==null || !(arg0 instanceof Coin))
    		return 1;
		return this.value-((Coin)arg0).value;
	}
    
    @Override
	public boolean equals(Object arg0) {
		return arg0!=null && arg0 instanceof Coin && this.value==((Coin)arg0).value; 
	}
	
    public void addSuccessor(Coin successor) {
        this.successor = successor;
    }
    
    public void findSlot(CashStore cs, Coin c, int i) {
        if( this.equals(c) ){
            // increment quantity
            incrementCoin(cs, i);
        }
        else{
            // search successor
            if( successor != null ){
                i++;
                successor.findSlot(cs, c, i);
            }
        }
    }

    public void incrementCoin(CashStore cs, int i) {
        StoreItem item = cs.getStoreItem(i);
        item.increment();
    }

  }
