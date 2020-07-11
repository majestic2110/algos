package com.mp.cp;

import java.util.HashMap;
import java.util.Map;

public class Q0454_4SumII {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if (A == null || B == null || C == null || D == null || A.length == 0 || B.length == 0 || C.length == 0 || D.length == 0) {
            return 0;
        }
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int itemA : A) {
            for (int itemB : B) {
                int sum = itemA + itemB;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for (int itemC : C) {
            for (int itemD : D) {
                int sum = -itemC - itemD;
                if (map.containsKey(sum)) {
                    count += map.get(sum);
                }
            }
        }
        return count;
    }

    public int fourSumCountII(int[] A, int[] B, int[] C, int[] D) {
        return kSumCount(new int[][]{A, B, C, D});
    }

    private int kSumCount(int[][] lists) {
        Map<Integer, Integer> map = new HashMap<>();
        buildMap(lists, map, 0, 0);
        return countSum(lists, map, lists.length / 2, 0);
    }

    private void buildMap(int[][] lists, Map<Integer, Integer> map, int i, int sum) {
        if (i == lists.length / 2) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        } else {
            for (int a : lists[i]) {
                buildMap(lists, map, i + 1, sum + a);
            }
        }
    }

    private int countSum(int[][] lists, Map<Integer, Integer> map, int i, int sum) {
        if (i == lists.length) {
            return map.getOrDefault(sum, 0);
        } else {
            int count = 0;
            for (int a : lists[i]) {
                count += countSum(lists, map, i + 1, sum - a);
            }
            return count;
        }
    }
}
