package Day1;

public class ClassNotFoundException {
	
	public int add(int a, int b) {
		return a+b;
	}
     public static void main(String[] args) {
    	 // if we want to call the add method then we need to create a object 
    	 ClassNotFoundException erc = new ClassNotFoundException();
    	 int res = erc.add(23, 34);
    	 System.out.println(res);
     }
}

