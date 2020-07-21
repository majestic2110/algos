package com.mp.cp;

import java.util.Arrays;

public class Q1099_TwoSumLessThanK {
    public int twoSumLessThanK(int[] A, int K) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        int lessSum = -1;
        Arrays.sort(A);
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int sum = A[start] + A[end];
            if (sum < K) {
                lessSum = Math.max(lessSum, sum);
                start++;
            } else {
                end--;
            }
        }
        return lessSum;
    }
}
