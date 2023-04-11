package DynamicProgramming;

import java.util.Arrays;

public class CountTheNoOfStairs {

    // Recursion Memoisation technique
    // TC O(N)
    static int countRecursionUtil(int dp[], int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = countRecursionUtil(dp, n - 1) + countRecursionUtil(dp, n - 2);
        return dp[n];
    }

    static int countRecursionMemo(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return countRecursionUtil(dp, n);
    }

    // Tabulation Technique
    // TC O(N)
    public static int countWaysTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    // Simple Recursion -> TC O(2^N)
    static int countRecursion(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return countRecursion(n - 1) + countRecursion(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Simple Recursion Answer: " + countRecursion(n));
        System.out.println("This is Recursion Memoisation Answer: " + countRecursionMemo(n));
        System.out.println("This is Tabulation Answer: " + countWaysTab(n));
    }
}
