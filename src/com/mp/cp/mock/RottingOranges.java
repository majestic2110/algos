package com.mp.cp.mock;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    final int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return -1;
        }
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }
        if (fresh == 0) {
            return 0;
        }
        if (q.size() <= 0) {
            return -1;
        }
        int minutes = 0;
        while (!q.isEmpty()) {
            ++minutes;
            int size = q.size();
            while (size-- > 0) {
                int[] curr = q.poll();
                for (int[] dir : dirs) {
                    int x = dir[0] + curr[0];
                    int y = dir[1] + curr[1];
                    if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
                        fresh--;
                        grid[x][y] = 2;
                        q.add(new int[]{x, y});
                    }
                }
            }
        }
        return fresh == 0 ? minutes - 1 : -1;
    }
}
