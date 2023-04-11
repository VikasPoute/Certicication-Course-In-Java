package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void calcGetInDegree(ArrayList<Edge> graph[], int inDegree[]) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                inDegree[e.dest]++;
            }
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph, int vertex[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < vertex.length; i++) {
            graph[i].add(new Edge(vertex[i][0], vertex[i][1]));
        }
    }

    @SuppressWarnings("unchecked")

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int inDegree[] = new int[numCourses];
        ArrayList<Edge> graph[] = new ArrayList[numCourses];
        createGraph(graph, prerequisites);
        calcGetInDegree(graph, inDegree);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        int[] ans = new int[numCourses];
        int idx = 1;

        while (!q.isEmpty()) {
            int curr = q.remove();
            ans[idx++] = curr;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;
                if (inDegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        // System.out.println(idx);
        if (idx != numCourses) {
            return new int[0];
        } else {
            return ans;
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 0 }, { 2, 0 }, { 3, 1 }, { 3, 2 } };

        int ans[] = findOrder(4, arr);

        // System.out.println(ans.length);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
