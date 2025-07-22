package Day3;

public class StudentTest {
     String name;
     int age;
     void display() {
    	 System.out.println("name:"+name);
    	 System.out.println("age:"+age);
     }
     public static void main(String[] args) {
    	 StudentTest st = new StudentTest();
    	 st.name="praveen";
    	 st.age=22;
    	 st.display();
     }
}
