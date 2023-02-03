package me.algorithm.week9;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void swap(int index, int i, int[] arr) {
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }

    public static void helper(int[] nums, int index, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int i : nums) {
                list.add(i);
            }
            ans.add(list);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(index, i, nums);
            helper(nums, index + 1, ans);
            swap(index, i, nums);
        }
    }

    /* 순열 알고리즘
     * 스왑 활용 매 차수마다 스왑진행
     *
     *  */
    public List<List<Integer>> permuteAlgorithm(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }

    /* 내가 풀이한 문제
     * DFS를 활용한 순차 탐색
     * 진행하는 인덱스마다 제공된 값(Nums)의 크기만큼 반복한다는 문제점을 갖고 있음
     *
     * */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dps(nums, result, new ArrayList<>(), 0);
        return result;
    }

    private void dps(int[] nums, List<List<Integer>> result, List<Integer> elements, int i) {
        if (elements.size() == nums.length) {
            result.add(new ArrayList<>(elements));
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            int count = i % nums.length;

            if (!elements.contains(nums[count])) {
                elements.add(nums[count]);
                dps(nums, result, elements, i + 1);
                elements.remove(elements.size() - 1);
            }

            i++;
        }
    }
}
