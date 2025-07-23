package Day4;

abstract class Payment1 {
     double amount;
     
     Payment1(double amount){
    	 this.amount = amount;
     }
     
     abstract void payment();
     
     void showMessage() {
    	 System.out.println("payment is successfull with"+amount);
     }
}
class  creditcard extends Payment1{

	creditcard(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void payment() {
		System.out.println("payment is successful "+amount+" by using credit card");
		
	}
	
}
class UPIPayments extends Payment1{

	UPIPayments(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void payment() {
		System.out.println("payment is successfull "+amount+ "Uisng UPI");
		
	}
	
}

class AbPayment{
	 public static void main(String[] args) {
		 
		 Payment1 payment; // use reference of abstract class.
		 payment = new creditcard(45000);
		 payment.payment();
		 System.out.println("credit card payment is completed");
		 
		 payment = new UPIPayments(56000);
		 payment.payment();
		 System.out.println("UPI payment is completed");
	 }
}