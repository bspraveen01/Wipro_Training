package Basics1;

import java.util.Scanner;

public class UserInputDatatypeP10 {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  String name = sc.nextLine();
    	  int age = sc.nextInt();
    	  double height = sc.nextDouble();
    	  
    	  System.out.println("name:"+name);
    	  System.out.println("age :"+age);
    	  System.out.println("height :"+height);
      }
}
