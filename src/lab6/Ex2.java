package lab6;

class Employer {
        // instance variables
        private String name;
        private double salary;

        // parameterized constructor
        public Employer(String name, double salary) {
                this.name = name;
                this.salary = salary;
        } // end of constructor

        // accessor methods
        String getName() {
                return name;
        }

        double getSalary() {
                return salary;
        }

        // mutator methods
        void setName(String name) {
                this.name = name;
        }

        void setSalary(double salary) {
                this.salary = salary;
        }

        // toString()
        @Override
        public String toString() {
                return "Name = " + name + " ; Salary = " + salary;
        }
} // end of class Employer.

class Manager extends Employer {
        // instance variables
        private String dept;

        // parameterized constructor
        public Manager(String name, double salary, String dept) {
                super(name, salary);
                this.dept = dept;
        }

        // accessor methods
        String getDept() {
                return dept;
        }

        // mutator method
        void setDept(String dept) {
                this.dept = dept;
        }

        // toString()
        @Override
        public String toString() {
                return super.toString() + " ; Department = " + dept;
        }
} // end of class Manager.

public class Ex2 {
        public static void main(String[] args) {
                // Employer instances
                Employer em1 = new Employer("X", 50000);
                Employer em2 = new Employer("Y", 40000);

                // Manager instances
                Manager man1 = new Manager("A", 20000, "IT");
                Manager man2 = new Manager("B", 15000, "Product");

                // outputs
                System.out.println("Employer 1: " + em1);
                System.out.println("Employer 2: " + em2);
                System.out.println("Manager 1: " + man1);
                System.out.println("Manager 2: " + man2);
        } // end of main().
} // end of class Ex2.
