package com.mp.cp;

import java.util.*;

public class Q0750_NoOfCornerRectangles {

    public int countCornerRectangles(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        List<int[]> points = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    points.add(new int[]{i, j});
                }
            }
        }
        Set<String> set = new HashSet<>();
        int n = points.size();
        for (int i = 0; i < n; i++) {
            set.add(String.valueOf(points.get(i)[0]) + "#" + String.valueOf(points.get(i)[1]));
        }
        int count = 0;
        Set<String> recs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String point3 = String.valueOf(points.get(j)[0]) + "#" + String.valueOf(points.get(i)[1]);
                String point4 = String.valueOf(points.get(i)[0]) + "#" + String.valueOf(points.get(j)[1]);
                if (points.get(i)[0] != points.get(j)[0] && points.get(i)[1] != points.get(j)[1] && set.contains(point3) && set.contains(point4)) {
                    recs.add(addToSet(new int[][]{points.get(i), points.get(j), new int[]{points.get(j)[0], points.get(i)[1]}, new int[]{points.get(i)[0], points.get(j)[1]}}));
                }
            }
        }
        return recs.size();
    }

    private String addToSet(int[][] points) {
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });
        StringBuilder buff = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            buff.append(points[i][0] + ",");
            buff.append(points[i][1] + "#");
        }
        return buff.toString();
    }

    public int countCornerRectanglesII(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        Map<Integer, Integer> count = new HashMap();
        int ans = 0;
        for (int[] row : grid) {
            for (int c1 = 0; c1 < row.length; ++c1)
                if (row[c1] == 1) {
                    for (int c2 = c1 + 1; c2 < row.length; ++c2)
                        if (row[c2] == 1) {
                            int pos = c1 * 200 + c2;
                            int c = count.getOrDefault(pos, 0);
                            ans += c;
                            count.put(pos, c + 1);
                        }
                }
        }
        return ans;
    }
}
