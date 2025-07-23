package Bank;

public class CreditCardPayments  extends Abstractpayments{

	public CreditCardPayments(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payments() {
		System.out.println("Payment is completed "+amount+" using CreditCard ");
		showMessage();
	}

}
