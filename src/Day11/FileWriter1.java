package Day11;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		String s =" hello iam here in wipro Training";
		FileWriter writer1 = new FileWriter("C:\\Users\\SRIRAMPRAVEEN\\Downloads\\hello.txt");
		writer1.write(s);
		writer1.close();
		System.out.println("writing completed ");
	}

}
