// Exercise 2
// Concrete decorator class extending SeatDecorator.

package lab11;

public class WifiDecorator extends SeatDecorator {
    private int price = 10;

    public WifiDecorator(Seat decoratedSeat) {
        super(decoratedSeat);
    }

    @Override
    public int getPrice() {
        return decoratedSeat.getPrice() + addWifi();
    }

    private int addWifi() {
        return price;
    }
} // end of class WifiDecorator.
