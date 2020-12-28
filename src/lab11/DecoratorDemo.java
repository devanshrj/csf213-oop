// Exercise 2
// Demo class for Decorator Pattern.

package lab11;

public class DecoratorDemo {
    public static void main(String[] args) {
        Seat economy = new Economy();
        System.out.println(economy.getPrice());

        Seat premium = new WineDecorator(new TVDecorator(new Premium()));
        System.out.println(premium.getPrice());
    }
}
