package com.mp.cp;

public class Q0755_PourWater {

    public int[] pourWater(int[] heights, int V, int K) {
        if (heights == null || heights.length == 0) {
            return new int[]{};
        }
        int n = heights.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = heights[K] - heights[i];
        }
        int left = K - 1;
        int right = K + 1;
        int wt = 0;
        while (wt <= K) {
            if (left >= 0 && diff[left] > diff[K]) {
                diff[left]--;
                heights[left]++;
                if (diff[left] == diff[K]) {
                    left--;
                }
            } else if (right <= diff.length - 1 && diff[right] > diff[K]) {
                diff[right]--;
                heights[right]++;
                if (diff[right] == diff[K]) {
                    right++;
                }
            } else {
                diff[K]--;
                heights[K]++;
            }
            wt++;
        }
        return heights;
    }
}
