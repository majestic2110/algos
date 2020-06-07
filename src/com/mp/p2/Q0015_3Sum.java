package com.mp.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q0015_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList();
        if (nums == null || nums.length == 0) {
            return resList;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) break;
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int start = i + 1;
                int end = n - 1;
                while (start < end) {
                    int sum = 0 - nums[i];
                    if (nums[start] + nums[end] == sum) {
                        resList.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[start + 1]) start++;
                        while (start < end && nums[end] == nums[end - 1]) end--;
                        start++;
                        end--;
                    } else if (nums[start] + nums[end] < sum) {
                        while (start < end && nums[start] == nums[start + 1]) start++;
                        start++;
                    } else {
                        while (start < end && nums[end] == nums[end - 1]) end--;
                        end--;
                    }
                }
            }
        }
        return resList;
    }
}
