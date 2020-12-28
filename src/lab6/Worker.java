// Lab 6: Exercise 3.2
package lab6;

abstract class Worker {
        // instance variables
        private String name;
        private double salaryRate;

        // constructor
        public Worker(String name, double salaryRate) {
                this.name = name;
                this.salaryRate = salaryRate;
        }

        // accessor methods
        String getName() {
                return name;
        }

        double getSalaryRate() {
                return salaryRate;
        }

        // abstract computePay()
        abstract double computePay();
} // end of class Worker.

class FullTimeWorker extends Worker {
        // instance variables
        private int hoursWorked;

        // constructor
        public FullTimeWorker(String name, double salaryRate, int hoursWorked) {
                super(name, salaryRate);
                this.hoursWorked = hoursWorked;
        }

        // computePay() implementation
        public double computePay() {
                return getSalaryRate() * hoursWorked;
        }
} // end of FullTimeWorker.

class HourlyWorker extends Worker {
        // instance variables
        private int hoursWorked;

        // constructor
        public HourlyWorker(String name, double salaryRate, int hoursWorked) {
                super(name, salaryRate);
                this.hoursWorked = hoursWorked;
        }

        // computePay() implementation
        public double computePay() {
                if (hoursWorked > 60) {
                        System.out.println("Hours worked cannot be more than 60 for an hourly worker.");
                        return 0;
                }
                return getSalaryRate() * hoursWorked;
        }
} // end of HourlyWorker.
