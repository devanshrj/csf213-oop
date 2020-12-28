package lab5;

// import java.util.StringTokenizer;

class Name {
        private String fname; // First Name
        private String mname; // Middle Name
        private String lname; // Last Name

        // constructor
        public Name(String name) {
                // if String contains "," - > <first>, <middle>, <last>
                // else if String contains ";" -> <last>, <middle>, <first>
                // String.contains to check if name has "," or ";"
                String[] temp = new String[3];
                if (name.contains(",")) {
                        // using StringTokenizer
                        // StringTokenizer name_token = new StringTokenizer(name, ",");
                        // for (int i = 0; name_token.hasMoreTokens(); i++)
                        // temp[i] = name_token.nextToken();

                        // using split
                        temp = name.split(",");
                        // assigning elements
                        fname = temp[0];
                        mname = temp[1];
                        lname = temp[2];
                } else {
                        // StringTokenizer name_token = new StringTokenizer(name, ";");
                        // for (int i = 0; name_token.hasMoreTokens(); i++) {
                        // temp[i] = name_token.nextToken();
                        // }

                        // using split
                        temp = name.split(";");
                        // assigning elements
                        lname = temp[0];
                        mname = temp[1];
                        fname = temp[2];
                }
        }

        // accessor methods
        String getfName() {
                return fname;
        }

        String getmName() {
                return mname;
        }

        String getlName() {
                return lname;
        }

        // getName() method
        String getName() {
                return fname + " " + mname + " " + lname;
        }

        public String toString() {
                return getName();
        }
} // end of Name.

class Student {
        private Name name;
        private int age;

        // constructor
        Student(Name name, int age) {
                this.name = name;
                this.age = age;
        }

        // accessor methods
        Name getName() {
                return name;
        }

        int getAge() {
                return age;
        }

        public String toString() {
                return name.getName() + " " + age;
        }
} // end of Student.

public class StudentList {
        public static Student[] list = new Student[10]; // list of students
        public static int count = 0; // count of students added in the list

        public static void addStudent(Student std) {
                if (count >= 10)
                        return; // if count is already 10 or more then return
                list[count] = std;
                count++;
        }

        public static Student[] getStudentsWithAge(int age) {
                /*
                 * This method returns all the students whose age is equal to age parameter of
                 * this method. If no such student is found then it returns null.
                 */
                Student[] listAge = new Student[count];
                int temp = 0; // maintain count for listAge
                for (int i = 0; i < list.length; i++) {
                        if (list[i].getAge() == age) {
                                listAge[temp] = list[i];
                                temp++;
                        }
                }
                if (temp > 0)
                        return listAge;
                return null;
        }

        public static Student[] getStudentsWithLastName(String lastName) {
                /*
                 * This method returns all the students whose last name attribute value matches
                 * with lastName parameter of this method. If no such students is found then it
                 * returns null.
                 */

                Student[] listName = new Student[count];
                int temp = 0; // maintain count for listLName
                for (int i = 0; i < list.length; i++) {
                        if (list[i].getName().getlName().equals(lastName)) {
                                listName[temp] = list[i];
                                temp++;
                        }
                }
                if (temp > 0)
                        return listName;
                return null;
        }

        public static Student[] getStudentsInRange(int minAge, int maxAge) {
                /*
                 * This method returns all the students whose age falls between minAge and
                 * maxAge (both parameters inclusive)
                 */
                Student[] listAgeRange = new Student[count];
                int temp = 0; // maintain count for listAgeRange
                for (int i = 0; i < list.length; i++) {
                        if (list[i].getAge() >= minAge && list[i].getAge() <= maxAge) {
                                listAgeRange[temp] = list[i];
                                temp++;
                        }
                }
                if (temp > 0)
                        return listAgeRange;
                return null;
        }
}
