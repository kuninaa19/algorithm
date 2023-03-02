package me.algorithm.week9;


public class SortColors {
    public void sortColors(int[] nums) {
        int[] numCount = new int[3];

        for (int num : nums) {
            if (num == 0) {
                numCount[0]++;
                continue;
            }

            if (num == 1) {
                numCount[1]++;
                continue;
            }

            if (num == 2) {
                numCount[2]++;
            }
        }

        int sum = 0;

        for (int i = 0; i < numCount.length; i++) {
            for (int j = 0; j < numCount[i]; j++) {
                nums[sum] = i;
                sum++;
            }
        }
    }

    /* Dutch Flag Problem */
    public void sortColors2(int[] nums) {
        int p0 = 0;
        int p1 = 0;
        int p2 = nums.length - 1;

        while (p1 <= p2) {
            if (nums[p1] == 0) {
                swap(nums, p1, p0);
                p0++;
                p1++;
            } else if (nums[p1] == 2) {
                swap(nums, p1, p2);
                p2--;
            } else {
                p1++;
            }
        }
    }

    private void swap(int[] nums, int s0, int s2) {
        int temp = nums[s0];
        nums[s0] = nums[s2];
        nums[s2] = temp;
    }
}
