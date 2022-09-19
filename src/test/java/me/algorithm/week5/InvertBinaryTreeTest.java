package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InvertBinaryTreeTest {
    @Test
    @DisplayName("반전된 서브트리")
    void testInvertTree() {
        int[] input = new int[]{4, 2, 7, 1, 3, 6, 9};
        TreeNode node = TreeNode.arrayToTree(input, 0);
        TreeNode result = InvertBinaryTree.invertTree(node);

        int[] expected = new int[]{4, 7, 2, 9, 6, 3, 1};
        assertThat(TreeNode.TreeToArray(result)).isEqualTo(expected);
    }

    @Test
    @DisplayName("노드 갯수 0")
    void testEmptyNode() {
        int[] input = new int[]{};
        TreeNode node = TreeNode.arrayToTree(input, 0);
        TreeNode result = InvertBinaryTree.invertTree(node);

        int[] expected = new int[]{};
        assertThat(TreeNode.TreeToArray(result)).isEqualTo(expected);
    }
}
