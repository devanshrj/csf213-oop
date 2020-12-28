package lab3;

/* Constructor block
1) All constructor blocks are grouped together
2) Executed at the start of every constructor
*/

public class ConstructorBlockExample {
    { 
        System.out.println("This is first constructor block");
    }

    public ConstructorBlockExample(){
        System.out.println("This is no parameter constructor");
    }

    public ConstructorBlockExample(String param1){ 
        System.out.println("This is single parameter constructor");
    }

    {
        System.out.println("This is second constructor block");
    }
    
    public static void main(String[] args){
        new ConstructorBlockExample();
        new ConstructorBlockExample("param1");
    }
}
