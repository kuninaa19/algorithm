package me.algorithm.week7;

import java.util.*;

public class CloneGraph {

    /* BFS 풀이법
    * 조건이 너무 많다
    *  */
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        HashMap<Integer, Node> collector = new HashMap<>();
        Node result = new Node(node.val, new ArrayList<>());
        LinkedList<Node> queue = new LinkedList<>(node.neighbors);

        collector.put(result.val, result);

        for (int i = 0; i < node.neighbors.size(); i++) {
            Node neighborNode = new Node(node.neighbors.get(i).val, new ArrayList<>());
            result.neighbors.add(neighborNode);
            collector.put(neighborNode.val, neighborNode);
        }

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            Node tempNode;

            if (!collector.containsKey(currentNode.val)) {
                tempNode = new Node(currentNode.val, new ArrayList<>());
                collector.put(tempNode.val, tempNode);
            } else {
                tempNode = collector.get(currentNode.val);
            }

            for (int i = 0; i < currentNode.neighbors.size(); i++) {
                Node cloned = collector.get(currentNode.neighbors.get(i).val);
                if (cloned == null) {
                    cloned = new Node(currentNode.neighbors.get(i).val, new ArrayList<>());
                    tempNode.neighbors.add(cloned);

                    collector.put(cloned.val, cloned);

                    queue.add(currentNode.neighbors.get(i));
                } else if (!tempNode.neighbors.contains(cloned)) {
                    tempNode.neighbors.add(cloned);
                }
            }
        }

        return result;
    }

    private final HashMap<Node, Node> mapClone = new HashMap<>();

    /* DFS 풀이법
    * BFS 방식이 더 간단할거같았는데 코드를 보니 훨씬 간결하다
    * */
    public Node cloneGraphImproved(Node node) {
        if (node == null) {
            return null;
        }

        if (mapClone.get(node) != null) {
            return mapClone.get(node);
        }

        Node copy = new Node(node.val);
        mapClone.put(node, copy);

        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(cloneGraphImproved(neighbor));
        }
        return copy;
    }
}