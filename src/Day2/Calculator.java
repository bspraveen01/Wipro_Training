package Day2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("enter first number :");
    	double a = sc.nextDouble();
    	System.out.print("enter a operation: ");
    	char ope = sc.next().charAt(0);
    	System.out.print("enter second number :");
    	double b = sc.nextDouble();
    	double res = 0;
    	switch(ope) {
    	case '+': res = a + b;
    	         break;
    	case '-': res = a - b;
    	         break;
    	case '*': res = a * b;
    	         break;
    	case '/': res = a / b;
    	         break;
    	case '%': res = a % b;
    	         break;
    	default : System.out.println(" illegal expression ");
    	}
    	
    	System.out.println(res);
    	
    }
}
