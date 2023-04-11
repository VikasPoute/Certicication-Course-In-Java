package DynamicProgramming;

public class MinimumPartition {

    public static int minPartition(int[] arr) {
        int N = arr.length;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int W = sum / 2;
        int[][] dp = new int[N + 1][W + 1];

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int sum1 = dp[N][W];
        int sum2 = sum - sum1;

        return Math.abs(sum2 - sum1);
        // TODO this statement is for sum is 0
        // return sum2 == sum1 ? 0 : 1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 6, 11, 5 };
        // System.out.println(minPartition(arr));

        int arr2[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
        System.out.println(arr2[(arr2.length / 2)]);
    }

}
