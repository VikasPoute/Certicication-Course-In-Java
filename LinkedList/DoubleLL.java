package LinkedList;

public class DoubleLL {

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // adding first into the dll
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // removing the first element
    public int removeFirst() {

        if (size == 0) {
            print();
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // add last in dll
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // remove last form dll
    public int removeLast() {

        if (size == 0) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;

        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // revrse the ll
    public void reverse() {

        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // print the dll
    public void print() {

        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " <-> ");
            tempNode = tempNode.next;
        }

        System.err.println("null");
    }

    public static void main(String[] args) {

        DoubleLL dll = new DoubleLL();

        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.removeFirst());
        dll.addLast(6);
        // dll.print();
        // System.out.println(dll.removeLast());
        // dll.print();

        dll.reverse();
        dll.print();

    }
}
