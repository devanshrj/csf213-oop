package lab5;

import java.io.IOException;
import java.util.Scanner;

public class StudentTest {
        public static Student readStudent() throws IOException {
                /*
                 * This method reads the student details and returns the Student instance.
                 * Values to be read from System.in are: 1. First name of Student, 2. Middle
                 * name of student, 3. Last name of Student, 4. Name format (1 for comma(,)
                 * separated and 2 for semicolon separated), 5. age of student
                 */
                String fname, mname, lname;
                String fullName;
                int format;
                int age;

                // using Scanner to handle inputs
                Scanner in = new Scanner(System.in);
                System.out.println("Enter first name: ");
                fname = in.nextLine();
                System.out.println("Enter middle name:");
                mname = in.nextLine();
                System.out.println("Enter last name: ");
                lname = in.nextLine();
                System.out.println("Enter name format: ");
                format = in.nextInt();
                System.out.println("Enter age: ");
                age = in.nextInt();
                System.out.println("------------------\n");

                // creating name string for constructor using format
                if (format == 1) {
                        fullName = fname + "," + mname + "," + lname;
                } else {
                        fullName = lname + ";" + mname + ";" + fname;
                }

                // create objects for Name and Student
                Name name = new Name(fullName);
                Student std = new Student(name, age);
                return std;

        } // end of readStudent()

        public static void main(String args[]) throws IOException {
                /*
                 * 1. Write java code for reading details of 10 students and add them in the
                 * static list of StudentList class.
                 */
                int count = StudentList.count;
                for (int i = 0 ; i < count ; i++) {
                        StudentList.addStudent(readStudent());
                }

                /*
                 * 2. Write java code for displaying all the students with age 20 from static
                 * list field of StudentList class
                 */
                int age = 20;
                Student[] listAge = StudentList.getStudentsWithAge(age);
                if (listAge == null) {
                        System.out.println("No students with age = " + age);
                }
                else {
                        System.out.println("Students with age = " + age + ":");
                        for (int i = 0; i < listAge.length; i++) {
                                if (listAge[i] != null)
                                        System.out.println(listAge[i]);
                        }
                }
                System.out.println("------------------\n");

                /*
                 * 3. Write java code for displaying the student details for all students having
                 * last name “Sharma” from static list of StudentList class
                 */
                String lastName = "Sharma";
                Student[] listName = StudentList.getStudentsWithLastName(lastName);
                if (listName == null) {
                        System.out.println("No students with last name = " + lastName);
                }
                else {
                        System.out.println("Students with last name = " + lastName + ":");
                        for (int i = 0; i < listName.length; i++) {
                                if (listName[i] != null)
                                        System.out.println(listName[i]);
                        }
                }
                System.out.println("------------------\n");

                /*
                 * 4. Write java code for displaying all the students whose age falls in the
                 * range minAge = 16 and maxAge = 20 from static list of StudentList class
                 */
                int minAge = 16, maxAge = 20;
                Student[] listAgeRange = StudentList.getStudentsInRange(minAge, maxAge);
                if (listAgeRange == null) {
                        System.out.println("No students with min age = " + minAge + " and max age = " + maxAge);
                }
                else {
                        System.out.println("Students with min age = " + minAge + " and max age = " + maxAge + ":");
                        for (int i = 0; i < listAgeRange.length; i++) {
                                if (listAgeRange[i] != null)
                                        System.out.println(listAgeRange[i]);
                        }
                }
                System.out.println("------------------\n");
        } // end of main()
} // end of Test
