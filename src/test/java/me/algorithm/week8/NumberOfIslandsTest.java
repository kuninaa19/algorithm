package me.algorithm.week8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfIslandsTest {
    @Test
    void 예제_케이스() {
        char[][] grid = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};

        NumberOfIslands numberOfIslands = new NumberOfIslands();
        assertThat(numberOfIslands.numIslands(grid)).isEqualTo(1);
    }

    @Test
    void 예제_케이스_2() {
        char[][] grid = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};

        NumberOfIslands numberOfIslands = new NumberOfIslands();
        assertThat(numberOfIslands.numIslands(grid)).isEqualTo(3);
    }
}
