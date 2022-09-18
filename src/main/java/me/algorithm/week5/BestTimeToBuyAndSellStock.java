package me.algorithm.week5;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);

            int sell = prices[i] - buy;
            result = Math.max(result, sell);
        }
        return result;
    }
}
