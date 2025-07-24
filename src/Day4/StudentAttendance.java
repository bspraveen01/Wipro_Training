package Day4;

import java.util.ArrayList;
import java.util.Scanner;

interface StudentDetails {
     void mark(String name, String status);
     void showAttendance();
}
class Students implements StudentDetails{
	// create a array list to add details of a student
	ArrayList<String> Snames = new ArrayList<>();
	ArrayList<String> Status = new ArrayList<>();

	@Override
	public void mark(String name, String status) {
		Snames.add(name);
		Status.add(status);
	}

	@Override
	public void showAttendance() {
		for(int i=0;i<Snames.size();i++) {
			System.out.println(Snames.get(i)+" Status: "+Status.get(i));
		}
		
	}
	
}
public class StudentAttendance{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Students stu = new Students();
		while(true) {
			System.out.println("enter a name");
			String name = sc.nextLine();
			
			if (name.equalsIgnoreCase("done")) {
			    break;
			}

			System.out.println("enter a status");
			String status = sc.nextLine();
			
		}
		stu.showAttendance();
	}
}
