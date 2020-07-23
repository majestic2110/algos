package test;

import com.mp.cp.dp.TowerOfHanoi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TowerOfHanoiTest {
    @Test
    public void testCaseI() {
        TowerOfHanoi test = new TowerOfHanoi();
        test.towerOfHanoi('S', 'D', 'E', 3);
        assertTrue(test.solution().size() == 7);

    }

    @Test
    public void testCaseII() {
        TowerOfHanoi test = null;
        for (int i = 0; i < 20; i++) {
            test = new TowerOfHanoi();
            test.towerOfHanoi('S', 'D', 'E', i);
            System.out.println(test.solution().size());
        }
    }
}