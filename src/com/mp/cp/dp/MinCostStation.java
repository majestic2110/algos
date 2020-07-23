package com.mp.cp.dp;

import java.util.Arrays;

public class MinCostStation {
    int[][] cost;
    int[][] minCost;

    public MinCostStation(int[][] cost) {
        this.cost = cost;
        this.minCost = new int[cost.length][cost.length];
        for (int i = 0; i < this.minCost.length; i++) {
            Arrays.fill(this.minCost[i], Integer.MAX_VALUE);
        }
    }

    public int calculateMinCost(int s, int d) {
        if (this.minCost[s][d] != Integer.MAX_VALUE) {
            return this.minCost[s][d];
        }
        if (s == d || d == s + 1) {
            this.minCost[s][d] = this.cost[s][d];
            return this.minCost[s][d];
        }
        this.minCost[s][d] = this.cost[s][d];
        for (int i = s + 1; i < d; i++) {
            int temp = calculateMinCost(s, i) + calculateMinCost(i, d);
            if (temp < this.minCost[s][d]) {
                this.minCost[s][d] = temp;
            }
        }
        return this.minCost[s][d];
    }
}
