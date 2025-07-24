package Day4;

public class PropertyOverloading {
	
     public void renthouse(int food, int expenses, int rent) {
    	 double res =(double)(food+expenses+rent);
    	 System.out.println("rent :"+res);
     }
     public void renthouse(int food, double rent, int expenses) {
    	 double res = food+rent+expenses;
    	 System.out.println("rent house:"+res);
     }
     public void renthouse(double expenses, double rent, double food) {
    	 double res = food+rent+expenses;
    	 System.out.println("rent house:"+res);	 
     }
     
     public static void main(String[] args) { 
    	 PropertyOverloading res = new PropertyOverloading();
    	 res.renthouse(1200, 1300, 1400);
    	 res.renthouse(1390, 1200, 1330);
    	 res.renthouse(1300, 1230, 1330);
     }
     
}
