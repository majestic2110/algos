package com.mp.cp;

import java.util.HashSet;
import java.util.Set;

public class Q0939_MinimumAreaRectangle {
    public int minAreaRect(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        Set<String> set = new HashSet<>();
        int n = points.length;
        for (int i = 0; i < n; i++) {
            set.add(String.valueOf(points[i][0]) + "#" + String.valueOf(points[i][1]));
        }
        int minArea = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String point3 = String.valueOf(points[j][0]) + "#" + String.valueOf(points[i][1]);
                String point4 = String.valueOf(points[i][0]) + "#" + String.valueOf(points[j][1]);
                if (points[i][0] != points[j][0] && points[i][1] != points[j][1] && set.contains(point3) && set.contains(point4)) {
                    minArea = Math.min(minArea, Math.abs(points[j][1] - points[i][1]) * Math.abs(points[j][0] - points[i][0]));
                }
            }
        }
        return minArea == Integer.MAX_VALUE ? 0 : minArea;
    }
}
