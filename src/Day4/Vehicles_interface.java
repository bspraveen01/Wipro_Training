package Day4;

interface Vehicles_interface11 {
      void speed();
      void brand();
      void price(double amount);
}
class Vehicles_1 implements Vehicles_interface11{

	@Override
	public void speed() {
		System.out.println("the speed of car is : 54KMPH");
		
	}

	@Override
	public void brand() {
		System.out.println("the brand of car is : Toyoto");
		
	}

	@Override
	public void price(double amount) {
		System.out.println("the price of this car is"+amount);
		
	}
	
}
class Vehicles_2 implements Vehicles_interface11{

	@Override
	public void speed() {
		System.out.println("the speed of car is : 35 KMPH");
		
	}

	@Override
	public void brand() {
		System.out.println("the brand of car is : suzuki");
		
	}

	@Override
	public void price(double amount) {
		System.out.println("the price of this car is"+amount);
		
	}
	
	
}

public class Vehicles_interface{
	public static void main(String[] args) {
		Vehicles_interface11 vres;
		vres = new Vehicles_1();
		vres.brand();
		vres.speed();
		vres.price(1000000);
		
		vres = new Vehicles_2();
		vres.brand();
		vres.price(54000);
		vres.speed();
	}
}