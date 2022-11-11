package me.algorithm.week7;

import me.algorithm.week5.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>(List.of(root));

        while (!queue.isEmpty()) {
            ArrayList<Integer> levels = new ArrayList<>();
            LinkedList<TreeNode> nextNodes = new LinkedList<>();

            while (!queue.isEmpty()) {
                TreeNode tempNode = queue.poll();
                levels.add(tempNode.val);

                if (tempNode.left != null) {
                    nextNodes.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    nextNodes.add(tempNode.right);
                }
            }

            result.add(levels);
            queue = nextNodes;
        }

        return result;
    }
}
