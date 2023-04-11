package MyStack;

import java.util.ArrayList;

public class UsingArrayList {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        // checking the list is empty or not
        public static boolean isEmpty() {

            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int val = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return val;
        }

        // peek
        public int peek() {
            return list.get(list.size() - 1);
        }

        // print
        public void print() {
            while (!isEmpty()) {
                System.out.println(pop());
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
        // System.out.println(stack.peek());
        System.out.println(stack.pop() + " ->");
        stack.print();
    }
}
