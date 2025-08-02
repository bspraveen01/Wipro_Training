package Day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Reader1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\SRIRAMPRAVEEN\\Downloads\\hello.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
