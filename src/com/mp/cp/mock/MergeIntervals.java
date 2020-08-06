package com.mp.cp.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<int[]> res = new ArrayList<>();
        int[] prev = intervals[0];
        res.add(prev);
        for (int[] cur : intervals) {
            if (prev[1] < cur[0]) {
                prev = cur;
                res.add(prev);
            } else {
                prev[1] = Math.max(prev[1], cur[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
