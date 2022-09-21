package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LowestCommonAncestorOfaBinarySearchTreeTest {
    @Test
    @DisplayName("공통의 부모노드를 가지고 있는 노드들")
    void testCommonParentNode() {
        /* null이 저장되지않는 관계로 -1 추가 */
        int[] inputs = new int[]{6, 2, 8, 0, 4, 7, 9, -1, -1, 3, 5};
        TreeNode root = TreeNode.arrayToTree(inputs, 0);
        root.left.left.left = null;
        root.left.left.right = null;

        TreeNode p = new TreeNode(0);
        TreeNode q = new TreeNode(7);

        TreeNode result = LowestCommonAncestorOfaBinarySearchTree.lowestCommonAncestor(root, p, q);
        TreeNode expected = new TreeNode(6);

        assertThat(result.val).isEqualTo(expected.val);
    }

    @Test
    @DisplayName("하나의 서브트리안에 찾으려는 자식노드들 존재 - 이진 탐색 트리 테스트 통과")
    void testCommonParentNodeIsCommonSubTreeAsBST() {
        int[] inputs = new int[]{5, 2, 8, 1, 4, 7, 9};
        TreeNode root = TreeNode.arrayToTree(inputs, 0);

        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);

        TreeNode result = LowestCommonAncestorOfaBinarySearchTree.lowestCommonAncestor(root, p, q);
        TreeNode expected = new TreeNode(2);

        assertThat(result.val).isEqualTo(expected.val);
    }

    @Test
    @DisplayName("하나의 서브트리안에 찾으려는 자식노드들 존재 - 이진 트리만 통과")
    void testCommonParentNodeIsCommonSubTree() {
        int[] inputs = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        TreeNode root = TreeNode.arrayToTree(inputs, 0);

        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(10);

        TreeNode result = LowestCommonAncestorOfaBinarySearchTree.lowestCommonAncestor(root, p, q);
        TreeNode expected = new TreeNode(2);

        assertThat(result.val).isEqualTo(expected.val);
    }
}
