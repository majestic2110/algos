package com.mp.cp;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class G_Mock_Q004_NetworkDelay {

    public int networkDelayTime(int[][] times, int N, int K) {
        if (times == null || times.length == 0 || times[0].length == 0) {
            return 0;
        }

        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int[] time : times) {
            map.putIfAbsent(time[0], new HashMap<>());
            map.get(time[0]).put(time[1], time[2]);
        }

        Queue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        pq.add(new int[]{0, K});

        boolean[] visited = new boolean[N + 1];
        int delay = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.remove();
            int curNode = curr[1];
            int curDist = curr[0];
            if (visited[curNode]) {
                continue;
            }
            visited[curNode] = true;
            delay = curDist;
            N--;
            if (N == 0) {
                return delay;
            }
            if (map.containsKey(curNode)) {
                for (int next : map.get(curNode).keySet()) {
                    pq.add(new int[]{curDist + map.get(curNode).get(next), next});
                }
            }
        }
        return -1;
    }
}
