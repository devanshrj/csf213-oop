package lab5;

public class AddressTest {
    public static void main(String[] args) {
        Address[] addressList = new Address[3];

        addressList[0] = new Address("abc$xyz$qwe$Delhi$Delhi$300");
        addressList[1] = new Address("plm$okn$ijb$Pune$Maha$400");
        addressList[2] = new Address("rty$tyu$yui$Bang$Kar$500");

        String city = "Bang";
        System.out.println("Count of city = Bang: " + AddressList.countAddressWithCity(addressList, city));
        System.out.println("-----------------");

        String strP = "400";
        System.out.println("Count of pin = 400: " + AddressList.countAddressWithPin(addressList, strP));
        System.out.println("-----------------");
        
        Address[] cityList = AddressList.getAddressWithCity(addressList, city);
        if (cityList == null)
            System.out.println("No address with city = " + city);
        else {
            System.out.println("Address with city = " + city);
            for(int i = 0; i < cityList.length; i++)
                System.out.println("\tAddress = " + cityList[i]);
        }
        System.out.println("-----------------");
    }
}