package com.mp.cp.dp;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
    List<String> sol;

    public TowerOfHanoi() {
        sol = new ArrayList<>();
    }

    public void towerOfHanoi(char s, char d, char e, int n) {
        if (n <= 0) {
            return;
        }
        towerOfHanoi(s, e, d, n - 1);
        sol.add("Moving disc no. " + n + " from " + String.valueOf(s) + " to " + String.valueOf(d));
        towerOfHanoi(e, d, s, n - 1);
    }

    public List<String> solution() {
        return this.sol;
    }
}
