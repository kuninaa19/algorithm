package me.algorithm.week8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RottingOrangesTest {
    @Test
    void 썩은_오렌지_1개_일반_탐색() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};

        RottingOranges rottingOranges = new RottingOranges();
        assertThat(rottingOranges.orangesRotting(grid)).isEqualTo(4);
    }

    @Test
    void 도달할_수_없는_신선한_오렌지_존재() {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};

        RottingOranges rottingOranges = new RottingOranges();
        assertThat(rottingOranges.orangesRotting(grid)).isEqualTo(-1);
    }

    @Test
    void 빈_셀() {
        int[][] grid = {{0}};

        RottingOranges rottingOranges = new RottingOranges();
        assertThat(rottingOranges.orangesRotting(grid)).isEqualTo(0);
    }

    @Test
    void 썩은_오렌지_여러개_신선한_사과_0개() {
        int[][] grid = {{2, 2, 2, 0, 0}};

        RottingOranges rottingOranges = new RottingOranges();
        assertThat(rottingOranges.orangesRotting(grid)).isEqualTo(0);
    }

    @Test
    void 썩은_오렌지_여러개_인접한_신선한_오렌지들() {
        int[][] grid = {{2, 2}, {1, 1}, {0, 0}, {2, 0}};

        RottingOranges rottingOranges = new RottingOranges();
        assertThat(rottingOranges.orangesRotting(grid)).isEqualTo(1);
    }
}
