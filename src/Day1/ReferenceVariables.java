package Day1;


class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	// retuning the data so we have to override the toString method here.
	public String toString() {
		return name;
	}
}
public class ReferenceVariables {
 public static void change(Person p) { // call the class here
	 p.name = "Sriram Praveen";
 }
 public static void main(String[] args) {
	 
	 int x = 20;
	 int y = x; //y is a copy of x, so changing y doesn't affect x.
	 y=25;
	 System.out.println("X:"+x);
	 
	 
	 Person p1 = new Person("abc");
	 Person p2 = p1;  // p1 is reference variable.
	 
	 p2.name = "xre"; //Now, both p1 and p2 refer to the same object in memory.
     System.out.println("p1 = " + p1); // So, now p1.name is also "xre"

     change(p1); //Passes the reference p1 into the method.
     System.out.println("p1 after changeName = " + p1);
	 //Now, both p1 and p2 refer to the same object in memory.
 }
}
