package by.iba;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void init() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacciZero() {
        assertEquals(0, fibonacci.F(0));
    }

    @Test
    public void fibonacciOne() {
        assertEquals(1, fibonacci.F(1));
    }

    @Test
    public void fibonacci15() {
        assertEquals(610, fibonacci.F(15));
    }

    @Test
    public void fibonacciNegative() {
        assertEquals(-987, fibonacci.F(-16));
    }
}
