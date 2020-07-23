package test;

import com.mp.cp.dp.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciTest {
    @Test
    public void testCaseI() {
        Fibonacci test = new Fibonacci();
        assertTrue(test.fib(3) == 2);
    }

    @Test
    public void testCaseII() {
        Fibonacci test = new Fibonacci();
        assertTrue(test.fib(5) == 5);
    }


}
