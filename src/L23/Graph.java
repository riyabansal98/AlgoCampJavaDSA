package L23;

import  java.util.*;
public class Graph {

        private int v;
        private LinkedList<Integer>[] adj;

        public Graph(int v) {
            this.v = v;
            adj = new LinkedList[v];

            for(int i = 0; i < v; i++) {
                adj[i]  = new LinkedList<>();
            }
        }

    public void addEdge(int u, int v, boolean bidir) {

        adj[u].add(v);
        if(bidir) {
            adj[v].add(u);
        }
    }

    public void printAdjList() {

        for(int i = 0; i < v; i++) {

            System.out.print(i + "->");
            for(int node: adj[i]) {
                System.out.print(node + ", ");
            }
            System.out.println();
        }

    }

    public void dfs(int src) {
        Map<Integer, Boolean> visited = new HashMap<>();
        dfsHelper(src, visited);
    }

    private void dfsHelper(int src, Map<Integer, Boolean> visited) {
        visited.put(src, true);
        // System.out.print(src + " ");
        for(int neighbour: adj[src]) {
            if(!visited.containsKey(neighbour)) {
                dfsHelper(neighbour, visited);
            }
        }
    }

    public void bfs(int src) {

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v + 1];

        q.add(src);
        visited[src] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node + " ");
            for(int neighbour: adj[node]) {
                if(!visited[neighbour]) {
                    q.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }

    public void shortestPath(int src, int dest) {

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v + 1];
        int[] dist = new int[v + 1];
        int[] parent = new int[v + 1];

        Arrays.fill(parent, -1);

        q.add(src);
        visited[src] = true;

        while(!q.isEmpty()){
            int node = q.poll();

            for(int neighbour: adj[node]) {
                if(!visited[neighbour]) {
                    q.add(neighbour);
                    visited[neighbour] = true;
                    dist[neighbour] = dist[node] + 1;
                    parent[neighbour] = node;
                }
            }
        }

        System.out.println("Shortest dist is" + dist[dest]);
    }

    public int connectedComponents() {

        Map<Integer, Boolean> visited = new HashMap<>();
        int components = 0;

        for(int i = 0; i < v; i++) {
            if(!visited.containsKey(i)) {
                dfsHelper(i, visited);
                components++;
            }
        }

        return components;
    }

    public boolean isBipartite() {

        //this array will store the color assigned for every node in the graph

        int[] colors = new int[v];

        Arrays.fill(colors, -1); //initialize all vertices with no color.

        for(int i = 0;  i < v; i++) {
            if(colors[i] == -1) {
                if(!bipartiteBFS(i, colors)) {
                    return false;  //If BFS on this component is not bipatite, return false;
                }
            }
        }
        return true; //if BFS on all components is bipartite, return true
    }

    private boolean bipartiteBFS(int src, int[] colors) {

        //Two colors -> 0 and 1
        Queue<Integer> q = new LinkedList<>();
        colors[src] = 0;

        q.add(src);

        while(!q.isEmpty()){
            int node = q.poll();
            for(int neighbour: adj[node]) {
                if(colors[neighbour] == -1) {
                    q.add(neighbour);
                    //if the neighbour has not been coloured, assign the opposite color
                    colors[neighbour] = 1 - colors[node];
                }else if(colors[neighbour] == colors[node]) {

                    //if the neighbour has the same color as the current node,
                    //then the graph is not bipartite
                    return false;
                }
            }
        }

        //if the bfs traversal of this component is bipartite, then return true;
        return true;
    }

    //M Edges
    //N Nodes
    //Kahn -> O(M + N)
    //Space -> O(N)
    public List<Integer> topologicalSort() {

        List<Integer> result = new ArrayList<>();

        int[] inDegree = new int[v];

        //O(M)
        //calculating in-degree for all vertices
        for(int  i =0; i < v; i++) {

            for(int neighbour: adj[i]) {
                inDegree[neighbour]++;
            }
        }

        //O(N)
        //Create a queue to store vertices with in-degree 0
        Queue<Integer> queue = new LinkedList<>();
        for(int  i = 0; i < v; i++) {
            if(inDegree[i] == 0) {
                queue.add(i);
            }
        }

        //O(N)
        while(!queue.isEmpty()) {

            int node = queue.poll();
            result.add(node);

            for(int neighbor: adj[node]) {
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0){
                    queue.add(neighbor);
                }
            }
        }

        if(result.size() != v) {
            //Graph is a cycle, topological sorting is not possible
            return new ArrayList<>();
        }

        return result;
    }



    public static void main(String[] args) {

        Graph g = new Graph(8);
        g.addEdge(0,1 , true);
        g.addEdge(1,3 , true);
        g.addEdge(1,2 , true);
        // g.addEdge(0,2 , true);
        g.addEdge(4, 5, true);
        g.addEdge(6, 7, true);

        System.out.println(g.isBipartite());
    }
}
