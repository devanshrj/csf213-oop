package lab3;

public class Complex {
    // instance variables
    private double realPart;
    private double imPart;

    // constructors
    public Complex() {
        this.realPart = 0;
        this.imPart = 0;
    }

    public Complex(double realPart, double imPart) {
        this.realPart = realPart;
        this.imPart = imPart;
    }

    // variable arguments -> c will be treated as an array
    public Complex(Double... c) {
        this.realPart = c[0];
        if (c.length == 1) { this.imPart = 0; }
        else { this.imPart = c[1]; }
    }

    // accessors
    public double getReal() { return this.realPart; }
    public double getIm() { return this.imPart; }

    // mutators
    public void setReal(double realPart) { this.realPart = realPart; }
    public void setIm(double imPart) { this.imPart = imPart; }

    // instance methods with return type Complex, that is, a new object is returned
    public Complex add(Complex otherNum) {
        Complex out = new Complex(this.realPart + otherNum.getReal(), this.imPart + otherNum.getIm());
        return out;
    }

    public Complex subtract(Complex otherNum) {
        Complex out = new Complex(this.realPart - otherNum.getReal(), this.imPart - otherNum.getIm());
        return out;
    }
    
    public Complex multiply(Complex otherNum) {
        Complex out = new Complex(this.realPart * otherNum.getReal(), this.imPart * otherNum.getIm());
        return out;
    }

    public Complex divide(Complex otherNum) {
        Complex out = new Complex(this.realPart / otherNum.getReal(), this.imPart / otherNum.getIm());
        return out;
    }

    public String toString() { 
        return "Real = " + this.realPart + ", Imaginary = " + this.imPart; 
    }
} // end of Complex

class ComplexDemo {
    public static void main(String[] args) {
        Complex num1 = new Complex(10, 4);
        Complex num2 = new Complex(5, 1);

        System.out.println("Num 1: " + num1);
        System.out.println("Num 2: " + num2);

        System.out.println("\nOperations ---------");
        System.out.println("Num 1 + Num 2: " + num1.add(num2));
        System.out.println("Num 1 - Num 2: " + num1.subtract(num2));
        System.out.println("Num 1 * Num 2: " + num1.multiply(num2));
        System.out.println("Num 1 / Num 2: " + num1.divide(num2));

        Complex num3 = num1.add(num2.multiply(num2));
        System.out.println("\nNum 1 + (Num 2 * Num 2): " + num3);
    }
}