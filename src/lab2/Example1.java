package lab2;

import java.io.*;

class Example1 {
    public static void main(String[] args) throws IOException {
        // Instantiate InputStreamReader class and pass System.in to its constructor
        InputStreamReader isr = new InputStreamReader(System.in);

        // Instantiate BufferedReader class and pass reference variable isr to its constructor
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter Your First Name: ");

        // call readLine method on BufferedReader instance
        String name = br.readLine();
        System.out.println("Your name is: " + name);
    } // end of main
} // end of Example1