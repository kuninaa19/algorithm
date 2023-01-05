package me.algorithm.week8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoinChangeTest {
    @Test
    void 예제_테스트() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 11;

        assertThat(coinChange.coinChange(coins, amount)).isEqualTo(3);
    }

    @Test
    void 일치하는_코인이_없음() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {2};
        int amount = 3;

        assertThat(coinChange.coinChange(coins, amount)).isEqualTo(-1);
    }

    @Test
    void 맞는요소_없음() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1};
        int amount = 0;

        assertThat(coinChange.coinChange(coins, amount)).isEqualTo(0);
    }

    @Test
    void 다양한_코인_사용() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {2,5,10,1};
        int amount = 27;

        assertThat(coinChange.coinChange(coins, amount)).isEqualTo(4);
    }

}
