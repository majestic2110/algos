package com.mp.cp;

import java.util.TreeSet;

public class G_Mock_Q002_KEmptySlots {
    /**
     * You have N bulbs in a row numbered from 1 to N. Initially, all the bulbs are turned off. We turn on exactly one bulb everyday until all bulbs are on after N days.
     * <p>
     * You are given an array bulbs of length N where bulbs[i] = x means that on the (i+1)th day, we will turn on the bulb at position x where i is 0-indexed and x is 1-indexed.
     * <p>
     * Given an integer K, find out the minimum day number such that there exists two turned on bulbs that have exactly K bulbs between them that are all turned off.
     * <p>
     * If there isn't such day, return -1
     * <p>
     * Example 1:
     * <p>
     * Input:
     * bulbs: [1,3,2]
     * K: 1
     * Output: 2
     * Explanation:
     * On the first day: bulbs[0] = 1, first bulb is turned on: [1,0,0]
     * On the second day: bulbs[1] = 3, third bulb is turned on: [1,0,1]
     * On the third day: bulbs[2] = 2, second bulb is turned on: [1,1,1]
     * We return 2 because on the second day, there were two on bulbs with one off bulb between them.
     * Example 2:
     * <p>
     * Input:
     * bulbs: [1,2,3]
     * K: 1
     * Output: -1
     * <p>
     * <p>
     * Note:
     * <p>
     * 1 <= N <= 20000
     * 1 <= bulbs[i] <= N
     * bulbs is a permutation of numbers from 1 to N.
     * 0 <= K <= 20000
     *
     * @param bulbs
     * @param K
     * @return
     */
    public int kEmptySlots(int[] bulbs, int K) {
        if (bulbs == null || bulbs.length - 2 < K) {
            return -1;
        }
        TreeSet<Integer> map = new TreeSet<>();
        map.add(Integer.MIN_VALUE);
        map.add(Integer.MAX_VALUE);
        int count = 0;
        for (int bulb : bulbs) {
            Integer leftMax = map.floor(bulb);
            Integer rightMax = map.ceiling(bulb);
            count++;
            if (rightMax - bulb - 1 == K) {
                return count;
            }
            if (bulb - leftMax - 1 == K) {
                return count;
            }
            map.add(bulb);
        }
        return -1;
    }
}
