package lectures;

public class BankApplication {
        int accNo;
        String name;
        float amount;

        void setAcc(int acc) {
                this.accNo = acc;
        }

        void setName(String name) {
                this.name = name;
        }

        float getBalance() {
                return amount;
        }

        void deposit(float amount) {
                this.amount += amount;
        }

        void withdraw(float amount) {
                if (this.amount >= amount)
                        this.amount -= amount;
                else
                        System.out.println("Insufficient Funds. Withdrawal Failed");
        }
}

class SavingsAccount extends BankApplication {
        float interest;

        // constructor
        SavingsAccount(int accNo, String name, float amount, float interest) {
                this.accNo = accNo;
                this.name = name;
                this.amount = amount;
                this.interest = interest;
        }

        void addInterest() {
                amount += interest * amount / 100;
        }
}

class CheckingAccount extends BankApplication {
        static final float TRANS_FEE = 25;
        static final int FREE_TRANS = 3;
        float transCount = 0;

        CheckingAccount(int accNo, String name, float amount) {
                this.accNo = accNo;
                this.name = name;
                this.amount = amount;
        }

        void deductFee() {
                if (transCount > FREE_TRANS) {
                        // System.out.println("Transactions = " + transCount);
                        // System.out.println("Amount = " + amount);
                        amount = amount - TRANS_FEE;
                        // System.out.println("After trans, Amount = " + amount);
                        transCount = 0;
                }
        }

        void deposit(float amount) {
                this.transCount += 1;
                // System.out.println("Transactions = " + transCount);
                deductFee();
                super.deposit(amount);
        }

        void withdraw(float amount) {
                this.transCount += 1;
                // System.out.println("Transactions = " + transCount);
                deductFee();
                super.withdraw(amount);
        }
}
