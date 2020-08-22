package com.mp.cp;

public class Q0033_SearchInSortedArray {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int n = nums.length;
        int min = 0;
        int max = n - 1;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                min = i;
                max = i - 1;
                break;
            }
        }
        if (target < nums[min] || target > nums[max]) {
            return -1;
        }
        int lo = 0;
        int hi = n - 1;
        if (target < nums[0]) {
            lo = min;
        } else if (target > nums[n - 1]) {
            hi = max;
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                lo++;
            } else {
                hi--;
            }
        }
        return -1;
    }
}
