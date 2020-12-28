package lab5;

import java.util.ArrayList;

class Address {
        private String line1;
        private String line2;
        private String line3;
        private char[] city;
        private char[] state;
        private String pin;

        // constructor
        // input address -> "line1$line2$line3$city$state$pin"
        public Address(String address) {
                String[] temp = address.split("\\$");
                line1 = temp[0];
                line2 = temp[1];
                line3 = temp[2];
                pin = temp[5];

                // city and state using toCharArray()
                city = temp[3].toCharArray();
                state = temp[4].toCharArray();
        }

        // accessor methods
        String getLine1() {
                return line1;
        }

        String getLine2() {
                return line2;
        }

        String getLine3() {
                return line3;
        }

        String getCity() {
                // convert char[] to String
                return String.valueOf(city);
        }

        String getState() {
                // convert char[] to String
                return String.valueOf(state);
        }

        String getPin() {
                return pin;
        }

        public String toString() {
                return line1 + ", " + line2 + ", " + line3 + ", " + getCity() + ", " + getState() + ", " + pin; 
        }
} // end of class Address.

class AddressList {
        public static int countAddressWithCity(Address[] addressList, String city) {
                /*
                 * This method returns the count of the addresses from addressList which have
                 * the city attribute equals to city parameter passed for this method. If the
                 * lengthof any passed argument is zero or value of anypassed argument is null
                 * then it returns -1.
                 */
                // edge case
                if (addressList == null || city.length() == 0)
                        return -1;

                int count = 0;
                for (int i = 0; i < addressList.length; i++) {
                        if (addressList[i].getCity().equals(city))
                                count++;
                }
                return count;
        } // End of method countAddressWithCity()

        public static int countAddressWithPin(Address[] addressList, String strP) {
                /*
                 * This method returns the count of the addresses from addressList which have
                 * the pin attribute starting with strP parameter passed for this method. If the
                 * length of any passed argument is zero or value ofany passed argument is null
                 * then it returns -1.
                 */
                // edge case
                if (addressList == null || strP.length() == 0)
                        return -1;

                int count = 0;
                for (int i = 0; i < addressList.length; i++) {
                        if (addressList[i].getPin().equals(strP))
                                count++;
                }
                return count;
        } // End of method countAddressWithCity()

        public static Address[] getAddressWithCity(Address[] addressList, String city) {
                /*
                 * This method returns all the addresses from addressList by storing them in
                 * String[] which have the city attribute equals to city parameter passed for
                 * this method. If the length of any passed argument is zero or value of any
                 * passed argument is null then it returns null. If addressList does not contain
                 * any address with city attribute value equal to city parameter passed for this
                 * method even then it returns null.
                 */
                // edge case
                if (addressList == null || city.length() == 0)
                        return null;

                // using ArrayList for dynamic array
                ArrayList<Address> cityArray = new ArrayList<>();
                for (int i = 0; i < addressList.length; i++) {
                        if (addressList[i].getCity().equals(city))
                                cityArray.add(addressList[i]);
                }

                if (cityArray.size() == 0)
                        return null;

                // converting ArrayList to Array[]
                Address[] cityList = new Address[cityArray.size()];
                cityList = cityArray.toArray(cityList);
                return cityList;
        } // End of method getAddressWithCity()

        public static Address[] getAddressWithPin(Address[] addressList, String strP) {
                /*
                 * This method returns all the addresses from addressList by storing them in
                 * String[] which have theirpin attribute starting with strP parameter passed
                 * for this method. If the length of any passedargument is zero or value of any
                 * passed argument is null then it returns null. If addressList does not contain
                 * any address whose pins attribute value starts with strP parameter passed for
                 * this method eventhen it returns null.
                 */
                // edge case
                if (addressList == null || strP.length() == 0)
                        return null;

                // using ArrayList for dynamic array
                ArrayList<Address> pinArray = new ArrayList<>();
                for (int i = 0; i < addressList.length; i++) {
                        if (addressList[i].getPin().equals(strP))
                                pinArray.add(addressList[i]);
                }

                if (pinArray.size() == 0)
                        return null;

                // converting ArrayList to Array[]
                Address[] pinList = new Address[pinArray.size()];
                pinList = pinArray.toArray(pinList);
                return pinList;
        } // End of method getAddressWithCity()
} // End of class AddressList
