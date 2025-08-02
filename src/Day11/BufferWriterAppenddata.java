package Day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterAppenddata {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\SRIRAMPRAVEEN\\Downloads\\hello.txt";
        try {
            // FileWriter in append mode
            FileWriter fw = new FileWriter(filePath, true); 
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine(); // optional: adds a new line before writing
            bw.write("This line is added using BufferedWriter.");
            
            bw.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
