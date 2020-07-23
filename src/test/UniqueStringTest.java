package test;

import com.mp.cp.ctci.ch01.UniqueString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniqueStringTest {
    @Test
    public void testCaseI() {
        UniqueString test = new UniqueString();
        assertTrue(test.isUnique(null) == true);
    }

    @Test
    public void testCaseII() {
        UniqueString test = new UniqueString();
        assertTrue(test.isUnique("") == true);
    }

    @Test
    public void testCaseIII() {
        UniqueString test = new UniqueString();
        assertTrue(test.isUnique("a") == true);
    }

    @Test
    public void testCaseIV() {
        UniqueString test = new UniqueString();
        assertTrue(test.isUnique("abv") == true);
    }

    @Test
    public void testCaseV() {
        UniqueString test = new UniqueString();
        assertTrue(test.isUnique("aba") == false);
    }
}
