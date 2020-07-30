package com.mp.cp.ctci.ch01;

public class Q_08_ZeroMatrix {
    public void zeroMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        boolean firstRowZero = false;
        boolean firstColZero = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0][i] == 0) {
                firstRowZero = true;
                break;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[0][i] == 0) {
                nullRow(matrix, i);
            }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[i][0] == 0) {
                nullCol(matrix, i);
            }
        }
    }


    private void nullRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
    }

    private void nullCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
