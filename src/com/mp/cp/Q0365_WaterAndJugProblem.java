package com.mp.cp;


public class Q0365_WaterAndJugProblem {
    public boolean canMeasureWater(int x, int y, int z) {
        if (x == z || y == z || x + y == z) {
            return true;
        }
        if (x + y < z) {
            return false;
        }
        return z % gcd(x, y) == 0;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
