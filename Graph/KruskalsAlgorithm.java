package Graph;

import java.util.ArrayList;

public class KruskalsAlgorithm {

    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge o) {
            // TODO Auto-generated method stub
            return this.wt - o.wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph) {

        graph.add(new Edge(0, 1, 10));
        graph.add(new Edge(0, 2, 15));
        graph.add(new Edge(0, 3, 30));
        graph.add(new Edge(1, 3, 40));
        graph.add(new Edge(2, 3, 50));
    }

    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    static void init() {
        for (int i = 0; i < par.length; i++) {
            par[i] = i;
        }
    }

    static int find(int x) {
        if (x == par[x]) {
            return x;
        }

        return par[x] = find(par[x]);
    }

    static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static int kruskalsMST(ArrayList<Edge> edges, int V) {
        init();
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < V - 1; i++) {
            Edge e = edges.get(i);

            if (find(e.src) != find(e.dest)) {
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }

        System.out.println(mstCost);
        return mstCost;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskalsMST(edges, V);
    }
}
