package me.algorithm.week9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CombinationSumTest {

    private CombinationSum combinationSum;

    @BeforeEach
    void setUp() {
        combinationSum = new CombinationSum();
    }

    @Test
    void 중복포함_단일_요소_값_동일() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(7));
        assertThat(combinationSum.combinationSum(candidates, target)).isEqualTo(expected);
    }

    @Test
    void 중복되는_값_조합() {
        int[] candidates = {2, 3, 5};
        int target = 8;

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 2, 2), Arrays.asList(2, 3, 3), Arrays.asList(3, 5));
        assertThat(combinationSum.combinationSum(candidates, target)).isEqualTo(expected);
    }

    @Test
    void 출력값_없음() {
        int[] candidates = {2};
        int target = 1;

        List<List<Integer>> expected = List.of();
        assertThat(combinationSum.combinationSum(candidates, target)).isEqualTo(expected);
    }
}
