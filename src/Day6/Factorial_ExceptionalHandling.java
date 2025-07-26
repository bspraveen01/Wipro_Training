package Day6;

public class Factorial_ExceptionalHandling {
       public static void main(String[] args) {
    	   try {
    		   int n = 0;
    		   if(n<0) {
    			   throw new IllegalArgumentException("Factorial is not defined for negative numbers");
    		   }
    		   int fact =1;
    		   for(int i=1;i<=n;i++) {
    			   fact= fact*i;
    		   }
    		   System.out.println(fact);
    	   }catch(Exception e) {
    		   System.out.println("Error is occured:"+e.getMessage());
    	   }
    	   finally {
    		   System.out.println("program is successfully completed");
    	   }
       }
}
