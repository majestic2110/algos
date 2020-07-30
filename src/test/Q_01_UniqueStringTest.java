package test;

import com.mp.cp.ctci.ch01.Q_01_UniqueString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q_01_UniqueStringTest {
    @Test
    public void testCaseI() {
        Q_01_UniqueString test = new Q_01_UniqueString();
        assertTrue(test.isUnique(null) == true);
    }

    @Test
    public void testCaseII() {
        Q_01_UniqueString test = new Q_01_UniqueString();
        assertTrue(test.isUnique("") == true);
    }

    @Test
    public void testCaseIII() {
        Q_01_UniqueString test = new Q_01_UniqueString();
        assertTrue(test.isUnique("a") == true);
    }

    @Test
    public void testCaseIV() {
        Q_01_UniqueString test = new Q_01_UniqueString();
        assertTrue(test.isUnique("abv") == true);
    }

    @Test
    public void testCaseV() {
        Q_01_UniqueString test = new Q_01_UniqueString();
        assertTrue(test.isUnique("aba") == false);
    }
}
