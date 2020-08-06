package com.mp.cp.mock;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class KnightProbabilityInChessboard {
    int[][] dirs = {{-2, 1}, {-2, -1}, {2, 1}, {2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};

    @Test
    public void test() {
        KnightProbabilityInChessboard test = new KnightProbabilityInChessboard();
        test.knightProbability(3, 2, 0, 0);
    }

    private String getArr(double[][] arr) {
        StringBuffer buff = new StringBuffer();
        for (double[] item : arr) {
            buff.append("\n" + Arrays.toString(item));
        }
        return buff.toString();
    }

    public double knightProbability(int N, int K, int r, int c) {
        if (N <= 0) {
            return 0;
        }
        double prob = 0.0;
        double[][] dp = new double[N][N];
        dp[r][c] = 1;
        while (K-- > 0) {
            double[][] dp2 = new double[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int[] dir : dirs) {
                        int row = i + dir[0];
                        int col = j + dir[1];
                        if (row >= 0 && row < N && col >= 0 && col < N) {
                            dp2[row][col] += dp[i][j] / 8.0;
                        }
                    }
                }
            }
            dp = dp2;
            System.out.println("K = " + K + " " + getArr(dp));
        }
        for (double[] row : dp) {
            for (double x : row) {
                prob += x;
            }
        }
        return prob;
    }
}
