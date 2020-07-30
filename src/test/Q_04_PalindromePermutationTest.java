package test;

import com.mp.cp.ctci.ch01.Q_04_PalindromePermutation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q_04_PalindromePermutationTest {
    @Test
    public void testCaseI() {
        Q_04_PalindromePermutation test = new Q_04_PalindromePermutation();
        String s = "Tact Coa";
        assertTrue(test.isPalindromePermutation(s));
    }
}
