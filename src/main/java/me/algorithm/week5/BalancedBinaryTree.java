package me.algorithm.week5;

public class BalancedBinaryTree {
    private static int dfs(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);

        if (Math.min(leftHeight, rightHeight) == -1) return -1;
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }

    /* 도저히 싱글 메서드로 트리 높이 비교를 할 수 없음. */
    public static boolean isBalanced(TreeNode root) {
        return dfs(root) >= 0;
    }
}
