package com.mp.cp;

import java.util.Arrays;

/**
 * Given an array of n integers nums and a target, find the number of index triplets i, j, k with 0 <= i < j < k < n that satisfy the condition nums[i] + nums[j] + nums[k] < target.
 * <p>
 * Example:
 * <p>
 * Input: nums = [-2,0,1,3], and target = 2
 * Output: 2
 * Explanation: Because there are two triplets which sums are less than 2:
 * [-2,0,1]
 * [-2,0,3]
 * Follow up: Could you solve it in O(n2) runtime?
 */
public class Q0259_3SumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum < target) {
                    count += end - start;
                    start++;
                } else {
                    end--;
                }
            }
        }
        return count;
    }
}
