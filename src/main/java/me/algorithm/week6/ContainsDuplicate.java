package me.algorithm.week6;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (!numbers.add(num)) {
                return true;
            }
        }
        return false;
    }
}
