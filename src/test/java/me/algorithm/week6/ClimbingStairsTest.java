package me.algorithm.week6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


public class ClimbingStairsTest {
    @ParameterizedTest
    @DisplayName("DP : 위치와 관계없이 모든 경로를 탐색한다")
    @CsvSource(value = {"1:1", "3:3", "4:5", "5:8", "10:89"}, delimiter = ':')
    void N의_값이_주어졌을때_움직임_예상값(int n, int expected) {
        int result = ClimbingStairs.climbStairs(n);

        assertThat(result).isEqualTo(expected);
    }
}
