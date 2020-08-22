package com.mp.cp.mock;

import org.junit.jupiter.api.Test;

import java.util.*;

public class VerticalOrderTraversalBinaryTree {

    @Test
    public void simulate() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        verticalTraversal(root);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Map<Integer, List<NodeInfo>> map = new HashMap<>();
        Queue<NodeInfo> q = new LinkedList<>();
        q.offer(new NodeInfo(root, 0, 0));
        int minX = 0;
        int maxX = 0;
        while (!q.isEmpty()) {
            NodeInfo cur = q.poll();
            map.putIfAbsent(cur.X, new ArrayList<>());
            minX = Math.min(minX, cur.X);
            maxX = Math.max(maxX, cur.X);

            map.get(cur.X).add(cur);
            if (cur.root.left != null) {
                q.offer(new NodeInfo(cur.root.left, cur.X - 1, cur.Y - 1));
            }
            if (cur.root.right != null) {
                q.offer(new NodeInfo(cur.root.right, cur.X + 1, cur.Y - 1));
            }
        }
        int index = 0;
        for (int i = minX; i <= maxX; i++) {
            Collections.sort(map.get(i), (a, b) -> {
                return a.Y == b.Y ? a.root.val - b.root.val : b.Y - a.Y;
            });
            list.add(new ArrayList<>());
            for (NodeInfo node : map.get(i)) {
                list.get(index).add(node.root.val);
            }
            index++;
        }
        return list;
    }

    class TreeNode {
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

    class NodeInfo {
        TreeNode root;
        int X;
        int Y;

        public NodeInfo(TreeNode root, int X, int Y) {
            this.root = root;
            this.X = X;
            this.Y = Y;
        }
    }
}