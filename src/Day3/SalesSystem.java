package Day3;

public class SalesSystem {
   private String productname;
   private double price;
   private int quantity;
   
   public SalesSystem(String productname, double price, int quantity) {
	   this.productname=productname;
	   this.price=price;
	   this.quantity=quantity;
   }
   
   // returning total price.
   public double getTotalPrice(){
	   return price*quantity;
   }
    
   
   // display details
   public void displayItem() {
	   System.out.println(productname+"\t"+price+"\t"+quantity);
   }
}
