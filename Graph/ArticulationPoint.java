package Graph;

import java.util.ArrayList;

public class ArticulationPoint {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));

    }

    public static void getAP(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];
        int time = 0;

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, time, vis, dt, low, ap);
            }
        }

        for (int i = 0; i < ap.length; i++) {
            if (ap[i]) {
                System.out.println("AP: " + i);
            }
        }
    }

    private static void dfs(ArrayList<Edge>[] graph, int curr, int par, int time, boolean[] vis, int[] dt, int[] low,
            boolean[] ap) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neighbors = e.dest;
            if (par == neighbors) {
                continue;
            } else if (vis[neighbors]) {
                low[curr] = Math.min(low[curr], dt[neighbors]);
            } else {
                dfs(graph, neighbors, curr, time, vis, dt, low, ap);
                low[curr] = Math.min(low[curr], low[neighbors]);
                if (par != -1 && dt[curr] <= low[neighbors]) {
                    ap[curr] = true;
                }
                children++;
            }
        }

        if (par == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        getAP(graph, V);
    }
}
