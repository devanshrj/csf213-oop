package lab4;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void intMaxTest() {
        int[] arr = { 1, 2, 3, 4, 6, 8, 7, 5 };
        assertEquals(8, Calculator.intfindMax(arr));
    }

    @Test
    public void intCubeTest() {
        int n = 5;
        assertEquals(125, Calculator.intcube(n));
    }

    @Test
    public void reverseTest() {
        String s = "oy";
        assertEquals("yo", Calculator.reverseWord(s));
    }
}
