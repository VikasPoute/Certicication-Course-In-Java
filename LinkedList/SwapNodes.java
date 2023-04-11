package LinkedList;

public class SwapNodes {

    static class Node {
        int data;
        Node next;

    }

    static Node push(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = (head);
        (head) = newNode;
        return head;
    }

    public static void print(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void swapNodes(Node head, int x, int y) {

        if (head == null || x == y) {
            return;
        }

        // searching first node
        Node prvNode = null;
        Node prv = head;
        while (prv != null && prv.data != x) {
            prvNode = prv;
            prv = prv.next;
        }

        // searching last node
        Node nextNode = null;
        Node next = head;

        while (next != null && next.data != y) {
            nextNode = next;
            next = next.next;
        }

        if (prvNode != null) {
            prvNode.next = next;
        } // else {
          // head = next;
          // }
        if (nextNode != null) {
            nextNode.next = prv;
        }

        // swapping the node

        Node temNode = prv.next;
        prv.next = next.next;
        next.next = temNode;
    }

    public static void swap(Node head, int x, int y) { // by values

        Node first = head;
        while (first != null) {
            if (first.data == x) {
                break;
            }
            first = first.next;
        }

        Node last = head;
        while (last != null) {
            if (last.data == y) {
                break;
            }
            last = last.next;
        }

        int temp = first.data;
        first.data = last.data;
        last.data = temp;

    }

    public static void main(String[] args) {
        Node head = null;
        int M = 2, N = 4;
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);

        print(head);

        // swap(head, M, N);
        // print(head);

        swapNodes(head, M, N);
        print(head);
    }

}
