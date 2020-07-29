package com.mp.cp;

import java.util.HashSet;
import java.util.Set;

public class Q0963_MinimumAreaRectangleII {
    public double minAreaFreeRect(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        Set<String> set = new HashSet<>();
        double minArea = Double.MAX_VALUE;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            set.add(String.valueOf(points[i][0]) + "#" + String.valueOf(points[i][1]));
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] d1 = new int[]{points[j][0] - points[i][0], points[j][1] - points[i][1]};
                for (int k = j + 1; k < n; k++) {
                    int[] d2 = new int[]{points[k][0] - points[i][0], points[k][1] - points[i][1]};
                    if (d1[0] * d2[0] + d1[1] * d2[1] != 0) {
                        continue;
                    }
                    int x = points[k][0] + d1[0];
                    int y = points[k][1] + d1[1];
                    if (set.contains(String.valueOf(x) + "#" + String.valueOf(y))) {
                        double area = Math.sqrt(d1[0] * d1[0] + d1[1] * d1[1]) *
                                Math.sqrt(d2[0] * d2[0] + d2[1] * d2[1]);
                        minArea = Math.min(minArea, area);
                    }
                }
            }
        }
        return minArea == Double.MAX_VALUE ? 0 : minArea;
    }
}
