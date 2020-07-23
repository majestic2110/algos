package com.mp.cp.dp;

public class RecursivePower {
    /**
     * @param x
     * @param n
     * @return
     */
    public long power(int x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        return n == 0 ? 0 : (n == 1 ? x : x * power(x, n - 1));
    }
}
