package com.mp.cp;

public class Q1093_StatisticsFromALargeSample {

    public double[] sampleStats(int[] count) {
        if (count == null || count.length == 0) {
            return new double[]{};
        }
        int left = 0;
        int right = count.length - 1;
        int leftCount = 0;
        int rightCount = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int medianLeft = 0;
        int medianRight = 0;
        int mode = 0;
        double avg = 0;
        double median = 0;
        while (left <= right) {
            while (count[left] == 0) {
                left++;
            }
            while (count[right] == 0) {
                right--;
            }
            if (leftCount < rightCount) {
                avg += count[left] * left;
                leftCount += count[left];
                if (count[left] > count[mode]) {
                    mode = left;
                }
                min = Math.min(min, left);
                medianLeft = left;
                left++;
            } else {
                avg += count[right] * right;
                rightCount += count[right];
                if (count[right] > count[mode]) {
                    mode = right;
                }
                max = Math.max(max, right);
                medianRight = right;
                right--;
            }
        }
        avg /= (leftCount + rightCount);
        if (rightCount > leftCount) {
            median = medianRight;
        } else if (leftCount > rightCount) {
            median = medianLeft;
        } else {
            median = (double) (medianLeft + medianRight) / 2;
        }
        return new double[]{min, max, avg, median, mode};
    }
}
