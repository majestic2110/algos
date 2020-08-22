package com.mp.cp.mock;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int start = 0, end = arr.length, idx = end - 1;
        while (start < end) {
            if (arr[start++] == 0) {
                end--;
            }
        }
        while (--start >= 0) {
            if (arr[start] == 0) {
                arr[idx--] = 0;
            }
            arr[idx--] = arr[start];
            if (start >= end) {
                idx++;
            }
        }
    }
}
