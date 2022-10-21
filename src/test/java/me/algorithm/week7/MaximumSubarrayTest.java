package me.algorithm.week7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @BeforeEach
    void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    void 배열중_가운데_2개의_요소가_최대합() {
        int[] nums = new int[]{-2, 1, 4, -3};
        int result = maximumSubarray.maxSubArray(nums);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void 배열중_마지막_요소가_최대합() {
        int[] nums = new int[]{-2, -2, 4};
        int result = maximumSubarray.maxSubArray(nums);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void 배열중_첫번째_요소가_최대합() {
        int[] nums = new int[]{3, -2, 2};
        int result = maximumSubarray.maxSubArray(nums);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void 단일요소가_최대합() {
        int[] nums = new int[]{1};
        int result = maximumSubarray.maxSubArray(nums);

        assertThat(result).isEqualTo(1);
    }
}
