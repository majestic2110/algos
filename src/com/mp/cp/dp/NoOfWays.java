package com.mp.cp.dp;

public class NoOfWays {
    public int noOfWays(int row, int col) {
        if (row == 0 && col == 0) {
            return 0;
        }
        if (row == 0 || col == 0) {
            return 1;
        }
        return noOfWays(row - 1, col) + noOfWays(row, col - 1);
    }
}
