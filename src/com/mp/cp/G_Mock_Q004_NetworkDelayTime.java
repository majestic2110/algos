package com.mp.cp;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class G_Mock_Q004_NetworkDelayTime {
    /**
     * There are N network nodes, labelled 1 to N.
     * <p>
     * Given times, a list of travel times as directed edges times[i] = (u, v, w), where u is the source node, v is the target node, and w is the time it takes for a signal to travel from source to target.
     * <p>
     * Now, we send a signal from a certain node K. How long will it take for all nodes to receive the signal? If it is impossible, return -1.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * <p>
     * Input: times = [[2,1,1],[2,3,1],[3,4,1]], N = 4, K = 2
     * Output: 2
     * <p>
     * <p>
     * Note:
     * <p>
     * N will be in the range [1, 100].
     * K will be in the range [1, N].
     * The length of times will be in the range [1, 6000].
     * All edges times[i] = (u, v, w) will have 1 <= u, v <= N and 0 <= w <= 100.
     *
     * @param times
     * @param N
     * @param K
     * @return
     */
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
