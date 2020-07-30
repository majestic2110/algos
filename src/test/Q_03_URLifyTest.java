package test;

import com.mp.cp.ctci.ch01.Q_03_URLify;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q_03_URLifyTest {
    @Test
    public void testCaseI() {
        Q_03_URLify test = new Q_03_URLify();
        String s = "Mr John Smith    ";
        assertTrue(new String(test.urlify(s.toCharArray(), 13)).equals("Mr%20John%20Smith"));
    }
}
