package com.mp.cp;

public class Q0026_RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        nums[i] = nums[0];
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}
