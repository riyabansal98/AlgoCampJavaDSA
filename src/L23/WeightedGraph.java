package L23;

import java.util.*;
public class WeightedGraph {

    class Edge {
        int dest;
        int weight;

        public Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    private int V;
    private List<Edge>[] adj;

    public WeightedGraph(int V) {
        this.V = V;
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int src, int dest, int weight) {
        Edge edge = new Edge(dest, weight);
        adj[src].add(edge);
        // For an undirected graph, you can add the reverse edge as well.
        // Edge reverseEdge = new Edge(src, weight);
        // adj[dest].add(reverseEdge);
    }

}
