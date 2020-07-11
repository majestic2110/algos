package com.mp.cp;

public class Q0004_MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return 0.0;
        }
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        int start = 0;
        int end = len1;
        int mid = (len1 + len2 + 1) / 2;
        while (start <= end) {
            int posX = (start + end) / 2;
            int posY = mid - posX;
            int X1 = posX == 0 ? Integer.MIN_VALUE : nums1[posX - 1];
            int X2 = posX == len1 ? Integer.MAX_VALUE : nums1[posX];

            int Y1 = posY == 0 ? Integer.MIN_VALUE : nums2[posY - 1];
            int Y2 = posY == len2 ? Integer.MAX_VALUE : nums2[posY];
            if (X1 <= Y2 && Y1 <= X2) {
                if ((len1 + len2) % 2 == 0) {
                    return ((double) Math.min(X2, Y2) + Math.max(X1, Y1)) / 2.0;
                } else {
                    return Math.max(X1, Y1);
                }
            } else if (X1 > Y2) {
                end = posX - 1;
            } else {
                start = posX + 1;
            }
        }
        return 0.0;
    }
}
