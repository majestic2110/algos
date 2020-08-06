package com.mp.cp.mock;

public class MountainArray {

    public boolean validMountainArray(int[] A) {
        if (A == null || A.length <= 2) {
            return false;
        }
        int start = 1;
        int left = 0;
        while (start < A.length) {
            if (A[start] == A[start - 1]) {
                return false;
            }
            if (A[start - 1] > A[start]) {
                left = start - 1;
                break;
            }
            start++;
        }
        if (left == 0 || start == A.length) {
            return false;
        }
        left++;
        while (left < A.length) {
            if (A[left] == A[left - 1]) {
                return false;
            }
            if (A[left - 1] < A[left]) {
                return false;
            }
            left++;
        }
        return true;
    }
}
