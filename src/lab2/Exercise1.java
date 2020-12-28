package lab2;

import java.io.*;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        // Instantiate InputStreamReader class and pass System.in to its constructor
        InputStreamReader isr = new InputStreamReader(System.in);

        // Instantiate BufferedReader class and pass reference variable isr to its constructor
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter 10 integers: ");

        // call readLine method on BufferedReader instance
        // br will take string input, cast to int
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println("Sum is: " + sum);
    } // end of main
}