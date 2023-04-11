package DynamicProgramming;

public class ZeroOneKnapsackRecursion {
    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        int ans = knapsack(val, wt, W, val.length);
        System.out.println(ans);
    }

    private static int knapsack(int[] val, int[] wt, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (w >= wt[n - 1]) {
            // including the value
            int ans1 = val[n - 1] + knapsack(val, wt, w - wt[n - 1], n - 1);
            // Excluding Value
            int ans2 = knapsack(val, wt, w, n - 1);

            return Math.max(ans1, ans2);
        } else {
            return knapsack(val, wt, w, n - 1);
        }
    }
}
