package com.mp.cp.mock;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int n = heights.length;
        int[] sortedHeights = new int[101];
        for (int i = 0; i < n; i++) {
            sortedHeights[heights[i]]++;
        }
        int count = 0;
        int i = 1;
        int k = 0;
        while (i < 101) {
            if (sortedHeights[i] == 0) {
                i++;
                continue;
            }
            int freq = sortedHeights[i];
            while (freq > 0) {
                if (heights[k] != i) {
                    count++;
                }
                k++;
                freq--;
            }
            i++;
        }
        return count;
    }
}
