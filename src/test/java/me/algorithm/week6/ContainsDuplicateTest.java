package me.algorithm.week6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainsDuplicateTest {
    @Test
    void 배열중_중복되는_요소_하나_존재() {
        int[] nums = new int[]{1, 2, 3, 1};
        boolean result = ContainsDuplicate.containsDuplicate(nums);

        assertThat(result).isTrue();
    }

    @Test
    void 배열중_중복되는_요소가_없음() {
        int[] nums = new int[]{1, 2, 3, 4};
        boolean result = ContainsDuplicate.containsDuplicate(nums);

        assertThat(result).isFalse();
    }

    @Test
    void 배열중_다중_중복되는_요소_존재() {
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result = ContainsDuplicate.containsDuplicate(nums);

        assertThat(result).isTrue();
    }

    @Test
    void 배열중_음수가_포함된_중복요소_존재() {
        int[] nums = new int[]{-1, 5, -1, 0};
        boolean result = ContainsDuplicate.containsDuplicate(nums);

        assertThat(result).isTrue();
    }
}
