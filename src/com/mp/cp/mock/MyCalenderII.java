package com.mp.cp.mock;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MyCalenderII {
    @Test
    public void test() {
        MyCalendarTwo test = new MyCalendarTwo();
        test.book(10, 20);
        test.book(50, 60);
        test.book(10, 40);
        test.book(5, 15);
        test.book(5, 10);
        test.book(25, 55);
    }

    class MyCalendarTwo {
        List<int[]> intervals;
        List<int[]> overlaps;

        MyCalendarTwo() {
            intervals = new ArrayList<>();
            overlaps = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for (int[] iv : overlaps) {
                if (iv[0] < end && start < iv[1]) return false;
            }
            for (int[] iv : intervals) {
                if (iv[0] < end && start < iv[1])
                    overlaps.add(new int[]{Math.max(start, iv[0]), Math.min(end, iv[1])});
            }
            intervals.add(new int[]{start, end});
            return true;
        }
    }

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
}
