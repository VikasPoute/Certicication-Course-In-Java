package Que;

import java.util.Stack;

public class Que2Stacks {
    static class Que {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return s1.peek();
        }

        public int pop() {
            if (s1.isEmpty()) {
                return -1;
            }

            return s1.pop();
        }
    }

    public static void main(String[] args) {

        Que q = new Que();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.pop() + " ");
        }
    }
}
