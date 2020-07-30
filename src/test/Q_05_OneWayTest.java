package test;

import com.mp.cp.ctci.ch01.Q_05_OneWay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q_05_OneWayTest {
    @Test
    public void testCaseI() {
        Q_05_OneWay test = new Q_05_OneWay();
        assertTrue(test.isOneEditAway("pale", "ple"));
        assertTrue(test.isOneEditAway("pales", "pale"));
        assertTrue(test.isOneEditAway("pale", "bale"));
        assertFalse(test.isOneEditAway("pale", "bake"));
    }
}
