package me.algorithm.week8;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int pivot = getPivot(nums);
        return partitionBinarySearch(nums, target, pivot);
    }

    private int getPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (left == right) {
                return left;
            }

            if (right > mid + 1 && nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else if (left < mid - 1 && nums[mid] < nums[mid - 1]) {
                return mid;
            } else if (nums[left] <= nums[mid]) {
                left = mid + 1;
            } else if (nums[left] > nums[mid]) {
                right = mid - 1;
            }
        }

        return -1;
    }

    private int partitionBinarySearch(int[] nums, int target, int pivot) {
        if (nums[pivot] == target) {
            return pivot;
        }

        int left = 0;
        int right = nums.length - 1;

        if (nums[left] <= target) {
            right = pivot - 1;
        } else {
            left = pivot;
        }

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }

        return -1;
    }
}
