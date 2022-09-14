package me.algorithm.week5;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int needNum = target - nums[i];

            if (map.get(needNum) != null) {
                int v = map.get(needNum);
                result[0] = v;
                result[1] = i;

                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}