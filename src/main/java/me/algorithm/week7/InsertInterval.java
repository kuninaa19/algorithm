package me.algorithm.week7;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int[] temp = new int[]{newInterval[0], newInterval[1]};

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] < temp[0]) {
                result.add(intervals[i]);
                continue;
            }

            if (intervals[i][0] > temp[1]) {
                if (!result.contains(temp)) {
                    result.add(temp);
                }
                result.add(intervals[i]);
                continue;
            }

            temp[0] = Math.min(intervals[i][0], temp[0]);
            temp[1] = Math.max(intervals[i][1], temp[1]);
        }

        if (result.size() == 0) {
            result.add(temp);
        } else if (!result.contains(temp)) {
            result.add(temp);
        }

        return result.toArray(new int[0][]);
    }
}
