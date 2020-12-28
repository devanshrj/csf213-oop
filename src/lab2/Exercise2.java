package lab2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Instantiate Scanner class with System.in as input to constructor
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 10 integers: ");

        // call nextInt method on BufferedReader instance
        // br will take string input, cast to int
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += in.nextInt();
        }
        System.out.println("Sum is: " + sum);

        in.close();
    } // end of main
}