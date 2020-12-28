// Exercise 2
// Concrete decorator class extending SeatDecorator.

package lab11;

public class TVDecorator extends SeatDecorator {
    private int price = 50;

    public TVDecorator(Seat decoratedSeat) {
        super(decoratedSeat);
    }

    @Override
    public int getPrice() {
        return decoratedSeat.getPrice() + addTV();
    }

    private int addTV() {
        return price;
    }
} // end of class TVDecorator.