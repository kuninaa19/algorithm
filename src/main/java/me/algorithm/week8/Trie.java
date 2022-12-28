package me.algorithm.week8;

public class Trie {
    private final Node node;
    private Node searchNode;

    public Trie() {
        node = new Node();
    }

    public void insert(String word) {
        searchNode = node;

        for (int i = 0; i < word.length(); i++) {
            char alphabet = word.charAt(i);

            searchNode.addChildNode(alphabet, isEndWord(i + 1, word));
            searchNode = searchNode.getChildNode(alphabet);
        }
    }

    private boolean isEndWord(int index, String word) {
        return index == word.length();
    }

    public boolean search(String word) {
        searchNode = node;

        for (int i = 0; i < word.length(); i++) {
            char alphabet = word.charAt(i);

            searchNode = searchNode.getChildNode(alphabet);

            if (searchNode == null) {
                return false;
            }
        }

        return searchNode.isEndWord();
    }

    public boolean startsWith(String prefix) {
        searchNode = node;

        for (int i = 0; i < prefix.length(); i++) {
            char alphabet = prefix.charAt(i);

            searchNode = searchNode.getChildNode(alphabet);

            if (searchNode == null) {
                return false;
            }
        }

        return true;
    }
}
