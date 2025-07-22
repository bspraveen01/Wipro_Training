package Day3;

public class SalesOOP {
	public static void main(String[] args) {
     SalesSystem[] s = {new SalesSystem("biscuts", 20, 2),new SalesSystem("chocolates", 20, 3),new SalesSystem("lays", 20, 5)};
     double grandtotal = 0;
     for(SalesSystem item : s) {
    	 item.displayItem();
    	 grandtotal += item.getTotalPrice(); 
     }
     
     System.out.println("grand total :"+grandtotal);
	}
}
