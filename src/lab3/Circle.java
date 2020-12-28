package lab3;

public class Circle {
    static double PI;           // variables PI is a class variable, it is not instance specific
    private double radius;      
    
    //overloaded constructor
    Circle(double radius) {
        this.radius = radius;
        Circle.PI = 3.141; 
    }

    //accessor method
    public double getRadius() { return radius; }

    //mutator method
    public void setRadius(double radius) { this.radius = radius; }
    
    //method to find the area
    public double area() { return (PI * radius * radius); }
    
    //static method's are not instance specific
    public final void getCircumference(double radius) {
        // here radius variable is a local variable 
        System.out.println("Circumference = " + 2 * PI * radius);
    }
} // end of Circle


class TestCircle{
    public static void main(String args[]) {
        Circle c1 = new Circle(2.3); 
        c1.area();
        
        // accessing static method with class name Circle.getCircumference(2.3);
        Circle c2 = new Circle(3.45); 
        c2.area();

        // accessing static method with references is discouraged 
        c2.getCircumference(3.45);

        /* 
        1. Make the area function as static and observe the output
            - error: static method referencing non-static data
        2. Remove the formal argument from getCircumference() method and observe the output
            - error: static method referencing non-static data
        3. Rename static to final and observe the error(s) and correct them
            - error for PI: static reference (Circle.PI) to non-static data
        */
    } // end of main
} // end of Test