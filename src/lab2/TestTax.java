package lab2;

public class TestTax {
    public static void main(String[] args) {
        TaxOnSalary tax1 = new TaxOnSalary(true);
        TaxOnSalary tax2 = new TaxOnSalary();

        System.out.println("Tax 1");
        tax1.inputSalary();
        System.out.println("PAN submitted? " + tax1.getIsPan());
        System.out.println("Tax = " + tax1.calculateTax());
        System.out.println("---------------");

        System.out.println("Tax 2");
        tax2.inputSalary();
        System.out.println("Tax = " + tax2.calculateTax());
        System.out.println("---------------");
    }
}