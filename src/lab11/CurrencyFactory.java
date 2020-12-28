// Exercise 1
// Design Pattern: Factory

package lab11;

public class CurrencyFactory {
    public static Currency getCurrencybyCountry(String country) {
        if (country == null) {
            return null;
        }
        
        if (country.equalsIgnoreCase("India")) {
            return new India();
        } else if (country.equalsIgnoreCase("US")) {
            return new US();
        }

        return null;
    }

    public static void main(String[] args) {
        // get an object of India
        Currency india = CurrencyFactory.getCurrencybyCountry("India");
        System.out.println(india.getCurrency());
        System.out.println(india.getSymbol());

        // get an object of US
        Currency us = CurrencyFactory.getCurrencybyCountry("us");
        System.out.println(us.getCurrency());
        System.out.println(us.getSymbol());
    }
}
