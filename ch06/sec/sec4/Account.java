package sec4;

public class Account {
	private int balance=0;
	final static int MIN_BALANCE=0;
	final static int MAX_BLALNCE=1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance){
		if(balance>=MIN_BALANCE && balance<MAX_BLALNCE){
			this.balance = balance;
		}
	}
}
