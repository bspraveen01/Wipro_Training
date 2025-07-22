package Day3;

public interface EcomerceApp {
    void pay(double amount);
}
class UpiPayments implements EcomerceApp{


	public void pay(double amount) {
		System.out.println("paid"+amount+"upi");
		
	}
	
}
class CreditCards implements EcomerceApp{

	
	public void pay(double amount) {
		System.out.println("paid:"+amount+"by credit card");
		
	}
	
}

class Debitcard implements EcomerceApp{

	public void pay(double amount) {
		System.out.println("paid:"+amount+" by debit card");
		
	}
	
}

class EcommerceApps{
	public static void main(String[] args) {
		EcomerceApp payment;
		payment = new UpiPayments();
		payment.pay(278000.00);
		
		payment= new CreditCards();
		payment.pay(23000.00);
	}
}