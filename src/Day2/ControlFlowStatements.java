package Day2;

public class ControlFlowStatements {
     public static void main(String[] args) {
    	 // Control Flow statements .
    	 int  a =20, b=10;
    	 if(a>b) {
    		 System.out.println("a is greater");
    	 }
    		
    	 // else if statements
    	 int n = 19;
    	 if(n%2==0) {
    		 System.out.println("even number");
    	 }else {
    		 System.out.println("odd number");
    	 }
    	 
    	 // if-else if 
    	 
    	 int m1 = 60;

    	 if (m1 >= 90) {
    	     System.out.println("Grade A");
    	 } else if (m1 >= 75) {
    	     System.out.println("Grade B");
    	 } else if (m1 >= 60) {
    	     System.out.println("Grade C");
    	 } else {
    	     System.out.println("Fail");
    	 }

    	 // switch case statements 
    	 switch(args[0]) {
    	 case "mon": 
    	 case "tue":
    	 case "wed":
    	 case "thu":
    	 case "fri": System.out.println("working day");
    	             break;
    	 case "sat": 
    	 case "sun": System.out.println("weekend");
    	             break;
    	 default: System.out.println("invalid");
    	 
    	 }
    	 
    	 
    	 
    	 // loops: for, while , do while
    	 // for loop : when we know exact number of iteration then we can use it.
    	 for(int i=1;i<=10;i++) {
    		 System.out.print(i);
    	 }
    	 System.out.println();
    	 // while loop : when we  don't know exact number of iteration then we can use this loop.
    	 
    	 int i=1;
    	 while(i<=10) {
    		 System.out.print(i);
    		 i++;
    	 }
    	 System.out.println();
    	 
    	 // do -loop : if you want to execute atleast one time. then we can use it.
    	 
    	 int w=1;
    	 do {
    		 System.out.print(w);
    		 w++;
    	 }while(w<=10);
    	 System.out.println();
    	 
    	 // sum of 1 to 10 numbers
    	 
    	 int sum =0;
    	 for(int k=1;k<=10;k++) {
    		 sum = sum+k;
    	 }
    	 System.out.println("sum:"+sum);
    	 
    	 // Jump Statements break, continue;
    	 
    	 for(int j=0;j<=10;j++) {
    		 if(j==5) {
    			 break;
    		 }
    		 System.out.println("break :"+j);
    	 }
    	 
    	 // Continue: skips current iteration. passing control to the next iteration.
    	 
    	 for(int j=0;j<=10;j++) {
    		 if(j==5) {
    			 continue;
    		 }
    		 System.out.println("continue:"+j);
    	 }
    	 
    	 // return - exists from method. call method in main method
    	 check(49);
  	 
     }
     
     // return - exists from method.
      public static void check( int number) {
    	  if(number<0) {
    		  System.out.println("negative number");
    		  return;  // exits the method here if number is negative
    	  }
    	  System.out.println("positive number");
    	  System.out.println("positive num :"+number);
    	  
      }
     
     
}
