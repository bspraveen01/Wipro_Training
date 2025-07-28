package Day1;

public class NonStatic {
    int count=0;
    void increment() {
    	count++;
    }
    int getcount() {
    	return count;
    }
    public static void main(String[] args) {
    	NonStatic s1 = new NonStatic();
    	NonStatic s2 = new NonStatic();
    	s1.increment(); // call one time
    	s2.increment();
    	s2.increment();
    	System.out.println("s1"+s1.getcount()); // 1
    	System.out.println("s2"+s2.getcount()); // 2
    }
}

/* Another example of NON static methods.
 * public class staticmethodExample {
    static int addition (int a , int b) {
    	 return a+b;
     }
     public static void main(String[] args) {
    	int res = staticmethodExample().addition(20,40);
    	System.out.println(res);	 
     }
}

 */