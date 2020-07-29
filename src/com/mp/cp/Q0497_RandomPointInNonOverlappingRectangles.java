package com.mp.cp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q0497_RandomPointInNonOverlappingRectangles {

    private static final int X1 = 0;
    private static final int Y1 = 1;
    private static final int X2 = 2;
    private static final int Y2 = 3;

    private Random random;
    private int[][] rectangles;

    private List<Integer> prefixSums;
    private int totalSum = 0;

    public Q0497_RandomPointInNonOverlappingRectangles(int[][] rects) {
        this.rectangles = rects;
        this.random = new Random();
        this.prefixSums = new ArrayList<>();

        initializeSums();
    }

    private void initializeSums() {
        for (int[] rectangle : this.rectangles) {
            totalSum += (rectangle[2] - rectangle[0] + 1) * (rectangle[3] - rectangle[1] + 1);
            prefixSums.add(totalSum);
        }
    }

    public int[] pick() {
        int index = getRandomIndex();

        int[] rectangle = rectangles[index];
        int width = rectangle[X2] - rectangle[X1];
        int height = rectangle[Y2] - rectangle[Y1];

        int x = rectangle[X1] + random.nextInt(width + 1);
        int y = rectangle[Y1] + random.nextInt(height + 1);

        return new int[]{x, y};
    }

    private int getRandomIndex() {
        int target = random.nextInt(totalSum) + 1;
        int low = 0;
        int high = rectangles.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (target > prefixSums.get(mid)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
