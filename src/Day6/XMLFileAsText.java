package Day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class XMLFileAsText {
      public static void main(String[] args) {
    	  BufferedReader br = null;
    	  try {
    		  File f = new File("C:\\Users\\SRIRAMPRAVEEN\\Downloads\\students.XML");
    		  br = new BufferedReader(new FileReader(f));
    		  String readdata = br.readLine();
    		  while (readdata != null) {
    		      System.out.println("data: " + readdata);
    		      readdata = br.readLine();//read the next line of text from the file.
    		  }

    	  }catch(FileNotFoundException e) {
    		  System.out.print("file is not found:"+e.getMessage());
    	  }catch(IOException e) {
    		  System.out.println("error reading file:"+e.getMessage());
    	  }
    	  finally {
    		  try {
    			  if(br!=null) {
    				  br.close();
    			  }
    		  }catch(Exception e) {
    			  System.out.println("error occured while closing the file");
    		  }
    		  System.out.println("successfully read the xml file as a text");
    	  }
      }
}
