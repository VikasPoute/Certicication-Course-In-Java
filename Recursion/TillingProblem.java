package Recursion;

public class TillingProblem {
    public static int noOfWays(int n) {
        // Base case
        if (n == 0 || n == 1)
            return 1;

        return noOfWays(n - 1) + noOfWays(n - 2); // vertical + horizontal
    }

    public static void main(String[] args) {
        System.out.println(noOfWays(4));
    }
}
