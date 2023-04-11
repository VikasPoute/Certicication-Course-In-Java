package Recursion;

public class IncreasingOrder {
    public static void increasingOrder(int n) {
        if (n == 0) {
            return;
        }

        increasingOrder(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        increasingOrder(10);
    }
}
