package com.mp.cp;

public class Q1535_FindTheWinnerOfAnArrayGame {
    public int getWinner(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int cur = arr[0], win = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > cur) {
                cur = arr[i];
                win = 0;
            }
            if (++win == k) break;
        }
        return cur;
    }
}
