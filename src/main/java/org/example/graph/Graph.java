package org.example.graph;

import java.util.*;

public class Graph<T> {
    private final Map<T, Set<T>> adjacencyMatrix = new HashMap<>();

    public void addNode(T node) {
        adjacencyMatrix.putIfAbsent(node, new HashSet<>());
    }

    public void addEdge(T nodeFrom, T nodeTo){
        addNode(nodeFrom);
        addNode(nodeTo);
        adjacencyMatrix.get(nodeFrom).add(nodeTo);
    }

    public boolean containsNode(T node){
        return adjacencyMatrix.containsKey(node);
    }

    public Collection<T> getNeighbours(T node) {
        if (!containsNode(node)) {
            return Collections.emptySet();
        }

        return adjacencyMatrix.get(node);
    }
}
