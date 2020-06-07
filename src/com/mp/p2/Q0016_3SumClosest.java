package com.mp.p2;

import java.util.Arrays;

public class Q0016_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return target - diff;
    }
}
