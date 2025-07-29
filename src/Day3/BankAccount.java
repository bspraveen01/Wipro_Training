package Day3;

public class BankAccount {
	// these are objects or properties.
	private String accHolderName;
	private double balance;
	// constructor : should have class name as a same name. it is used to intialize the objects.
	public BankAccount(String accHolderName, double balance) {
		this.accHolderName=accHolderName;
		this.balance = balance;
	}
	// create a deposit. create a parameter we need to pass amount.
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("new balance:"+balance);
	}
	
	// method for withdraw
	public void withdraw(double amount) {
		if(amount > 0 && amount < balance) {
			balance = balance - amount;
			System.out.println("withdrawn remaining balance:"+balance);
		}else {
			System.out.println("balance Insufficient");
		}
	}
	
	public void displayDetails() {
		System.out.println("Acc holder name :"+accHolderName);
		System.out.println("balance :"+balance);
	}

}
