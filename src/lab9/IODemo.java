// file handling demo

package lab9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IODemo {
    public static void main(String[] args) {
        String fileName = "demo.txt";

        writer(fileName);
        reader(fileName);
    }

    public static void reader(String fileName) {
        Scanner inStream = null;
        try {
            inStream = new Scanner(new FileInputStream(fileName));
        }
        catch (FileNotFoundException e) {
            // IOException catches all possible exceptions here
            // FileNotFound only takes care of file
            System.out.println("Error: File Not Found.");
            System.exit(0);
        }
        // include read statements here
        // Scanner's read functions  work the same way
        String nextLine;
        System.out.println("Contents of " + fileName);
        while (inStream.hasNextLine()) {
            nextLine = inStream.nextLine();
            System.out.println(nextLine);
        }
        inStream.close();
    }

    public static void writer(String fileName) {
        PrintWriter outStream = null;
        try {
            // include print statements in try block as well
            // second arg -> append if true else write
            outStream = new PrintWriter(new FileOutputStream(fileName, false));
            outStream.print("Hello, this is a demo.");
        } 
        catch (IOException e) {
            // IOException catches all possible exceptions here
            // FileNotFound only takes care of file
            System.out.println("Error: File Not Found.");
            System.exit(0);
        }
        finally {
            outStream.close();
        }
    }
} // end of class IODemo.