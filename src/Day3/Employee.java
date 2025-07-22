package Day3;

abstract class Employee {
    String name;
    int id;
    
    //When you create an object using new, a constructor automatically runs to assign values to the object’s variables.
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
    
	abstract double calculateSalary(); // why beacause salary is different for part time employees and full time employees.
	
	// common method
	void display() {
		System.out.println("id :"+id);
		System.out.println("name :"+name);
	}

}
class FulltimeEmpolyees extends Employee{

	private double salary;
	public FulltimeEmpolyees(String name, int id, double salary) {
		super(name, id);
		this.salary=salary;
		
	}
	
	double calculateSalary() {
		return salary;
	}
	
}

class PartTimeEmployees extends Employee{
	
	private int hours;
	private double salaryperhour;

	public PartTimeEmployees(String name, int id, int hours, double salaryperhour) {
		super(name, id);
		this.hours = hours;
		this.salaryperhour=salaryperhour;
	}
	
	double calculateSalary() {
		return hours*salaryperhour;
		
	}
}

class Employeeclass{
	public static void main(String[] args) {
		FulltimeEmpolyees fte = new FulltimeEmpolyees("praveen",1,50000);
		fte.display();
		System.out.println("calulate salary :"+fte.calculateSalary());
		
		PartTimeEmployees pts = new PartTimeEmployees("karthik",2, 80, 250);
		pts.display();
		System.out.println("calculate salary "+ pts.calculateSalary());
	}
}