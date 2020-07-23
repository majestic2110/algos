package test;

import com.mp.cp.ctci.ch01.CheckPermutation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckPermutationTest {
    @Test
    public void testCaseI() {
        CheckPermutation test = new CheckPermutation();
        assertTrue(test.isPermutation("", "") == true);
    }

    @Test
    public void testCaseII() {
        CheckPermutation test = new CheckPermutation();
        assertTrue(test.isPermutation("a", "x") == false);
    }

    @Test
    public void testCaseIII() {
        CheckPermutation test = new CheckPermutation();
        assertTrue(test.isPermutation("acx", "xca") == true);
    }
}
