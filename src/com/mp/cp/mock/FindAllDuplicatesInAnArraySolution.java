package com.mp.cp.mock;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArraySolution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dupList = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return dupList;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                dupList.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        return dupList;
    }
}
