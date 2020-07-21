package com.mp.cp;

import java.util.Arrays;

public class Q1471_TheKStrongestValuesInAnArray {

    public int[] getStrongest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[]{};
        }
        int[] strong = new int[k];
        Arrays.sort(arr);
        int index = 0;
        int median = arr[(arr.length - 1) / 2];
        int start = 0;
        int end = arr.length - 1;
        while (index < k) {
            if (median - arr[start] > arr[end] - median) {
                strong[index] = arr[start];
                start++;
            } else {
                strong[index] = arr[end];
                end--;
            }
            index++;
        }
        return strong;
    }
}
