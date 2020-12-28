package lab2;

public class Customer {
    // private instance fields
    private String name;
    private String idNo;
    private double balance;
    private Item item;

    // constructors
    // constructor with 3 params
    public Customer(String name, String idNo, double balance) {
        this.name = name;
        this.idNo = idNo;
        this.balance = balance;
    }

    // constructor with 2 params
    public Customer(String name, String idNo) {
        this.name = name;
        this.idNo = idNo;
        this.balance = 5000;
    }

    // accessor methods
    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.idNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public Item getItem() {
        return this.item;
    }

    // mutators methods
    public void getName(String name) {
        this.name = name;
    }

    public void getId(String idNo) {
        this.idNo = idNo;
    }

    // print Item details
    public void print() {
        System.out.println("Item Name: " + this.item.getItemName());
        System.out.println("Item ID No: " + this.item.getItemId());
        System.out.println("Item Quantity: " + this.item.getItemQuantity());
        System.out.println("Item Price: " + this.item.getItemPrice());
        System.out.println("Current Balance: " + this.balance);
    }

    // buy item
    public boolean buyItem(Item item) {
        if (item.getItemQuantity() < 1) {
            System.out.println("Order is not valid.");
            return false;
        }

        // check balance
        this.item = item;
        double reqd_balance = this.item.getItemPrice() * this.item.getItemQuantity();
        if (this.balance > reqd_balance) {
            this.balance -= reqd_balance;
            print();
        }
        else {
            System.out.println("Insufficient balance.");
            return false;
        }
        return true;
    }

} // end of Customer
