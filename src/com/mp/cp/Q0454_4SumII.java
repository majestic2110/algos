package com.mp.cp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q0018_4Sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        int k = 4;
        int start = 0;
        Arrays.sort(nums);
        return kSum(nums, start, k, target);
    }

    private List<List<Integer>> kSum(int[] nums, int start, int k, int target) {
        if (nums == null || nums.length < k) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        if (k == 2) {
            int left = start;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < target) {
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    left++;
                } else {
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    right--;
                }
            }
        } else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }
                List<List<Integer>> temp = kSum(nums, i + 1, k - 1, target - nums[i]);
                for (List<Integer> item : temp) {
                    ((LinkedList) item).addFirst(nums[i]);
                }
                res.addAll(temp);
            }
        }
        return res;
    }
}
