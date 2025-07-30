package Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
     
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
	InputStreamReader isr = new InputStreamReader(null);
	BufferedReader br = new BufferedReader(isr); // inside bufered Reader we are calling InputStreamReader.
	
	int a  = Integer.parseInt(br.readLine());
	System.out.print(a);
	br.close();
	isr.close();
	
	}

}
