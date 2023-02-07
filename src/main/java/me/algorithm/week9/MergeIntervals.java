package me.algorithm.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] o) -> o[0]));

        List<int[]> result = new ArrayList<>();
        int[] temp = intervals[0];

        for (int i = 0; i < intervals.length; i++) {
            if (temp[1] < intervals[i][0]) {
                result.add(temp);
                temp = intervals[i];
            }

            if (temp[1] >= intervals[i][0]) {
                temp[1] = Math.max(temp[1], intervals[i][1]);
            }

            if (i + 1 == intervals.length) {
                result.add(temp);
            }
        }

        return result.toArray(new int[0][]);
    }
}
