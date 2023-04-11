package Recursion;

public class PowerOf {

    public static int optimized(int x, int n) {
        if (n == 0)
            return 1;

        int halfSqr = optimized(x, n / 2);
        int sqr = halfSqr * halfSqr;

        if (n % 2 != 0)
            sqr = x * sqr;

        return sqr;
    }

    public static int powOfX(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * powOfX(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(powOfX(2, 3));
        System.out.println(optimized(4, 4));
    }
}
