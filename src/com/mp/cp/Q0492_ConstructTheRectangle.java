package com.mp.cp;

public class Q0492_ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        if (area <= 0) {
            return new int[]{};
        }
        int sqrt = (int) Math.sqrt(area);
        if (sqrt * sqrt == area) {
            return new int[]{sqrt, sqrt};
        }
        while (area % sqrt != 0) {
            sqrt--;
        }
        return new int[]{area / sqrt, sqrt};
    }
}
