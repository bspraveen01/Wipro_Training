package Day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.io.*;

//Step 1: Student class implements Serializable
class Students implements Serializable {
 private static final long serialVersionUID = 1L; // recommended for Serializable classes

 private String name;
 private int age;

 public Students(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getters and setters
 public String getName() {
     return name;
 }
 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }
 public void setAge(int age) {
     this.age = age;
 }
}

public class Serialization {
 public static void main(String[] args) {

     String filePath = "C:\\Users\\SRIRAMPRAVEEN\\Downloads\\hello.txt";

     try {
         // Step 2: Create student object and modify values
         Students s1 = new Students("Ganesh", 17);
         s1.setName("Praveen");
         s1.setAge(20);

         // Step 3: Serialize object to file
         FileOutputStream out = new FileOutputStream(filePath);
         ObjectOutputStream output = new ObjectOutputStream(out);
         output.writeObject(s1);
         output.close();
         out.close();
         

     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

