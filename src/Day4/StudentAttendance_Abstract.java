package Day4;

import java.util.ArrayList;
import java.util.Scanner;

abstract class StudentAttendence_Abstract11 {
         abstract void mark(String name, String status);
         abstract void showAttendance();
}
class Student4details extends StudentAttendence_Abstract11{

	ArrayList<String> Snames = new ArrayList<>();
	ArrayList<String> Sstatus = new ArrayList<>();
	@Override
	void mark(String name, String status) {
		Snames.add(name);
		Sstatus.add(status);
		
	}

	@Override
	void showAttendance() {
		for(int i=0;i<Snames.size();i++) {
			System.out.println("names:"+Snames.get(i)+" status : "+Sstatus.get(i));
			
		}
		
	}
	
}

public class StudentAttendance_Abstract{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student4details student = new Student4details();
		while(true) {
			String name = sc.nextLine();
			String status = sc.nextLine();
			
			student.mark(name,status);
			student.showAttendance();
		}
	}
}
