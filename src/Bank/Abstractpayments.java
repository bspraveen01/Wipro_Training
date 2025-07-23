package Bank;

abstract class Abstractpayments {
     protected double amount;

	 public Abstractpayments(double amount) {
		super();
		this.amount = amount;
	 }
     
	 void showMessage() {
		 System.out.println("payment is successfull");
	 }
	public abstract void payments();
     
}
