package com.mp.cp.mock;

public class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        if (seats == null || seats.length == 0) {
            return 0;
        }

        int dist = 0;
        int n = seats.length;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 0) {
                continue;
            }
            dist = last < 0 ? i : Math.max(dist, (i - last) / 2);
            last = i;
        }
        dist = Math.max(dist, n - last - 1);
        return dist;

    }

}
