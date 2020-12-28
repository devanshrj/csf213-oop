package lectures;

class testAccount {
        public static void main(String[] args) {
                SavingsAccount sa = new SavingsAccount(111, "Ankit", 5000, 9);
                System.out.println("Initial: " + sa.getBalance());

                sa.deposit(1000); // adds the deposit amount to balance 
                System.out.println("After Deposit: " + sa.getBalance());

                sa.addInterest(); // gets the balance and computes the interest by multiplying it with interest %
                System.out.println("Deposit+Interest: " + sa.getBalance());

                sa.withdraw(6000); // checks if the balance is sufficient for withdrawing the amount then deducts
                System.out.println("After Withdraw: " + sa.getBalance());

                sa.withdraw(1000);
                System.out.println("After Withdraw: " + sa.getBalance());
                System.out.println("**************************************");

                 /* overridden deposit and withdraw methods increments the transaction count;
                 * invokes the deduct fee method to check if it exceeds the free transactions;
                 * it deducts the fee and resets the transaction count; else the parent class
                 * methods are invoked.
                */

                CheckingAccount ca = new CheckingAccount(123, "Ankur", 5000);
                System.out.println("Initial: " + ca.getBalance());
                
                ca.deposit(1000);
                ca.withdraw(2000);
                ca.deposit(6000);
                System.out.println("After three transactions: " + ca.getBalance());

                ca.deposit(1000);
                System.out.println("After fourth transaction: " + ca.getBalance());
                ca.withdraw(500);
                System.out.println("After fifth transaction: " + ca.getBalance());
        }
}
