// Exercise 5 -> ArrayList and ListIterator
// driver for Bank

package lab8;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // add account
        bank.addAccount(new Account(12, 5000, "A"));
        bank.addAccount(new Account(34, 10000, "B"));
        bank.addAccount(new Account(56, 2000, "C"));
        bank.addAccount(new Account(78, 7000, "D"));
        System.out.println(bank);

        // remove account
        System.out.println(bank.removeAccount(12));
        System.out.println(bank.removeAccount(12));
        System.out.println(bank);

        // deposit
        System.out.println(bank.deposit(34, 5000));
        System.out.println(bank);

        // withdraw
        System.out.println(bank.withdraw(34, 7000));
        System.out.println(bank.withdraw(56, 3000));
        System.out.println(bank);
    }
} // end of class BankTest.
