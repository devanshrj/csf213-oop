package lab2;

public class TestStore {
    public static void main(String[] args) {
        // Customer object
        Customer cust = new Customer("Devansh", "ab123");

        // Item objects
        Item apple = new Item("Apple", "item1");
        Item orange = new Item("Orange", "item2", 3, 600);

        cust.buyItem(apple);
        cust.buyItem(orange);
    }
}