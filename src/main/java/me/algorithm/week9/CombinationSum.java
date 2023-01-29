package me.algorithm.week9;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dps(new ArrayList<>(), candidates, 0, target);

        return result;
    }

    private void dps(List<Integer> temp, int[] candidates, int idx, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            temp.add(candidates[i]);

            dps(temp, candidates, i, target - candidates[i]);
            temp.remove(temp.size() - 1);
        }
    }
}
