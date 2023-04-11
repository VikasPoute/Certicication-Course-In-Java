package Heaps;

import java.util.ArrayList;

public class Listheap {
    static class Heap {
        static ArrayList<Integer> list = new ArrayList<>();

        public void add(int data) {
            // Add to last
            list.add(data);

            // x is child index
            int x = list.size() - 1;

            // x -> parent
            int par = (x - 1) / 2;

            // checking
            while (list.get(x) < list.get(par)) {
                int temp = list.get(x);
                list.set(x, list.get(par));
                list.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return list.get(0);
        }

        private static void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < list.size() && list.get(left) < list.get(minIdx)) {
                minIdx = left;
            }

            if (right < list.size() && list.get(right) < list.get(minIdx)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = list.get(i);
                list.set(i, list.get(minIdx));
                list.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = list.get(0);

            // step first -> swap first and last
            int temp = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.set(list.size() - 1, temp);

            // step 2 -> remove last child
            list.remove(list.size() - 1);

            // Step 3 -> fix the heap
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }
    }

    public static void main(String[] args) {

        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }

}
