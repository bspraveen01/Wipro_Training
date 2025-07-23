package Billing;

public interface BillingGenerator {
     void billgenerate(double amount);
     
     default void billingformat() {
    	 System.out.println("************ BilLing **********");
    	 
     }
     static void billingHeader() {
    	 System.out.println("welcome billing software system");
     }
}
