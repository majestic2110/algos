package com.mp.cp;

public class Q0031_NextPermutation {

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int pivot = nums.length - 2;
        while (pivot >= 0 && nums[pivot + 1] <= nums[pivot]) {
            pivot--;
        }
        if (pivot >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[pivot]) {
                j--;
            }
            swap(nums, pivot, j);
        }
        reverse(nums, pivot + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
