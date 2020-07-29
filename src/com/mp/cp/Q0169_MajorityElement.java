package com.mp.cp;

public class Q0169_MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Integer maj = null;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                maj = nums[i];
            }
            if (nums[i] == maj) {
                count++;
            } else {
                count--;
            }
        }
        return maj;
    }
}
