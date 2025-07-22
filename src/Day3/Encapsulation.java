package Day3;

public class Encapsulation {
    private String name;
    private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
}

class Main{
	public static void main(String[] args) {
		Encapsulation sed = new Encapsulation();
		sed.setSalary(29000.00);
		sed.setName("praveen");
		System.out.println("name :"+ sed.getName()+" salary :"+sed.getSalary());
	}
}
/*
 * or we can get the data in one method also.
 * 
 *for getting data
 * void display(){
 * S.o.p(name);
 * s.o.p(salary);
 * 
 *give just two methods for sending data.
 *setName
 *SetSalary.
 *
 *After Object creation 
 *set the names
 *and call display method.
 * 
 * 
 * */
