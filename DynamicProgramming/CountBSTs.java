package DynamicProgramming;

public class CountBSTs {

    static int countingBST(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            // Ci -> BST (i nodes) -> dp[i]
            for (int j = 0; j < i; j++) {
                // Ci = Cj * Ci - j - 1
                int left = dp[j];
                int right = dp[i - j - 1];
                dp[i] += left * right;
                // dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(countingBST(4));
    }
}
