package Que;

public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Que {
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }

            int res = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return res;
        }

        public static int peek() {
            if (isEmpty()) {
                return Integer.MAX_VALUE;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Que.add(1);
        Que.add(2);
        Que.add(3);

        while (!Que.isEmpty()) {
            System.out.print(Que.remove() + " ");
        }
    }

}
