package lab6;

class A {
        public int a = 100;
} // end of class A.

class B extends A {
        public int a = 80;
} // end of class B.

class C extends B {
        public int a = 60;
} // end of class C.

class D extends C {
        public int a = 40;
} // end of class D.

class E extends D {
        public int a = 10;

        public void show() {
                int a = 0;

                // accessing values from all the classes by upcasting
                System.out.println("Class A: " + ((A) this).a);
                System.out.println("Class B: " + ((B) this).a);
                System.out.println("Class C: " + ((C) this).a);
                System.out.println("Class D: " + ((D) this).a);
                System.out.println("Class E: " + this.a);
                System.out.println("E.show(): " + a);
        } // end of show().
} // end of class E.

public class Ex1 {
        public static void main(String[] args) {
                new E().show(); // anonymous object
                A a1 = new E();
                D d1 = (D) a1;
                System.out.println("Upcasting (E -> A -> D): " + d1.a);
        } // end of main().
} // end of class Ex1.