package Day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.*;  // Required for File, FileReader, BufferedReader, IOException

public class File_ExceptionalHandling {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            // Update the path to a valid location on your system
            File fs = new File("C:\\Users\\SRIRAMPRAVEEN\\Downloads\\hello.txt");
            br = new BufferedReader(new FileReader(fs));

            String readdata;
            while ((readdata = br.readLine()) != null) {
                System.out.println("Data: " + readdata);
            }
        } catch (FileNotFoundException fe) {
            System.out.println("File not found: " + fe.getMessage());
        } catch (IOException ioe) {
            System.out.println("Error reading the file: " + ioe.getMessage());
        } finally {
            try {
                if (br != null) { // if file didn't open successfully. then br still be null. if it is not equal to null . file is opened.
                    br.close(); // Automatically closes both BufferedReader and FileReader
                }
                System.out.println("File stream closed successfully.");
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}

