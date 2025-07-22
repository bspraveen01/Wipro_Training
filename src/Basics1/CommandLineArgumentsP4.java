package Basics1;

public class CommandLineArgumentsP4 {
   public static void main(String[] args) { //args is a String array that stores command-line arguments passed to the program.
	   if(args.length<2) {
		   System.out.println(" enter two numbers ");
		   return;
	   }
	   //try block to handle any NumberFormatException that may occur when parsing integers.
	   try { 
		   int m = Integer.parseInt(args[0]); // it Converts the first argument from String to int
		   int n = Integer.parseInt(args[1]); // same like second argument
		   int sum = m+n;
		   System.out.println("sum:"+(sum));
		   
	   }catch(NumberFormatException e) {
		   System.out.println("Invalid Integer"+e.getMessage());
	   }
   }
}
