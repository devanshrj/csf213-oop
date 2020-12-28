package lab3;

public class Wrapper {
    // case 1 - Auto Unboxing
    // public static void main(String args[]){
    //     Integer I = new Integer(10);
    //     Integer J = new Integer(20);
        
    //     // Observe the output for following two statements carefully 
    //     System.out.println(I.intValue());
    //     System.out.println(I);
        
    //     // Observe the output for following two statements carefully 
    //     System.out.println(J.intValue()); 
    //     System.out.println(J);
        
    //     Integer K1 = new Integer(I.intValue() + J.intValue());
        
    //     // Auto Unboxing
    //     Integer K2 = I + J + K1; 
    //     System.out.println(K2);
    // } // end of Main

    // case 2 - Auto Boxing
    public static void main(String args[]){
        Integer I = 10;
        Integer J = 20;
        
        // Observe the output for following two statements carefully 
        System.out.println(I.intValue());
        System.out.println(I);
        
        // Observe the output for following two statements carefully 
        System.out.println(J.intValue()); 
        System.out.println(J);
        
        Integer K1 = I + J;
        
        // Auto Unboxing
        Integer K2 = I + J + K1; 
        System.out.println(K2);
    } // end of Main
}
