package DynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;

public class LongestIncreasingSubsequence {

    static int lcs(int arr1[], int arr2[]) {

        int dp[][] = new int[arr1.length + 1][arr2.length + 1];
        // This is already initialized with 0

        for (int i = 1; i < arr1.length + 1; i++) {
            for (int j = 1; j < arr2.length + 1; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return dp[arr1.length][arr2.length];
    }

    static int lis(int arr1[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        int arr2[] = new int[set.size()];
        int idx = 0;
        for (Integer num : set) {
            arr2[idx++] = num;
        }

        Arrays.sort(arr2);

        return lcs(arr1, arr2);
    }

    public static void main(String[] args) {

        int arr[] = { 50, 3, 10, 7, 40, 80 };
        System.out.println(lis(arr));

    }
}
