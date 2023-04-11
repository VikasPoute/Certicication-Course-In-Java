package MyStack;

import java.util.Stack;

public class PalindromicLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // public static Node head = null;

    public static boolean isTrue(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node temp = head;
        boolean isTrue = true;
        Stack<Integer> s = new Stack<>();

        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        while (head != null) {
            int i = s.pop();
            if (head.data == i) {
                isTrue = true;
            } else {
                isTrue = false;
            }

            head = head.next;
        }

        return isTrue;
    }

    public static void main(String[] args) {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        System.out.println(isTrue(one));
    }
}
