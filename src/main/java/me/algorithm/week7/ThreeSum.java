package me.algorithm.week7;

import java.util.*;

public class ThreeSum {
    /*
    * 정렬 + 투포인터
    *
    * */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();

        /* 3가지 요소의 합을 구해야하기때문에 길이 -2 까지 반복 */
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            int target = -nums[i];

            /* 동일한 요소 반복 x */
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (low < high) {
                if (nums[low] + nums[high] == target) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;

                    low++;
                    high--;
                } else if (nums[low] + nums[high] < target) low++;
                else high--;

            }

        }

        return result;
    }
}
