package me.algorithm.week5;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public  TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode arrayToTree(int[] input, int index) {
        return index < input.length ?
                new TreeNode(input[index], arrayToTree(input, index * 2 + 1), arrayToTree(input, index * 2 + 2)) :
                null;
    }

    public static int[] TreeToArray(TreeNode input) {
        TreeNode currentNode = input;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<>();

        while (currentNode != null || !queue.isEmpty()) {
            arr.add(currentNode.val);

            if (currentNode.left != null)
                queue.add(currentNode.left);
            if (currentNode.right != null)
                queue.add(currentNode.right);

            currentNode = queue.poll();
        }

        return arr.stream().mapToInt(i -> i).toArray();
    }
}
