package test;

import com.mp.cp.dp.RecursiveSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecursiveSumTest {
    @Test
    public void testZeroSum() {
        RecursiveSum test = new RecursiveSum();
        assertTrue(test.sum(0) == 0);
    }

    @Test
    public void testOneSum() {
        RecursiveSum test = new RecursiveSum();
        assertTrue(test.sum(1) == 1);
    }

    @Test
    public void testTenSum() {
        RecursiveSum test = new RecursiveSum();
        assertTrue(test.sum(10) == 55);
    }

    @Test
    public void testHundredSum() {
        RecursiveSum test = new RecursiveSum();
        assertTrue(test.sum(100) == 5050);
    }

    @Test
    public void testMaxSum() {
        RecursiveSum test = new RecursiveSum();
        assertTrue(test.sum(1000) == 500500);
    }

    @Test
    public void testInvalidInput1() {
        RecursiveSum test = new RecursiveSum();
        Exception rte = null;
        try {
            test.sum(-299);
        } catch (Exception e) {
            rte = e;
        }
        assertTrue(rte != null && rte instanceof IllegalArgumentException);
    }

    @Test
    public void testInvalidInput2() {
        RecursiveSum test = new RecursiveSum();
        Exception rte = null;
        try {
            test.sum(7000);
        } catch (Exception e) {
            rte = e;
        }
        assertTrue(rte != null && rte instanceof IllegalArgumentException);
    }
}
