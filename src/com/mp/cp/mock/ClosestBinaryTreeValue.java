package com.mp.cp.mock;

public class ClosestBinaryTreeValue {
    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            return 0;
        }
        int closetVal = root.val;
        while (root != null) {
            if (Math.abs(root.val - target) < Math.abs(closetVal - target)) {
                closetVal = root.val;
            }
            root = root.val > target ? root.left : root.right;
        }
        return closetVal;
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
