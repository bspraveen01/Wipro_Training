package Day6;

public class ExceptionHandling {
      public static void main(String[] args) {
    	  try {
    		  int a =12;
    		  int b= 0;
    		  int c = a/b;
    		  System.out.println(c);    	
    		  }catch(ArithmeticException e ) {
                   System.out.println("Error Occurred:"+e.getMessage());
    		  }
    	  finally{
    		  System.out.println("program sucessfully completed");
    	  }
      }
}
