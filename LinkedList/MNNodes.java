package LinkedList;

// Delete N Nodes After M Nodes of a Linked Lis
/*
 * We have a linkedlist and two integers M and N.
 * Traverse the linkedlist such that you retain M nodes then delete next N nodes,continue the same till end of the linkedlist.
 */

public class MNNodes {
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

    public static void deleteNNode(Node head, int N, int M) {

        Node curr = head, next;
        int count;

        while (curr != null) {
            for (count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }

            if (curr == null) {
                return;
            }

            next = curr.next;
            for (count = 1; count <= N && next != null; count++) {
                // Node prv = next;
                next = next.next;
            }

            curr.next = next;
            curr = next;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        int M = 2, N = 3;
        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        System.out.println("M = " + M + ", " + "N = " + N + " ");
        System.out.println("Linked list we have is: ");
        print(head);

        deleteNNode(head, N, M);
        print(head);
    }
}
