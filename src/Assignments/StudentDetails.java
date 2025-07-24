package Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Using HashMap data structures to create a simple program that stores and retrieves student many and their corresponding score. */

public class StudentDetails {
    public static void main(String[] args) {
        Map<String, Integer> studentdetails = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Get Student");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter student name:");
                    String name = sc.nextLine();
                    System.out.println("Enter student marks:");
                    int marks = sc.nextInt();
                    sc.nextLine(); // consume newline
                    studentdetails.put(name, marks);
                    break;

                case 2:
                    System.out.println("Enter student name to get details:");
                    String sName = sc.nextLine();

                    if (studentdetails.containsKey(sName)) {
                        int sMarks = studentdetails.get(sName);
                        System.out.println("Student name: " + sName);
                        System.out.println("Student marks: " + sMarks);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return; // exit from main

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

