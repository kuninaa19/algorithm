package me.algorithm.week9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeIntervalsTest {

    private MergeIntervals mergeIntervals;

    @BeforeEach
    void setUp() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    void 배열_겹침() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {9, 18}};
        int[][] expected = {{1, 6}, {8, 18}};
        assertThat(mergeIntervals.merge(intervals)).isEqualTo(expected);
    }

    @Test
    void 배열_인덱스_0_순서_무작위() {
        int[][] intervals = {{1, 3}, {2, 6}, {10, 12}, {8, 18}};
        int[][] expected = {{1, 6}, {8, 18}};
        assertThat(mergeIntervals.merge(intervals)).isEqualTo(expected);
    }

    @Test
    void 단일_겹침() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        assertThat(mergeIntervals.merge(intervals)).isEqualTo(expected);
    }

    @Test
    void 단일_안겹침() {
        int[][] intervals = {{1, 3}};
        int[][] expected = {{1, 3}};
        assertThat(mergeIntervals.merge(intervals)).isEqualTo(expected);
    }

    @Test
    void 다중_안겹침() {
        int[][] intervals = {{1, 3}, {4, 6}, {7, 10}};
        int[][] expected = {{1, 3}, {4, 6}, {7, 10}};
        assertThat(mergeIntervals.merge(intervals)).isEqualTo(expected);
    }
}
