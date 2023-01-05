package me.algorithm.week8;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        /*prefix */
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] * prefix[i - 1];
        }

        /* suffix */
        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = nums[i] * suffix[i + 1];
        }

        /* calculate */
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = suffix[i + 1];
                continue;
            }

            if (i == nums.length - 1) {
                result[i] = prefix[i - 1];
                continue;
            }

            result[i] = prefix[i - 1] * suffix[i + 1];
        }

        return result;
    }
}
