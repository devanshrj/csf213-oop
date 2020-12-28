package lab2;

import java.util.Scanner;

public class TaxOnSalary {
    private double salary;
    private boolean isPAN;      // PAN submission status

    // constructors
    // constructor with 1 param
    public TaxOnSalary(boolean isPAN) {
        this.salary = 1000;
        this.isPAN = isPAN;
    }

    // constructor with 0 params
    public TaxOnSalary() {
        this.salary = 0;
        this.isPAN = false;
    }

    // accessor methods
    public double getSalary() {
        return this.salary;
    }

    public boolean getIsPan() {
        return this.isPAN;
    }

    // input salary from user
    public void inputSalary() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Salary: ");
        this.salary = in.nextDouble();
        
        // in.close() closes the scanner as well as System Input Stream leading to the error for the second tax object
        // "Exception in thread "main" java.util.NoSuchElementException"
        // https://stackoverflow.com/questions/13042008/java-util-nosuchelementexception-scanner-reading-user-input
        // in.close();
    }

    // tax calculation
    public double calculateTax() {
        double tax;
        if (this.salary < 180000) {
            // if PAN submitted, tax = 0
            if (this.isPAN) {
                tax = 0;
            } else {
                tax = 0.05 * this.salary;
            }
        } else if (180000 < this.salary && this.salary < 500000) {
            tax = 0.1 * this.salary;
        } else if (500000 < this.salary && this.salary < 1000000) {
            tax = 0.2 * this.salary;
        } else {
            tax = 0.3 * this.salary;
        }
        return tax;
    }

} // end of TaxOnSalary