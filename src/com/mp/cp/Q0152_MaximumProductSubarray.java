package com.mp.cp;

public class Q0152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxProd = 1;
        int minProd = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int prod1 = maxProd * nums[i];
            int prod2 = minProd * nums[i];
            maxProd = Math.max(nums[i], Math.max(prod1, prod2));
            minProd = Math.min(nums[i], Math.min(prod1, prod2));
            max = Math.max(max, maxProd);
        }
        return max;
    }
}
