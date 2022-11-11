package me.algorithm.week7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ThreeSumTest {

    private ThreeSum threeSum;

    @BeforeEach
    void setUp() {
        threeSum = new ThreeSum();
    }

    @Test
    void 중복_존재() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum.threeSum(nums);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));

        assertThat(result).containsExactlyElementsOf(expected);
    }

    @Test
    void 존재하는_배열없음() {
        int[] nums = new int[]{0, 1, 1};
        List<List<Integer>> result = threeSum.threeSum(nums);

        List<List<Integer>> expected = new ArrayList<>();

        assertThat(result).containsExactlyElementsOf(expected);
    }

    @Test
    void 동일한_세가지_요소() {
        int[] nums = new int[]{0, 0, 0};
        List<List<Integer>> result = threeSum.threeSum(nums);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0));

        assertThat(result).containsExactlyElementsOf(expected);
    }
}
