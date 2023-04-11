package DynamicProgramming;

public class WildCardMatching {

    static boolean isMatch(String str, String pattern) {
        int n = str.length();
        int m = pattern.length();

        boolean dp[][] = new boolean[n + 1][m + 1];
        dp[0][0] = true;

        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }

        for (int i = 1; i < m + 1; i++) {
            if (pattern.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i - 1];
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (pattern.charAt(j - 1) == '?' || str.charAt(i - 1) == pattern.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        System.out.println(dp[n][m]);
        return dp[n][m];

    }

    public static void main(String[] args) {
        String str = "abc";
        String pat = "**bad";
        isMatch(str, pat);
    }
}
