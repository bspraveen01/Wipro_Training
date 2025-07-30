package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "student[age="+age+" name :"+name+ "]";
		
	}
}


public class Comparable_Approach2 {

	static Comparator<Student> com = new Comparator<Student>() {

		@Override
		public int compare(Student i, Student j) {
			if(i.age>j.age) {
				return 1;
			}else {
				return -1;
			}
		}
		
	};
      public static void main(String[] args) {
    	  Student s1 = new Student(24,"kishore");
    	  Student s2 = new Student(29,"Sriram");
    	  Student s3 = new Student(23,"Praveen");
    	  List<Student> stud = new ArrayList<>();
    	  stud.add(s1);
    	  stud.add(s2);
    	  stud.add(s3);
    	  
    	  Collections.sort(stud,com);
    	  for(Student s :stud) {
    		  System.out.println(s);
    		  
    	  }
    	  
    	  
      }

}
