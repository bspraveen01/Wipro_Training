package App;

import Bank.CreditCardPayments;
import Bank.Upipayments;
import Billing.BillingGenerator;
public class App {
   public static void main(String[] args) {
	   // Abstract class reference we are using.
	   CreditCardPayments cs = new CreditCardPayments(20000);
	   cs.payments();
	   
	   Upipayments upi = new Upipayments(544388);
	   upi.payments();
	   
	   // interface + lambda functions using for billing generator
	   BillingGenerator.billingHeader();
	   
	   BillingGenerator bill = (amount)->{
		   System.out.println("Amount :"+amount);
		   System.out.println("thanks for your payment");
		   
	   };
	   bill.billingformat();
	   bill.billgenerate(455598);
	   
			   
   }
}
