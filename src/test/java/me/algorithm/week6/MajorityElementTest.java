package me.algorithm.week6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MajorityElementTest {
    @Test
    void 절반이상_차지하는_하나의_값() {
        int[] nums = new int[]{1, 2, 1, 1, 2, 1};
        int result = MajorityElement.majorityElement(nums);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void 값이_하나뿐인_배열() {
        int[] nums = new int[]{3};
        int result = MajorityElement.majorityElement(nums);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void 최대값이_주어졌을때() {
        int[] nums = new int[]{50000, 50000, 3};
        int result = MajorityElement.majorityElement(nums);

        assertThat(result).isEqualTo(50000);
    }

    @Test
    void 음수값_포함() {
        int[] nums = new int[]{-10, 0, 5, 0, 0};
        int result = MajorityElement.majorityElement(nums);

        assertThat(result).isEqualTo(0);
    }
}
