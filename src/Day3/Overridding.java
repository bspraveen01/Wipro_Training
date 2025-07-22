package Day3;

public class Overridding {
     void display() {
    	 System.out.println("this is super class");
     }
}
class sub extends Overridding{
	void display() {
		System.out.println(" first child class");

	}
 
}
class childsub extends Overridding{
	void display() {
		System.out.println("second child class");
	}
}

class Override{
	public static void main(String[] args) {
		Overridding sc = new childsub();
		sc.display();
		
		Overridding or = new Overridding();
		or.display();
		
		sub s =new sub();
		s.display();
	}
}