package me.algorithm.week7;

import java.util.*;

public class KClosestPointsToOrigin {

    /*
     * Priority  Comparator 활용 안함
     * */
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        HashMap<Integer, ArrayList<int[]>> hashMap = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            int sum = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            priorityQueue.add(sum);

            ArrayList<int[]> ints = hashMap.get(sum);

            if (ints == null) {
                ArrayList<int[]> objects = new ArrayList<>();
                objects.add(points[i]);
                hashMap.put(sum, objects);
            }

            if (ints != null) {
                ints.add(points[i]);
                hashMap.put(sum, ints);
            }
        }

        List<int[]> result = new ArrayList<>();

        while (result.size() < k) {
            Integer remove = priorityQueue.remove();

            ArrayList<int[]> ints = hashMap.get(remove);

            result.addAll(ints);
        }

        return result.toArray(new int[0][2]);
    }

    public int[][] quickSelectAlgorithm(int[][] points, int k) {
        int left = 0;
        int right = points.length - 1;
        int pivot = points.length;

        while (pivot != k) {
            pivot = partition(points, left, right);

            if (pivot < k) {
                left = pivot;
            } else {
                right = pivot - 1;
            }
        }

        return Arrays.copyOf(points, k);
    }

    private int partition(int[][] points, int low, int high) {
        int mid = (low + high) / 2;
        int pivotDistance = distance(points[mid]);

        while (low <= high) {
            while (pivotDistance > distance(points[low])) {
                low++;
            }
            while (pivotDistance < distance(points[high])) {
                high--;
            }

            if (low <= high) {
                int[] temp = points[high];
                points[high] = points[low];
                points[low] = temp;

                low++;
                high--;
            }
        }

        /*
        * pivot으로 사용될값이 피봇 위치를 넘었기때문에 pivot 인덱스가 K보다 크면 -1 을 해줘야한다
        * */
        return low;
    }

    private int distance(int[] points) {
        return points[0] * points[0] + points[1] * points[1];
    }
}

