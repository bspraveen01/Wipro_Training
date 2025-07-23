package Bank;

public class Upipayments extends Abstractpayments {

	public Upipayments(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payments() {
		System.out.println(" payment is sucessful"+amount+" using UPI");
		showMessage();
	}

}
