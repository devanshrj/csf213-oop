// Lab 6: Exercise 3.2 Driver
package lab6;

import java.util.Scanner;

public class TestWorker {
        public static void main(String[] args) {
                // Instantiate Scanner class with System.in as input to constructor
                Scanner in = new Scanner(System.in);

                // input worker type for run time polymorphism
                System.out.println("Type of Worker: ");
                String workerType = in.nextLine();

                // downcasting
                Worker worker;

                // check worker type and create child object
                if (workerType.equals("Full time worker")) {
                        System.out.println("-----------------");
                        System.out.println("Full Time Worker:");
                        worker = new FullTimeWorker("Full X", 100, 240);
                        System.out.println("Pay earned by " + worker.getName() + " = " + worker.computePay());
                }
                else {
                        System.out.println("-------------");
                        System.out.println("Hourly Worker:");
                        worker = new HourlyWorker("Hourly Y", 50, 40);
                        System.out.println("Pay earned by " + worker.getName() + " = " + worker.computePay());
                }

                // close Scanner
                in.close();
        } // end of main().
} // end of class TestWorker.
