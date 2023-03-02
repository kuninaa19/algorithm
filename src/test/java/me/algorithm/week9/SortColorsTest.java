package me.algorithm.week9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortColorsTest {

    private SortColors sortColors;

    @BeforeEach
    void setUp() {
        sortColors = new SortColors();
    }

    @Test
    void 중복_컬러() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors.sortColors(nums);
        assertThat(nums).isEqualTo(new int[]{0, 0, 1, 1, 2, 2});
    }

    @Test
    void 단일_컬러() {
        int[] nums = {2};
        sortColors.sortColors(nums);
        assertThat(nums).isEqualTo(new int[]{2});
    }

    @Test
    void 두개_컬러() {
        int[] nums = {2, 1};
        sortColors.sortColors(nums);
        assertThat(nums).isEqualTo(new int[]{1, 2});

    }
}
