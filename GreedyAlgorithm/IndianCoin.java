package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };

        int countOfCoins = 0;
        int amount = 2000;
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(coins, Comparator.reverseOrder());

        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                while (amount >= coins[i]) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println(countOfCoins);
        System.out.println(ans);
    }
}
