package lab3;

/* a) error: static to non static reference */
// public class Exercise1 {
//     static int x = 10;
//     public static void main(String[] args) {
//         System.out.println(x);
//     }
//     static {
//         System.out.println(x + " ");
//     }
// }

/* 
b) x cannot be defined as a static local variable, final should be used instead. 
z -> error: static reference to non-static field
*/
// public class Exercise1 {
//     static int y;
//     int z;
//     public static void main(String[] args) {
//         System.out.println(method1());
//     }
//     public static int method1() {
//         int x = 0;
//         x++;
//         y = 5;
//         return x;
//     }
// }

/*
c) Order of execution is important
*/
class stest {
    private static String[] Str; 
    
    static {
        System.out.println("1.%"); 
    }
    
    public stest() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) { 
        System.out.println("2.@");
    }
    static {
        System.out.println("3.&"); 
    }
    static {
        stest.main(Str);
        test.main(Str);
        System.out.println("4.~"); 
    }
    static { System.out.println("5.$"); }

    public static void method1() {
        System.out.println("8.(");
    }
}

class test{
    public static void main(String[] args) {
        stest x = new stest();
        // stest.main(args); 
        // stest.main(args); 
        // stest.method1();
        System.out.println("6.#");
    } 

    static { System.out.println("7.*"); } 
}
    