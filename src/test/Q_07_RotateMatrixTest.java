package test;

import com.mp.cp.ctci.ch01.Q_07_RotateMatrix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q_07_RotateMatrixTest {
    @Test
    public void testCaseI() {
        Q_07_RotateMatrix test = new Q_07_RotateMatrix();
        int[][] matrix1 = {{1, 1, 0, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 0, 1, 0}};
        int[][] matrix2 = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            matrix2[i] = getColumn(matrix1, i);
        }
        test.rotate(matrix1);
        assertTrue(getArr(matrix2).equals(getArr(matrix1)));
    }

    private int[] getColumn(int[][] matrix, int column) {
        return IntStream.range(0, matrix.length)
                .map(i -> matrix[i][column]).toArray();
    }

    private String getArr(int[][] arr) {
        StringBuffer buff = new StringBuffer();
        for (int[] item : arr) {
            buff.append("\n" + Arrays.toString(item));
        }
        System.out.println(buff.toString());
        return buff.toString();
    }
}
