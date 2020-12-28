package lab2;

import java.util.Scanner;

class Example2 {
    public static void main(String[] args) {
        int num1;
        double double1;
        String numStr1, numStr2;

        // Instantiate Scanner class with System.in as input to constructor
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an int: ");
        num1 = in.nextInt();
        System.out.println("Int: " + num1);

        System.out.println("Enter a double: ");
        double1 = in.nextDouble();
        System.out.println("Double: " + double1);

        System.out.println("Enter your first name: ");
        numStr1 = in.next();
        System.out.println("First name: " + numStr1);

        System.out.println("Enter your last name: ");
        numStr2 = in.next();
        System.out.println("Last name: " + numStr2);

        // close Scanner
        in.close();
    } // end of main   
} // end of Example2