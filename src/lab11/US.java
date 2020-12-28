// Exercise 1

package lab11;

public class US implements Currency {
    @Override
    public String getCurrency() {
        return "Dollar";
    }
    
    @Override
    public String getSymbol() {
        return "$"; 
    }
} // end of class US.
