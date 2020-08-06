package com.mp.cp.mock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodesAndReturnForest {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int del : to_delete) {
            set.add(del);
        }
        helper(root, null, false, list, set);
        return list;
    }

    private void helper(TreeNode curr, TreeNode root, boolean isLeft, List<TreeNode> list, Set<Integer> set) {
        if (curr == null) {
            return;
        }
        if (set.contains(curr.val)) {
            helper(curr.left, null, true, list, set);
            helper(curr.right, null, false, list, set);
            if (root != null) {
                if (isLeft) {
                    root.left = null;
                } else {
                    root.right = null;
                }
            }
        } else {
            if (root == null) {
                list.add(curr);
            }
            helper(curr.left, curr, true, list, set);
            helper(curr.right, curr, false, list, set);
        }
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
