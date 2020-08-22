package com.mp.cp.mock;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {
    public int pathSum(TreeNode root, int target) {
        if (root == null) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return find(root, 0, target, map);
    }

    private int find(TreeNode root, int curSum, int target, Map<Integer, Integer> map) {
        if (root == null) {
            return 0;
        }
        curSum += root.val;
        int count = map.getOrDefault(curSum - target, 0);
        map.put(curSum, map.getOrDefault(curSum, 0) + 1);
        count += find(root.left, curSum, target, map) + find(root.right, curSum, target, map);
        map.put(curSum, map.get(curSum) - 1);
        return count;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
