// Exercise 2
// Concrete decorator class extending SeatDecorator.

package lab11;

public class WineDecorator extends SeatDecorator {
    private int price = 30;

    public WineDecorator(Seat decoratedSeat) {
        super(decoratedSeat);
    }

    @Override
    public int getPrice() {
        return decoratedSeat.getPrice() + addWine();
    }

    private int addWine() {
        return price;
    }
} // end of class WineDecorator.