package test;

import com.mp.cp.dp.RecursivePower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecursivePowerTest {
    @Test
    public void testZero() {
        RecursivePower test = new RecursivePower();
        assertTrue(test.power(2, 0) == 0);
    }

    @Test
    public void testOne() {
        RecursivePower test = new RecursivePower();
        assertTrue(test.power(2, 1) == 2);
    }

    @Test
    public void testTen() {
        RecursivePower test = new RecursivePower();
        assertTrue(test.power(2, 10) == 1024);
    }

}
