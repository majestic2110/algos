package com.mp.cp.ctci.ch01;

public class Q_07_RotateMatrix {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return;
        }
        int n = matrix.length;
        int layers = (n + 1) / 2;
        for (int i = 0; i < layers; i++) {
            rotateLayer(matrix, i, n);
        }
    }

    private void rotateLayer(int[][] matrix, int layer, int n) {
        int out = n - layer;
        for (int i = layer + 1; i < out; i++) {
            int temp = matrix[layer][i];
            matrix[layer][i] = matrix[i][layer];
            matrix[i][layer] = temp;
        }
        for (int i = layer + 1; i < out - 1; i++) {
            int temp = matrix[out - 1][i];
            matrix[out - 1][i] = matrix[i][out - 1];
            matrix[i][out - 1] = temp;
        }
    }
}
