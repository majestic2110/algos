package com.mp.cp;

public class Q0027_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == val) {
                continue;
            }
            nums[i++] = nums[j];
        }
        return i;
    }
}
