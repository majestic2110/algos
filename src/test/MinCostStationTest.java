package test;

import com.mp.cp.dp.MinCostStation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MinCostStationTest {
    @Test
    public void testCaseI() {
        int[][] cost = {{0, 10, 75, 94}, {-1, 0, 35, 50}, {-1, -1, 0, 80}, {-1, -1, -1, 0}};
        MinCostStation test = new MinCostStation(cost);
        assertTrue(test.calculateMinCost(0, 2) == 45);
    }

    @Test
    public void testCaseII() {
        int[][] cost = {{0, 10, 75, 94}, {-1, 0, 35, 50}, {-1, -1, 0, 80}, {-1, -1, -1, 0}};
        MinCostStation test = new MinCostStation(cost);
        assertTrue(test.calculateMinCost(0, 3) == 60);
    }
}
