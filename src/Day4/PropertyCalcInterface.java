package Day4;

interface PropertyCalcInterface11 {
      void house(double rent, int food, int expenses);
      void apartments(double rent,int food, int expenses);
}
class Chaitanya implements PropertyCalcInterface11{

	@Override
	public void house(double rent, int food, int expenses) {
		double res = (double)(rent+food+expenses);
		System.out.println("house cost :"+res);
		
	}

	@Override
	public void apartments(double rent, int food, int expenses) {
		double res = (double)(rent+food+expenses);
		System.out.println("Apartment cost :"+res);
		
	}
	
}
class Sriram implements PropertyCalcInterface11{

	@Override
	public void house(double rent, int food, int expenses) {
		double res = (double)(rent+food+expenses);
		System.out.println("house cost :"+res);
		
	}

	@Override
	public void apartments(double rent, int food, int expenses) {
		double res = (double)(rent+food+expenses);
		System.out.println("Apartment cost :"+res);	
	}
	
}

public class PropertyCalcInterface{
	public static void main(String[] args) {
		PropertyCalcInterface11 res;
		res = new Chaitanya();
		res.house(12000,14000, 13000);
		res.apartments(15000,16000, 12000);
		
		res = new Sriram();
		res.house(10000, 12000, 15000);
		res.apartments(17000, 13000, 13000);
		
		
	}
}
