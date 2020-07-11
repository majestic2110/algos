package com.mp.cp;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q0295_FindMedianfromDataStream {
    class MedianFinder {
        PriorityQueue<Integer> minQ;
        PriorityQueue<Integer> maxQ;

        /**
         * initialize your data structure here.
         */
        public MedianFinder() {
            minQ = new PriorityQueue<>();
            maxQ = new PriorityQueue<>(Comparator.reverseOrder());
        }

        public void addNum(int num) {
            minQ.add(num);
            maxQ.offer(minQ.poll());
            if (minQ.size() < maxQ.size()) {
                minQ.add(maxQ.poll());
            }
        }

        public double findMedian() {
            if (minQ.size() == maxQ.size()) {
                return (double) (minQ.peek() + maxQ.peek()) / 2;
            } else {
                return (double) minQ.peek();
            }
        }
    }

}
