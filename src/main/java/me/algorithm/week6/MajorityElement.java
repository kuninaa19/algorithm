package me.algorithm.week6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> elements = new HashMap<>();

        for (int num : nums) {
            elements.merge(num, 1, Integer::sum);
        }

        return Collections.max(elements.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    /*
     * 카운팅 풀이법
     * 절반이상을 차지한 요소를 리턴한다.
     * 풀이법 : 특정요소가 n/2이상을 차지하기때문에 특정요소 count - 나머지 count = 특정요소
     * */
    public static int anotherSolution(int[] nums) {
        int count = 0;
        int result = nums[0];

        for (int i : nums) {
            if (count == 0) {
                result = i;
            }
            if (result == i) {
                count++;
            } else {
                count--;
            }
        }

        return result;
    }
}
