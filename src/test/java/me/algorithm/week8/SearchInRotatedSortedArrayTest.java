package me.algorithm.week8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchInRotatedSortedArrayTest {
    @Test
    void 피봇기준_왼쪽_타겟값() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;

        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        assertThat(searchInRotatedSortedArray.search(nums, target)).isEqualTo(3);
    }

    @Test
    void 피봇기준_오른쪽_타겟값() {
        int[] nums = {5, 7, 0, 1, 2, 4};
        int target = 2;

        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        assertThat(searchInRotatedSortedArray.search(nums, target)).isEqualTo(4);
    }

    @Test
    void 존재하지않는_타겟값() {
        int[] nums = {5, 7, 9, 12, 15, 17, 0, 1, 2, 4};
        int target = 3;

        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        assertThat(searchInRotatedSortedArray.search(nums, target)).isEqualTo(-1);
    }

    @Test
    void 피봇기준_가장_좌측_타겟값() {
        int[] nums = {15, 17, 0, 1, 2, 4, 5, 7, 9, 12};
        int target = 15;

        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        assertThat(searchInRotatedSortedArray.search(nums, target)).isEqualTo(0);
    }

    @Test
    void 피봇기준_가장_우측_타겟값() {
        /* 0 1 2 4 5 7 9 12 15 17  pivot idx 8 */
        int[] nums = {15, 17, 0, 1, 2, 4, 5, 7, 9, 12};
        int target = 12;

        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        assertThat(searchInRotatedSortedArray.search(nums, target)).isEqualTo(9);
    }

    @Test
    void 단일_데이터_존재하지않는_타겟값() {
        int[] nums = {1};
        int target = 0;

        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        assertThat(searchInRotatedSortedArray.search(nums, target)).isEqualTo(-1);
    }

    @Test
    void 단일_데이터_존재하는_타겟값() {
        int[] nums = {1};
        int target = 1;

        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        assertThat(searchInRotatedSortedArray.search(nums, target)).isEqualTo(0);
    }

    @Test
    void 순회없는_데이터() {
        int[] nums = {1,3};
        int target = 39;

        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        assertThat(searchInRotatedSortedArray.search(nums, target)).isEqualTo(-1);
    }
}
