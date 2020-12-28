package lab3;

/* Order of execution:
1) Static blocks upon loading class/running file
    - Static variables/methods called from static blocks included
2) Main method
*/

public class StaticExample2{
    static {
        System.out.println("This is first static block");
    }

    public StaticExample2(){ 
        System.out.println("This is constructor");
    }

    public static String staticString = "Static Variable";
    
    static {
        System.out.println("This is second static block and " + staticString);
    }
    
    public static void main(String[] args){ 
        // StaticExample2 statEx = new StaticExample2(); 
        StaticExample2.staticMethod2();
    }
    
    static {
        staticMethod();
        System.out.println("This is third static block"); 
    }

    public static void staticMethod() { 
        System.out.println("This is static method");
    }
    
    public static void staticMethod2() { 
        System.out.println("This is static method2");
    }
}