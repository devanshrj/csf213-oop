package lab4;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentTest {
        @Test
        public void testStudentStringIntFloat() {
                Student s1 = new Student("George", 1, 90.15f);
                Student s2 = new Student("John", 2, 75.81f);
                // Student s3 = new Student("Alice", 3, 95.26f);

                /* Test the getter functions */
                assertEquals("George", s1.get_name());
                assertEquals(1, s1.get_id_no(), 0.001);
                assertEquals(90.15f, s1.get_marks(), 0.001);

                /* Test the setter function */
                float marks = 96.38f;
                s1.set_marks(marks);
                assertEquals(marks, s1.get_marks(), 0.001);

                /* Compare two students */
                /* for method based comparison */
                assertEquals(true, s1.Higher(s1, s2));

                /* for direct comparison */
                // assertEquals(s1.get_marks(), s2.get_marks(), 0.001);
        }
}
