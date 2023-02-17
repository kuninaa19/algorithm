package me.algorithm.week9;

import me.algorithm.week5.TreeNode;

public class LowestCommonAncestorOfABinaryTree {
    private TreeNode copyNode;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);

        return copyNode;
    }

    private boolean dfs(TreeNode node, TreeNode p, TreeNode q) {
        if (copyNode != null || node == null) {
            return false;
        }

        boolean leftResult = dfs(node.left, p, q);
        boolean rightResult = dfs(node.right, p, q);

        if (((node.val == p.val || node.val == q.val) && (leftResult || rightResult)) || (leftResult && rightResult)) {
            copyNode = node;
            return false;
        }

        return (node.val == p.val || node.val == q.val) || leftResult || rightResult;
    }
}
