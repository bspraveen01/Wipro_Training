package Day11;

import java.io.FileWriter;
import java.io.IOException;
public class AppendDataTextFile {
     public static void main(String[] args) {
	     String filePath = "C:\\Users\\SRIRAMPRAVEEN\\Downloads\\hello.txt";
	     try {
	      // true => append mode
	      FileWriter writer = new FileWriter(filePath, true); 
	            
	      writer.write("\nThis is the new appended line."); // \n to start on a new line
	      writer.close();
	            
	      System.out.println("Data appended successfully.");
	   } catch (IOException e) {
	        e.printStackTrace();
	        }
	    }
	}

/* Note: The second argument (true) tells the FileWriter to open the file in append mode.

If you use false or omit the second argument, it will overwrite the existing content.
 * 
 * */

