package me.algorithm.week6;

import me.algorithm.week5.TreeNode;

public class DiameterOfBinaryTree {
    public static int diameterOfBinaryTree(TreeNode root) {
        int[] maxDiameter = new int[]{0};
        dfs(root, maxDiameter);

        return maxDiameter[0];
    }

    private static int dfs(TreeNode root, int[] maxDiameter) {
        if (root == null) {
            return 0;
        }

        int leftEdge = dfs(root.left, maxDiameter);
        int rightEdge = dfs(root.right, maxDiameter);

        if (maxDiameter[0] < leftEdge + rightEdge) {
            maxDiameter[0] = leftEdge + rightEdge;
        }

        return Math.max(leftEdge, rightEdge) + 1;
    }
}
