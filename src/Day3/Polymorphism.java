package Day3;

// example of a Polymorphism - overloading
public class Polymorphism {
	class Calculator{
		public int add(int a , int b) {
	    	return a+b;
	    }
	    public int add(int a, int b, int c) {
	    	return a+b+c;
	    }
	}
    public static void main(String[] args) {
    	Polymorphism p = new Polymorphism();
    	Calculator c = p.new Calculator(); // inside a class we need to give write like this.
    	System.out.println("Sum of Integers :"+c.add(23, 43));
    	System.out.println("Sum of Integers :"+c.add(23, 43, 54));
    }
}
