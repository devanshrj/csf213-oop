// Exercise 2
// Abstract decorator class implementing Seat interface.
package lab11;

public abstract class SeatDecorator implements Seat {
    protected Seat decoratedSeat;
    
    public SeatDecorator(Seat decoratedSeat) {
        this.decoratedSeat = decoratedSeat;
    }

    public int getPrice() {
        return decoratedSeat.getPrice();
    }
} // end of class SeatDecorator.
