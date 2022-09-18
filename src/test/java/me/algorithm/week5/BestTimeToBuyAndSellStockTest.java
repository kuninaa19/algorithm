package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BestTimeToBuyAndSellStockTest {
    @Test
    @DisplayName("임의의 값")
    void testExample1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int profit = BestTimeToBuyAndSellStock.maxProfit(prices);
        int expected = 5;

        assertThat(profit).isEqualTo(expected);
    }

    @Test
    @DisplayName("예상수익 없음")
    void testPricesDesc() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int profit = BestTimeToBuyAndSellStock.maxProfit(prices);
        int expected = 0;

        assertThat(profit).isEqualTo(expected);
    }

    @Test
    @DisplayName("값 하나만 제공")
    void testJustOnePriceData() {
        int[] prices = new int[]{1};
        int profit = BestTimeToBuyAndSellStock.maxProfit(prices);
        int expected = 0;

        assertThat(profit).isEqualTo(expected);
    }

}
