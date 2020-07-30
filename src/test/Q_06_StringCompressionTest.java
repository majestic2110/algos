package test;

import com.mp.cp.ctci.ch01.Q_06_StringCompression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q_06_StringCompressionTest {
    @Test
    public void testCaseI() {
        Q_06_StringCompression test = new Q_06_StringCompression();
        assertTrue(test.compress("aaabccccaaa").equals("a3b1c4a3"));
        assertTrue(test.compress("a").equals("a"));
        assertTrue(test.compress("aa").equals("aa"));
        assertTrue(test.compress("aaa").equals("a3"));
        assertTrue(test.compress("aab").equals("aab"));
        assertTrue(test.compress("aaabb").equals("a3b2"));
    }
}
