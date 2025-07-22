package Day2;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
	     int a = 10, b=3;
	     
	     // Arithmetic Operators : it is used to perform add, sub, mul.. etc.
	     System.out.println(a+b);
	     System.out.println(a-b);
	     System.out.println(a*b);
	     System.out.println(a/b);
	     System.out.println(a%b);
	     
	     // Relational Operators or comparison operators : it is used to compare two values. it returns boolean values.
	     
	     System.out.println(a>b);
	     System.out.println(a>=b);
	     System.out.println(a<b);
	     System.out.println(a<=b);
	     System.out.println(a==b);
	     System.out.println(a!=b);
	     
	     // Logical Operators: logical AND, OR, NOT it returns boolean values
	     System.out.println(a>0 && b>0); // both condition should be satisified.
	     System.out.println(a>0 || b>0); // Atleast one condition should be satisified.
	     System.out.println(!(a>b)); // NOT condition. if condition is true it will return false.
	     
	     // Assignment Operators , +=, -=, /=, %=, *=
	    
	     System.out.println(a+=3);
	     System.out.println(a-=3);
	     System.out.println(a*=3);
	     System.out.println(a/=3);
	     System.out.println(a%=3);
	     
	     // unary operator
	     int c =20;
	     System.out.println(-c);
	     System.out.println(+c);
	     System.out.println(c++); // a value return after it will increment.
	     System.out.println(++c); // first increment 
	     System.out.println(c--); // first a value return later it will decrement.
	     System.out.println(--c); // first decrement
	  
	     // ! - Not operator
	     boolean isRaining = true;
         if (!isRaining) {
	            System.out.println("Let's go outside!");
	        } else {
	            System.out.println("Take an umbrella.");
	     }
	        
	     //Bitwise Opeartors
         System.out.println(a&b);
         System.out.println(a|b);
         System.out.println(a^b);
         System.out.println(~ a);
         System.out.println(a>>2);
         System.out.println(a<<2);
	       
         // ternary Opeartor:
         int ab=10, bd=20;
         int d = (ab>bd && bd>0)? ab: bd;
         System.out.println(d);
	        
	     
	     
	}

}
