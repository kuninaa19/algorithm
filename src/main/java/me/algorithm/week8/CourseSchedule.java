package me.algorithm.week8;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[2001];
        HashMap<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] prerequisite : prerequisites) {
            int want = prerequisite[0];
            int need = prerequisite[1];

            if (graph.containsKey(want)) {
                List<Integer> needs = graph.get(want);
                needs.add(need);

                continue;
            }

            List<Integer> needs = new ArrayList<>(Arrays.asList(need));
            graph.put(want, needs);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!dps(visited, graph, i)) {
                return false;
            }

            visited = new boolean[2001];
        }

        return true;
    }

    private boolean dps(boolean[] visited, HashMap<Integer, List<Integer>> graph, int seq) {
        if (visited[seq]) {
            return false;
        }

        List<Integer> needs = graph.get(seq);
        if (needs == null || needs.isEmpty()) {
            return true;
        }

        visited[seq] = true;

        for (int need : needs) {
            if (!dps(visited, graph, need)) {
                return false;
            }
        }

        visited[seq] = false;

        /* needs에 대해 전체 탐색을 한 후에 빈배열을 저장하면서 참조하려고 할때 빈 배열 출력 */
        graph.put(seq, new ArrayList<>());

        return true;
    }
}
