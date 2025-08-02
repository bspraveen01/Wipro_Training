package Day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {
       public static void main(String[] args) throws IOException {
    	   BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\SRIRAMPRAVEEN\\Downloads\\hello.txt"));
    	   {
    		   br.write("this is bufferedReader");
    		   br.close();
    		   System.out.println(" written Successfully");
    	   }
       }
}
