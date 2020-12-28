// Exercise 5 -> ArrayList and ListIterator

package lab8;

import java.util.ArrayList;
import java.util.ListIterator;

public class Bank {
    private ArrayList<Account> accounts;
    int maxActive = 30;

    public Bank() {
        this.accounts = new ArrayList<Account>(30);
    }
    
    public boolean addAccount(Account newAcc) {
        // check number of existing accounts
        if (accounts.size() == maxActive)
            return false;
        
        accounts.add(newAcc);
        return true;
    }

    public boolean removeAccount(long accNumber) {
        int idx = accExist(accNumber);

        // remove account if it exists, exists if idx != -1
        if (idx != -1) {
            accounts.remove(idx);
            return true;
        }

        return false;
    }

    public double deposit(long accNumber, double amount) {
        int idx = accExist(accNumber);
        
        // return -1 if acc doesn't exist, that is idx = -1
        if (idx == -1)
            return -1;
        
        Account acc = accounts.get(idx);
        acc.setBalance(acc.getBalance() + amount);

        return acc.getBalance();
    }

    public double withdraw(long accNumber, double amount) {
        int idx = accExist(accNumber);
        
        // return -1 if acc doesn't exist, that is idx = -1
        if (idx == -1)
            return -1;
        
        Account acc = accounts.get(idx);
        double balance = acc.getBalance();
        if (balance < amount) {
            System.out.println("Insufficient funds.");
            return -1;
        }
        
        acc.setBalance(balance - amount);

        return acc.getBalance();
    }

    // check if account exists using ListIterator and account number
    public int accExist(long accNumber) {
        int idx = -1;
        boolean exist = false;

        // iterate through ArrayList using a ListIterator, check each account's accNumber
        ListIterator<Account> litr = accounts.listIterator();
        
        while (litr.hasNext()) {
            idx++;

            // dummy object to element from ArrayList
            Account acc = (Account) litr.next();
            if (acc.getAccNumber() == accNumber) {
                exist = true;
                break;
            }
        }

        // return idx if account exists, else -1
        if (exist == true)
            return idx;
        
        return -1;
    }

    public String toString() {
        return accounts.toString();
    }
} // end of class Bank.