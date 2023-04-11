package DynamicProgramming;

public class RodCutting {

    private static int rodCutting(int[] length, int[] price, int rodLength) {
        int dp[][] = new int[price.length + 1][rodLength + 1];

        for (int i = 1; i < price.length + 1; i++) {
            for (int j = 1; j < rodLength + 1; j++) {
                if (j >= length[i - 1]) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[price.length][rodLength];
    }

    public static void main(String[] args) {

        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int rodLength = 8;

        System.out.println(rodCutting(length, price, rodLength));
    }

}
