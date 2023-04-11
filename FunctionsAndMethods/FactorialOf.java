package FunctionsAndMethods;

public class FactorialOf {
    public static int calFact(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = calFact(n);
        System.out.println(ans);
    }
}
