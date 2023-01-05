package me.algorithm.week8;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] sum = new int[amount + 1];
        Arrays.fill(sum, -1);
        sum[0] = 0;

        for (int i = 0; i < amount + 1; i++) {
            for (int coin : coins) {
                int remain = i - coin;

                if (remain < 0) {
                    continue;
                }

                if (sum[remain] == -1) {
                    continue;
                }

                if (sum[i] == -1) {
                    sum[i] = sum[remain] + 1;
                    continue;
                }

                sum[i] = Math.min(sum[i], sum[remain] + 1);
            }
        }

        return sum[amount];
    }
}
