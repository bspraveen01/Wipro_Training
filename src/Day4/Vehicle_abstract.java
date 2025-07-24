package Day4;

abstract class Vehicle_abstract11 {
     abstract void speed();
     abstract void brand();
}
class Vehicles extends Vehicle_abstract11{

	@Override
	void speed() {
	  System.out.println("the speed of car is : 24KMPH");
		
	}

	@Override
	void brand() {
		System.out.println("the brand of car is :Audi");
		
	}
	
}

class Vehicles2 extends Vehicle_abstract11{

	@Override
	void speed() {
		System.out.println("the speed of car is : 28kmph");
		
	}

	@Override
	void brand() {
	     System.out.println("the brand of car is : Tata");
		
	}
	
}

public class Vehicle_abstract{
	public static void main(String[] args) {
		Vehicle_abstract11 vres;
		vres = new Vehicles();
		vres.speed();
		vres.brand();
		
		vres = new Vehicles2();
		vres.speed();
		vres.brand();
	}
}