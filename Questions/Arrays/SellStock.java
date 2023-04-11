package Questions.Arrays;

public class SellStock {
    public static int buyAndSell(int prices[]) {

        int maxProfit = 0;
        int buySell = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buySell < prices[i]) {
                int profit = prices[i] - buySell;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buySell = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int ans = buyAndSell(prices);
        System.out.println(ans);
    }
}
