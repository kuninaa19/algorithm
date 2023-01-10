package me.algorithm.week8;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {

    public static final int EMPTY_CELL = 0;
    public static final int FRESH_FRUIT = 1;
    public static final int ROTTEN_ORANGE = 2;

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = -1;

        Queue<Position> queue = getRottenOrange(grid, m, n);

        if (queue.isEmpty()) {
            result = 0;
        }

        while (!queue.isEmpty()) {
            Queue<Position> tempQueue = new ArrayDeque<>();

            int qSize = queue.size();
            boolean progressChecker = false;

            for (int i = 0; i < qSize; i++) {
                Position poll = queue.poll();

                int x = poll.getX();
                int y = poll.getY();

                if (grid[x][y] == EMPTY_CELL) {
                    continue;
                }

                progressChecker = true;
                grid[x][y] = EMPTY_CELL;
                
                if (x + 1 < m && grid[x + 1][y] == FRESH_FRUIT) {
                    tempQueue.add(new Position(x + 1, y));
                }

                if (y + 1 < n && grid[x][y + 1] == FRESH_FRUIT) {
                    tempQueue.add(new Position(x, y + 1));
                }

                if (x - 1 >= 0 && grid[x - 1][y] == FRESH_FRUIT) {
                    tempQueue.add(new Position(x - 1, y));
                }

                if (y - 1 >= 0 && grid[x][y - 1] == FRESH_FRUIT) {
                    tempQueue.add(new Position(x, y - 1));
                }
            }

            if (progressChecker) {
                result += 1;
            }

            queue = tempQueue;
        }

        for (int[] row : grid) {
            for (int fruit : row) {
                if (fruit == FRESH_FRUIT) {
                    return -1;
                }
            }
        }

        return result;
    }

    private Queue<Position> getRottenOrange(int[][] grid, int m, int n) {
        Queue<Position> queue = new ArrayDeque<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == ROTTEN_ORANGE) {
                    queue.add(new Position(i, j));
                }
            }
        }

        return queue;
    }
}
