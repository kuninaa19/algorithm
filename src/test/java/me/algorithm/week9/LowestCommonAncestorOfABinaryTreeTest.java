package me.algorithm.week9;

import me.algorithm.week5.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LowestCommonAncestorOfABinaryTreeTest {

    private LowestCommonAncestorOfABinaryTree lowestCommonAncestorOfABinaryTree;

    @BeforeEach
    void setUp() {
        lowestCommonAncestorOfABinaryTree = new LowestCommonAncestorOfABinaryTree();
    }

    @Test
    void 양쪽_서브트리의_상위노드() {
        int[] inputs = new int[]{3, 5, 1, 6, 2, 0, 8, 0, 0, 7, 4};
        TreeNode root = TreeNode.arrayToTree(inputs, 0);
        root.left.left = null;
        root.left.right = null;

        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);

        assertThat(lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q)).isEqualTo(root);
    }

    @Test
    void 노드중_하나가_상위노드() {
        int[] inputs = new int[]{3, 5, 1, 6, 2, 0, 8, 0, 0, 7, 4};
        TreeNode root = TreeNode.arrayToTree(inputs, 0);
        root.left.left.left = null;
        root.left.left.right = null;

        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(4);

        assertThat(lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q)).isEqualTo(root.left);
    }

    @Test
    void 단일_서브트리() {
        int[] inputs = new int[]{1, 2};
        TreeNode root = TreeNode.arrayToTree(inputs, 0);

        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);

        assertThat(lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q)).isEqualTo(root);
    }
}
