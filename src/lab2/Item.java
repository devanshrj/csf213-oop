package lab2;

public class Item {
    // private instance fields
    private String itemName;
    private String itemidNo;
    private int itemQuantity;
    private double itemPrice;

    // constructors
    // constructor with all params
    public Item(String itemName, String itemidNo, int itemQuantity, double itemPrice) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    // constructor with 3 params
    public Item(String itemName, String itemidNo, int itemQuantity) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = 500;
    }

    // constructor with 2 params
    public Item(String itemName, String itemidNo) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = 1;
        this.itemPrice = 500;
    }

    // accessors for instance fields
    public String getItemName() {
        return this.itemName;
    }

    public String getItemId() {
        return this.itemidNo;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }

    // mutators for instance fields
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemId(String itemidNo) {
        this.itemidNo = itemidNo;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

} // end of Item