package lab3;

public class Box {
    private double length, width, height; // Instance Fields
    
    // Constructor Method
    Box(double l, double b, double h){ 
        length = l; width = b; height = h;
    }
    
    // Mutator methods for Length, Width and Height
    public void setLength(double l) { length = l;}
    public void setWidth(double b) { width = b;}
    public void setHeight(double h) { height = h;}
    
    // Accessor Methods for Length, Width and Height
    public double getLength() { return length;}
    public double getWidth() { return width; }
    public double getHeight() { return height;}
    
    public String toString() {
        return "Length: " + length + " Width: " + width + " Height: " + height;  
    }
    
    public double area() {
        return 2 * (length * width + width * height + height * length);
    }
    
    public double volume() { return length * width * height; }

    public static void swapBoxes(Box b1, Box b2) {
        Box temp = b1; 
        b1 = b2; 
        b2 = temp;
        // System.out.println("Swap method: ");
        // System.out.println(b1);
        // System.out.println(b2);
    }
}

// case 1
// class BOXTest {
//     public static void main(String args[]) { 
//         Box b1 = new Box(10,40,60);
//         Box b2 = new Box(20,30,80); 
        
//         System.out.println(b1); 
//         System.out.println(b2); 
//         Box.swapBoxes(b1,b2); 
//         System.out.println(b1); 
//         System.out.println(b2);
//     }
// } // end of Test

// case 2
class BOXtest{
    public static void main(String args[]) { 
        Box b1 = new Box(10,40,60);
        Box b2 = new Box(20,30,80); 
        System.out.println(b1); 
        System.out.println(b2);
    
        Box temp = b1;
        b1 = b2;
        b2 = temp; 
        System.out.println(b1); 
        System.out.println(b2);
    }
}//End of Main