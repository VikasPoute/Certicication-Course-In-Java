package Que;

/**
 * QueueImplementation
 */
public class QueueImplementation {

    static class myQueue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        myQueue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }

            int res = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return res;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return arr[front];
        }

    }

    public static void main(String[] args) {
        new myQueue(3);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        System.out.print(myQueue.remove());
        myQueue.add(4);
        System.out.println(myQueue.remove());
        myQueue.add(5);

        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.peek());
            myQueue.remove();
        }
    }
}