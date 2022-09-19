package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {
    @Test
    @DisplayName("배열에 존재하는 타겟값")
    void testExistTargetInArray() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 3;

        int result = BinarySearch.search(nums, target);

        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("홀수개 배열")
    void testOddArray() {
        int[] nums = new int[]{-1, 0, 3, 5, 9};
        int target = 9;

        int result = BinarySearch.search(nums, target);

        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("배열에 존재하지않는 타겟값")
    void testNotExistTargetInArray() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 13;

        int result = BinarySearch.search(nums, target);

        assertThat(result).isEqualTo(-1);
    }
}
