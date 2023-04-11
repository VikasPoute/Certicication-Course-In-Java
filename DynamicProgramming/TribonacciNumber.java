package DynamicProgramming;

public class TribonacciNumber {

    static void allTribonacciNumber(int n) {
        int dp[] = new int[n];
        dp[0] = dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // for (int i = 0; i < dp.length; i++) {
        //     System.out.println(dp[i] + " ");
        // }

        System.out.println(dp[n - 1]);
    }

    public static void main(String[] args) {
        int n = 20;
        allTribonacciNumber(n);
    }
}
