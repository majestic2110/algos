package com.mp.cp.mock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RotatedDigits {
    final Set<Integer> set1 = new HashSet<>(Arrays.asList(0, 1, 8));
    final Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 5, 6, 9));

    public int rotatedDigits(int N) {
        int[] dp = new int[N + 1];
        int count = 0;
        for (int i = 0; i <= N; i++) {
            if (i < 10) {
                if (set1.contains(i)) {
                    dp[i] = 1;
                } else if (set2.contains(i)) {
                    dp[i] = 2;
                    count++;
                }
            } else {
                int first = dp[i / 10];
                int second = dp[i % 10];
                if (first == 1 && second == 1) {
                    dp[i] = 1;
                } else if (first >= 1 && second >= 1) {
                    dp[i] = 2;
                    count++;
                }
            }
        }
        return count;
    }
}
