package sg.edu.nus.iss.vmcs.store;

public interface CoinHandler {
    public void addSuccessor(Coin coin);
    public void findSlot(CashStore store, Coin coin, int index) ;
    public void incrementCoin(CashStore store, int index);
}
