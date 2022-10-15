package me.algorithm.week6;

import me.algorithm.week5.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiameterOfBinaryTreeTest {
    @Test
    void 루트를_통하는_두_노드간_간선() {
        TreeNode root = TreeNode.arrayToTree(new int[]{1, 2, 3, 4, 5}, 0);

        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void 루트를_통하지않는_두_노드간_간선() {
        TreeNode root = TreeNode.arrayToTree(new int[]{1, 2, 0, 4, 5, 0, 0, 6, 7, 8, 9, 0, 0, 0, 0, 10}, 0);
        root.right = null;

        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void 단일노드() {
        TreeNode root = TreeNode.arrayToTree(new int[]{1}, 0);

        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void 노드_2개() {
        TreeNode root = TreeNode.arrayToTree(new int[]{1, 2}, 0);

        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void 노드값이_음수_일때() {
        TreeNode root = TreeNode.arrayToTree(new int[]{-5, -3, 5}, 0);

        int result = DiameterOfBinaryTree.diameterOfBinaryTree(root);

        assertThat(result).isEqualTo(2);
    }
}
