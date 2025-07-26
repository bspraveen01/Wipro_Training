package Day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileAsText {
     public static void main(String[] args) throws IOException {
    	 BufferedReader br = null;
    	 try {
    		 File f = new File("C:\\users\\SRIRAMPRAVEEN\\Downloads\\details.csv");
    		 br = new BufferedReader(new FileReader(f));
    		 String data = br.readLine();
    		 while(data!=null) {
    			 System.out.println("data :"+data);
    			 data = br.readLine();
    		 }
    	 }catch(FileNotFoundException e) {
    		 System.out.println("file is not found");
    	 }
    	 finally {
    		 if(br!=null) {
    			 br.close();
    		 }
    		 System.out.println("program executed");
    	 }
     }

}
