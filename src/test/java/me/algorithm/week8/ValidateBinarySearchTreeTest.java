package me.algorithm.week8;

import me.algorithm.week5.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateBinarySearchTreeTest {
    @Test
    void 성공케이스() {
        TreeNode treeNode = TreeNode.arrayToTree(new int[]{2, 1, 3}, 0);

        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        assertThat(validateBinarySearchTree.isValidBST(treeNode)).isTrue();
    }

    @Test
    void 우측_서브트리에서_루트노드보다_작은값이_존재() {
        TreeNode treeNode = TreeNode.arrayToTree(new int[]{5, 1, 4, 0, 0, 3, 6}, 0);
        treeNode.left.left = null;
        treeNode.left.right = null;

        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        assertThat(validateBinarySearchTree.isValidBST(treeNode)).isFalse();
    }

    @Test
    void 좌측_서브트리에서_루트노드보다_큰값이_존재() {
        TreeNode treeNode = TreeNode.arrayToTree(new int[]{3, 2, 5, 1, 4}, 0);

        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        assertThat(validateBinarySearchTree.isValidBST(treeNode)).isFalse();
    }
}
