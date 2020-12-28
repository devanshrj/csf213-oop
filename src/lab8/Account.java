// Exercise 5 -> ArrayList and ListIterator

package lab8;

public class Account {
    private long accNumber;
    private double balance;
    private String name;

    // constructor
    public Account(long accNumber, double balance, String name) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
    }

    // accessor methods
    long getAccNumber() {
        return accNumber;
    }

    double getBalance() {
        return balance;
    }

    String getName() {
        return name;
    }

    // mutator methods
    void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setName(String name) {
        this.name = name;
    }

    // toString override
    @Override
    public String toString() {
        return name + " " + accNumber + " " + balance;
    }
} // end of class Account.
