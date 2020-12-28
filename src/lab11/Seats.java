// Exercise 2
// Concrete classes implementing interface Seat

package lab11;

class Economy implements Seat {
    private int price = 2500;

    public int getPrice() {
        return price;
    }
} // end of class Economy.

class Premium implements Seat {
    private int price = 3500;

    public int getPrice() {
        return price;
    }
} // end of class Premium.

class Business implements Seat {
    private int price = 4500;

    public int getPrice() {
        return price;
    }
} // end of class Business.

class FirstClass implements Seat {
    private int price = 5500;

    public int getPrice() {
        return price;
    }
} // end of class FirstClass.
