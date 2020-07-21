package com.mp.cp;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q0407_TrappingRainWaterII {
    final int[][] dirs = new int[][]{{0, -1}, {-1, 0}, {0, 1}, {1, 0}};

    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
            return 0;
        }
        int rows = heightMap.length;
        int cols = heightMap[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[2] - b[2];
            }
        });
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < cols; i++) {
            visited[0][i] = true;
            pq.offer(new int[]{0, i, heightMap[0][i]});
            visited[rows - 1][i] = true;
            pq.offer(new int[]{rows - 1, i, heightMap[rows - 1][i]});
        }
        for (int i = 0; i < rows; i++) {
            visited[i][0] = true;
            pq.offer(new int[]{i, 0, heightMap[i][0]});
            visited[i][cols - 1] = true;
            pq.offer(new int[]{i, cols - 1, heightMap[i][cols - 1]});
        }
        int water = 0;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            for (int[] dir : dirs) {
                int row = curr[0] + dir[0];
                int col = curr[1] + dir[1];
                if (row >= 0 && row < rows && col >= 0 && col < cols && !visited[row][col]) {
                    visited[row][col] = true;
                    water += Math.max(0, curr[2] - heightMap[row][col]);
                    pq.offer(new int[]{row, col, Math.max(heightMap[row][col], curr[2])});
                }
            }
        }
        return water;
    }
}
