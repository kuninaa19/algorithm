package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    @Test
    @DisplayName("배열이 2개이고 배열의 합이 타겟값과 동일")
    void testLengthTwo() {
        int[] nums = new int[]{2, 1};
        int target = 3;
        int[] expected = new int[]{0, 1};
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("배열이 5개이고 배열의 합이 타겟값과 동일")
    void testLengthFive() {
        int[] nums = new int[]{2, 4, 1, 5, 9};
        int target = 9;
        int[] expected = new int[]{1, 3};
        int[] result = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
}
