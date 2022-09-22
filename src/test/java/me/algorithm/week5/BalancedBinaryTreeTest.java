package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BalancedBinaryTreeTest {
    @Test
    @DisplayName("각 서브트리의 높이 차이가 1이하다.")
    void testBalancedTree() {
        /* null이 저장되지않는 관계로 -1 추가 */
        int[] inputs = new int[]{3, 9, 20, -1, -1, 15, 7};
        TreeNode root = TreeNode.arrayToTree(inputs, 0);
        root.left.left = null;
        root.left.right = null;

        boolean result = BalancedBinaryTree.isBalanced(root);

        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("비대칭 트리일 경우 false")
    void testUnbalancedTree() {
        int[] inputs = new int[]{1, 2, 2, 3, -1, -1, 3, 4, -1, -1, 4};
        TreeNode root = TreeNode.arrayToTree(inputs, 0);
        root.left.right = null;
        root.right.left = null;
        root.left.left.right = null;
        root.right.right.left = null;

        boolean result = BalancedBinaryTree.isBalanced(root);

        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("노드의 값이 없다면 true")
    void testEmptyNode() {
        int[] inputs = new int[]{};
        TreeNode root = TreeNode.arrayToTree(inputs, 0);

        boolean result = BalancedBinaryTree.isBalanced(root);

        assertThat(result).isEqualTo(true);
    }
}