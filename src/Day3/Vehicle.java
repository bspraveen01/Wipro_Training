package Day3;

public class Vehicle {
    void start() {
    	System.out.println("vehicle started");
    }
}
class Car extends Vehicle{
	void drive() {
		System.out.println("vehicle driving");
	}
}

class Vehicle1{
	public static void main(String[] args) {
		Car c =  new Car();
		c.start();
		c.drive();
	}
}
