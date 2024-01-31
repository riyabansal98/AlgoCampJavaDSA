package L23;

import java.util.*;


public class DijkstraAlgorithm {
    public static void main(String[] args) {

        //graph representation
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        graph.put("A", Map.of("B", 1, "C", 4));
        graph.put("B", Map.of("A", 1, "C", 2, "D", 5));
        graph.put("C", Map.of("A", 4, "B", 2, "D", 1));
        graph.put("D", Map.of("B", 5, "C", 1));

        String startVertex = "A";
        Map<String, Integer> result = dijkstra(graph, startVertex);

        System.out.println("Shortest distances from " + startVertex + ": " + result);
    }

    public static Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graph, String start) {

        Map<String, Integer> distances  = new HashMap<>();

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));

        for(String vertex: graph.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }

        distances.put(start, 0);

        priorityQueue.add(new Node(start, 0));

        while(!priorityQueue.isEmpty()) {

            Node current = priorityQueue.poll();

            //checking neighbours of current node
            for(Map.Entry<String, Integer> neighbourEntry: graph.get(current.vertex).entrySet()) {
                String neighbour = neighbourEntry.getKey(); // C
                int weight = neighbourEntry.getValue(); // 4

                int newDistance = current.distance + weight; // 0 + 4
                if(newDistance < distances.get(neighbour)) {
                    distances.put(neighbour, newDistance);
                    priorityQueue.add(new Node(neighbour, newDistance));
                }
            }
        }
        return distances;
    }

    static class Node {
        String vertex;
        int distance;

        Node(String vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }

}