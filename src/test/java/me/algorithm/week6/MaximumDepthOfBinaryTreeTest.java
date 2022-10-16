package me.algorithm.week6;

import me.algorithm.week5.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumDepthOfBinaryTreeTest {
    @Test
    void 루트노드_왼쪽_서브트리보다_루트노드_오른쪽_서브트리가_깊이가_깊을때() {
        TreeNode root = TreeNode.arrayToTree(new int[]{3, 9, 20, 0, 0, 15, 7}, 0);
        root.left.left = null;
        root.left.right = null;
        int result = MaximumDepthOfBinaryTree.maxDepth(root);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void 노드가_2개일때_최대깊이_2() {
        TreeNode root = TreeNode.arrayToTree(new int[]{1, 3}, 0);
        int result = MaximumDepthOfBinaryTree.maxDepth(root);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void 노드가_1개일때_최대깊이_1() {
        TreeNode root = TreeNode.arrayToTree(new int[]{1}, 0);
        int result = MaximumDepthOfBinaryTree.maxDepth(root);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void 노드가_0개일때_최대깊이_0() {
        int result = MaximumDepthOfBinaryTree.maxDepth(null);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void 음수값을_갖고있는_노드가_존재() {
        TreeNode root = TreeNode.arrayToTree(new int[]{1, 0, -2}, 0);
        root.left = null;
        int result = MaximumDepthOfBinaryTree.maxDepth(root);

        assertThat(result).isEqualTo(2);
    }
}
