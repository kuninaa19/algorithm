package me.algorithm.week8;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private static final int ALPHABET_COUNT = 26;
    private static final char ALPHABET_START = 'a';

    private final boolean endWord;
    private final List<Node> childNodes;

    public Node() {
        childNodes = initChildNodes();
        endWord = false;
    }

    public Node(boolean endWord) {
        this.childNodes = initChildNodes();
        this.endWord = endWord;
    }

    public Node(List<Node> childNodes, boolean endWord) {
        this.childNodes = childNodes;
        this.endWord = endWord;
    }

    private static List<Node> initChildNodes() {
        List<Node> initializeChildren = new ArrayList<>(ALPHABET_COUNT);

        for (int i = 0; i < ALPHABET_COUNT; i++) {
            initializeChildren.add(null);
        }

        return initializeChildren;
    }

    public void addChildNode(char alphabet, boolean endWord) {
        int index = getChildNodeIdx(alphabet);

        if (!existChildNode(index)) {
            childNodes.set(index, new Node(endWord));
        } else if (endWord) {
            Node currentNode = this.getChildNode(alphabet);
            childNodes.set(index, new Node(currentNode.childNodes, true));
        }
    }

    private int getChildNodeIdx(char alphabet) {
        return alphabet - ALPHABET_START;
    }

    private boolean existChildNode(int index) {
        return childNodes.get(index) != null;
    }

    public boolean isEndWord() {
        return endWord;
    }

    public Node getChildNode(char alphabet) {
        int index = getChildNodeIdx(alphabet);

        return childNodes.get(index);
    }
}