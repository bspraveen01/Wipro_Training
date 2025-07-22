package Day2;

import java.util.Scanner;


public class Pallindrome {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // Convert string to lowercase to ignore case sensitivity (optional)
        s = s.toLowerCase();

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // Check if the original string and reversed string are equal
        if (rev.equals(s)) {
            System.out.println("It is a Palindrome: " + s);
        } else {
            System.out.println("It is not a Palindrome: " + s);
        }

        sc.close(); // Always close the scanner
        
        
        String str ="madam";
        StringBuilder sb = new StringBuilder(str); // we have to pass string here.
        sb.reverse();
        if(str.equals(sb.toString())) { // we have to to string of this.
        	System.out.println("pallindrome");
        }else {
        	System.out.println("not a pallindrome");
        }
    }
}
