package Day4;

abstract class Realestate{
	abstract void house();
	abstract void apartment();
}
class Varahi extends Realestate{

	@Override
	void house() {
		int food = 10000;
		double rent=5000;
		int expensives = 6000;
		double total = (double)(food+rent+expensives);
		System.out.println("the total cost of house :"+total);		
	}

	@Override
	void apartment() {
		int food = 14000;
		double rent = 10000;
		int expensives = 10000;
		double total = (double)(food+rent+expensives);
		System.out.println("the total cost of apartment :"+total);	
		
	}
	
}
class varahi2 extends Realestate{

	@Override
	void house() {
		int food = 15000;
		double rent = 20000;
		int expensives = 25000;
		double res = (double)(food+rent+expensives);
		System.out.println("the total cost of house :"+res);
		
	}

	@Override
	void apartment() {
		int food = 20000;
		double rent = 25000;
		int expensives = 20000;
		double res = (double)(food+rent+expensives);
		System.out.println("the total cost of house :"+res);
		
		
	}
	
}



public class PropertyCalculation {
     public static void main(String[] args) {
    	 Realestate res;
    	 res = new Varahi();
    	 res.house();
    	 res.apartment();
    	 
    	 res = new varahi2();
    	 res.apartment();
    	 res.house();
     }
}
