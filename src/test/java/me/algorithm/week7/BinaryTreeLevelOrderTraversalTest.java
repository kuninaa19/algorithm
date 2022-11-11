package me.algorithm.week7;

import me.algorithm.week5.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreeLevelOrderTraversalTest {

    private BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal;

    @BeforeEach
    void setUp() {
        binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
    }

    @Test
    void 왼쪽_서브트리에_null() {
        TreeNode root = TreeNode.arrayToTree(new int[]{3, 9, 20, 0, 0, 15, 7}, 0);
        root.left.left = null;
        root.left.right = null;

        List<List<Integer>> result = binaryTreeLevelOrderTraversal.levelOrder(root);

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7));

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 단일_노드() {
        TreeNode root = TreeNode.arrayToTree(new int[]{1}, 0);

        List<List<Integer>> result = binaryTreeLevelOrderTraversal.levelOrder(root);

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1));

        assertThat(result).isEqualTo(expected);
    }


    @Test
    void 노드없음() {
        List<List<Integer>> result = binaryTreeLevelOrderTraversal.levelOrder(null);

        List<List<Integer>> expected = new LinkedList<>();

        assertThat(result).isEqualTo(expected);
    }

}
