package DynamicProgramming;

import java.util.Arrays;

public class CatalanNumber {

    static int catalan(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += catalan(i) * catalan(n - i - 1);
        }

        return ans;
    }

    static int memoCatalan(int n, int dp[]) {
        if (n == 1 || n == 0) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += memoCatalan(i, dp) * memoCatalan(n - i - 1, dp);
        }

        return dp[n] = ans;
    }

    static int catalanTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            // Ci
            for (int j = 0; j < i; j++) {
                // Ci = Cj * Ci - j - 1
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 1000;
        // System.out.println(catalan(n));

        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(memoCatalan(n, dp));
        System.out.println(catalanTab(n));
    }
}
