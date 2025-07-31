package Day9;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {
        public static void main(String[] args) throws IOException {
        	FileWriter writer = new FileWriter("C:\\Users\\SRIRAMPRAVEEN\\Downloads\\hello.txt");
        	writer.write("hii this is Sriram Praveen");
        	writer.write(" How are you");
        	writer.close();
        	
        	System.out.println("Data written successfully");
        }
}
