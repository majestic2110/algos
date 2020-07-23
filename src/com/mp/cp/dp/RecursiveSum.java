package com.mp.cp.dp;

public class RecursiveSum {
    /**
     * Returns the sum of first N numbers
     *
     * @param N
     * @return
     */
    public long sum(int N) {
        if (N < 0 || N > 1000) {
            throw new IllegalArgumentException("N must be greater than zero and less than 1001");
        }
        return N == 0 ? 0 : (long) N + (long) sum(N - 1);
    }
}
