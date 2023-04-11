package Heaps;

import java.util.PriorityQueue;

public class NearestCar {
    public static class Point implements Comparable<Point> {
        int x;
        int y;
        int disSq;
        int idx;

        Point(int x, int y, int disSq, int idx) {
            this.x = x;
            this.y = y;
            this.disSq = disSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point o) {
            return this.disSq - o.disSq;
        }
    }

    public static void main(String[] args) {

        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] + pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().idx);
        }
    }
}
