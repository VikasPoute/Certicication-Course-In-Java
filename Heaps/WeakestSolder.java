package Heaps;

import java.util.PriorityQueue;

public class WeakestSolder {

    public static class Row implements Comparable<Row> {
        int solder;
        int idx;

        Row(int solder, int idx) {
            this.idx = idx;
            this.solder = solder;
        }

        @Override
        public int compareTo(Row o) {
            if (this.solder == o.solder) {
                return this.idx - o.idx;
            } else {
                return this.solder - o.solder;
            }
        }

    }

    public static void main(String[] args) {
        int army[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };

        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }

            pq.add(new Row(count, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().idx);
        }
    }
}
