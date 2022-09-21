package me.algorithm.week5;

public class LowestCommonAncestorOfaBinarySearchTree {
    /* 이진 탐색 트리 조건에 부합해야 테스트 통과 */
    public static TreeNode lowestCommonAncestorImproved(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    /* 이진탐색 트리 조건에 부합하지않아도 테스트 통과 */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        TreeNode node1 = lowestCommonAncestor(root.left, p, q);
        TreeNode node2 = lowestCommonAncestor(root.right, p, q);

        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        if (node1 != null && node2 != null) {
            return root;
        }

        if (node1 != null) {
            return node1;
        }

        return node2;
    }
}
