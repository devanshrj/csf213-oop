// Inner class demo

package lab7;

class Outer {
        Inner i1 = new Inner();
        private String s = "Outer string"; // Outer instance variable

        void getS() {
                System.out.println(s);
        }

        void getInnerS() {
                System.out.println(i1.s);
        }

        class Inner {
                // Inner instance variable, uninitialized
                private String s = "Inner string";

                void getS() {
                        System.out.println(s);
                }

                void getOuterS() {
                        System.out.println(Outer.this.s);
                }
        } // end of class Inner.

        public static void main(String[] args) {
                Outer o = new Outer();
                // can also be new Outer().new Inner();
                // Outer.Inner i = new Outer().new Inner();
                Outer.Inner oi = o.new Inner();
                o.getS();
                oi.getS();
                o.getInnerS();
                oi.getOuterS();
        }
} // end of class Outer.
