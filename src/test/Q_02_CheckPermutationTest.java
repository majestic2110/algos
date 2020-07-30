package test;

import com.mp.cp.ctci.ch01.Q_02_CheckPermutation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q_02_CheckPermutationTest {
    @Test
    public void testCaseI() {
        Q_02_CheckPermutation test = new Q_02_CheckPermutation();
        assertTrue(test.isPermutation("", "") == true);
    }

    @Test
    public void testCaseII() {
        Q_02_CheckPermutation test = new Q_02_CheckPermutation();
        assertTrue(test.isPermutation("a", "x") == false);
    }

    @Test
    public void testCaseIII() {
        Q_02_CheckPermutation test = new Q_02_CheckPermutation();
        assertTrue(test.isPermutation("acx", "xca") == true);
    }
}
