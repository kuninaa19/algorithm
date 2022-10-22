package me.algorithm.week7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertIntervalTest {

    private InsertInterval insertInterval;

    @BeforeEach
    void setUp() {
        insertInterval = new InsertInterval();
    }

    @Test
    void 중간에_겹치는_값이_존재() {
        int[][] intervals = {{1, 3}, {4, 5}, {6, 9}};
        int[] newInterval = {2, 7};
        int[][] result = insertInterval.insert(intervals, newInterval);

        int[][] expected = {{1, 9}};

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 중간에_겹치는_값이_다중으로_존재() {

        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] result = insertInterval.insert(intervals, newInterval);

        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 중간중간_겹치지않는_값_존재() {
        int[][] intervals = {{2, 5}, {6, 7}, {8, 9}};
        int[] newInterval = {0, 1};

        int[][] result = insertInterval.insert(intervals, newInterval);

        int[][] expected = {{0, 1}, {2, 5}, {6, 7}, {8, 9}};

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void newInterval_배열만_존재() {

        int[][] intervals = {};
        int[] newInterval = {4, 8};
        int[][] result = insertInterval.insert(intervals, newInterval);

        int[][] expected = {{4, 8}};

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void intervals_배열_하나만_존재() {

        int[][] intervals = {{1, 5}};
        int[] newInterval = {2, 7};

        int[][] result = insertInterval.insert(intervals, newInterval);

        int[][] expected = {{1, 7}};

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void start의_값이_동일_모든_범위의_값_포함() {

        int[][] intervals = {{1, 5}};
        int[] newInterval = {1, 7};

        int[][] result = insertInterval.insert(intervals, newInterval);

        int[][] expected = {{1, 7}};

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void end의_값이_동일_모든_범위의_값_포함() {
        int[][] intervals = {{2, 7}};
        int[] newInterval = {1, 7};

        int[][] result = insertInterval.insert(intervals, newInterval);

        int[][] expected = {{1, 7}};

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 두값_모두_겹침() {
        int[][] intervals = {{1, 7}};
        int[] newInterval = {1, 7};

        int[][] result = insertInterval.insert(intervals, newInterval);

        int[][] expected = {{1, 7}};

        assertThat(result).isEqualTo(expected);
    }


    @Test
    void intervals배열이_크고_안겹침() {
        int[][] intervals = {{10, 12}};
        int[] newInterval = {1, 7};

        int[][] result = insertInterval.insert(intervals, newInterval);

        int[][] expected = {{1, 7}, {10, 12}};

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void intervals배열이_newInterval보다_작고_안겹침() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {6, 8};

        int[][] result = insertInterval.insert(intervals, newInterval);

        int[][] expected = {{1, 5}, {6, 8}};

        assertThat(result).isEqualTo(expected);
    }
}