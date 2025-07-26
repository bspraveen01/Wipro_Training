package Day6;

public class Array_ExceptionalHandling {
   public static void main(String[] args) {
	   try {
		   int[] arr= {12,43,54,76,90};
		   System.out.println("Arrays value :"+arr[6]);
	   }catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("Accessing a invalid Index value");
	   }
	   finally {
		   System.out.println("Program successfully completed");
	   }
   }
}
