package com.mp.cp;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q0480_SlidingWindowMedian {
    public double[] medianSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new double[]{};
        }
        int n = nums.length;
        double[] win = new double[n - k + 1];
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        int index = 0;
        for (int i = 0; i < n; i++) {
            minQ.add(nums[i]);
            maxQ.add(minQ.poll());
            if (minQ.size() < maxQ.size()) {
                minQ.add(maxQ.poll());
            }
            if (minQ.size() + maxQ.size() == k) {
                win[index] = minQ.size() == maxQ.size() ? (double) ((long) minQ.peek() + (long) maxQ.peek()) / 2 : (double) minQ.peek();
                if (!minQ.remove(nums[index])) {
                    maxQ.remove(nums[index]);
                }
                index++;
            }
        }
        return win;
    }
}
