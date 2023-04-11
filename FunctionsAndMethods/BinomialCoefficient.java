package FunctionsAndMethods;

public class BinomialCoefficient {

    public static int binoCoef(int n, int r) {
        int ans = (FactorialOf(n)) / (FactorialOf(r) * FactorialOf(n - r));

        return ans;
    }

    public static int FactorialOf(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        int res = binoCoef(n, r);
        System.out.println(res);
    }
}
