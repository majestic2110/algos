package com.mp.cp.mock;

import java.util.HashSet;
import java.util.Set;

public class MinimumRectangleArea {

    public int minAreaRect(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        int minArea = Integer.MAX_VALUE;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < points.length; i++) {
            set.add(points[i][0] + "#" + points[i][1]);
        }
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i][0] != points[j][0] && points[i][1] != points[j][1] && set.contains(points[i][0] + "#" + points[j][1]) && set.contains(points[j][0] + "#" + points[i][1])) {
                    int area = (points[j][0] - points[i][0]) * (points[j][1] - points[i][1]);
                    minArea = Math.min(Math.abs(area), minArea);
                }
            }
        }
        return minArea == Integer.MAX_VALUE ? 0 : minArea;
    }
}
