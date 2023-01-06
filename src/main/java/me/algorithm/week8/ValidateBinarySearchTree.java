package me.algorithm.week8;

import me.algorithm.week5.TreeNode;

public class ValidateBinarySearchTree {
    private static final long INIT_MAX = 2147483648L;

    public boolean isValidBST(TreeNode root) {
        return dfs(root, INIT_MAX, INIT_MAX);
    }

    public boolean dfs(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        if ((min != INIT_MAX && min >= node.val) || (max != INIT_MAX && max <= node.val)) {
            return false;
        }

        return dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
    }
}
