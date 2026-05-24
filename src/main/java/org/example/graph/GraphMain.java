package org.example.graph;

import java.util.Set;

public class GraphMain {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.addEdge("L", "M");

        /**
         * из A: [A, B, C, D]
         * из C: [C, D]
         * retain: [C, D]
         */
        Set<String> result = GraphSearch.commonReachableNodes(graph, "A", "C");
        System.out.println(result);
    }
}
