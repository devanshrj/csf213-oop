package lab4;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyClass1Test {
    @Test
    public void testMultiply() {
        MyClass1 m1 = new MyClass1();
        assertEquals(6, m1.multiply(2, 3));     /* Assertion */
    }
}
