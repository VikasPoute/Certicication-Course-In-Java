package MyStack;

public class UsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {

        static Node head = null;

        // isempty
        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // pop
        public int pop() {
            if (head == null) {
                return -1;
            }

            int val = head.data;
            head = head.next;
            return val;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }

        // print
        public void print() {
            if (isEmpty()) {
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // stack.print();
        // stack.pop();
        // stack.print();
    }
}
