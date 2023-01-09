package me.algorithm.week8;

public class NumberOfIslands {

    public static final char LAND = '1';
    public static final char WATER = '0';

    public int numIslands(char[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == LAND) {
                    dfs(grid, i, j);
                    result += 1;
                }
            }
        }

        return result;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (grid[i][j] == WATER) {
            return;
        }

        grid[i][j] = NumberOfIslands.WATER;

        if (i + 1 < grid.length) {
            dfs(grid, i + 1, j);
        }

        if (j + 1 < grid[0].length) {
            dfs(grid, i, j + 1);
        }

        if (i - 1 >= 0) {
            dfs(grid, i - 1, j);
        }

        if (j - 1 >= 0) {
            dfs(grid, i, j - 1);
        }
    }
}
