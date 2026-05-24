package org.example.graph;

import java.util.*;

public class GraphSearch {

    public static <T> Set<T> commonReachableNodes(Graph<T> graph, T x, T y){
        if (graph == null || x == null || y == null){
            return Collections.emptySet();
        }

        if (!graph.containsNode(x) || !graph.containsNode(y)){
            return Collections.emptySet();
        }

        Set<T> reachableFromX = reachableFromNode(graph, x);
        Set<T> reachableFromY = reachableFromNode(graph, y);

        Set<T> retainNodes = new HashSet<>(reachableFromX);
        retainNodes.retainAll(reachableFromY);

        return retainNodes;
    }

    private static <T> Set<T> reachableFromNode(Graph<T> graph, T startNode) {
        Set<T> visitedNodes = new HashSet<>();
        Queue<T> allNodes = new LinkedList<>();

        visitedNodes.add(startNode);
        allNodes.add(startNode);

        while (!allNodes.isEmpty()){
            T current = allNodes.poll();
            for (T neighbour : graph.getNeighbours(current)) {
                if (!visitedNodes.contains(neighbour)){
                    visitedNodes.add(neighbour);
                    allNodes.add(neighbour);
                }
            }
        }

        return visitedNodes;
    }
}
