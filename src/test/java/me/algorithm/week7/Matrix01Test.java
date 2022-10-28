package me.algorithm.week7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Matrix01Test {

    private Matrix01 matrix01;

    @BeforeEach
    void setUp() {
        matrix01 = new Matrix01();
    }

    @Test
    void 단일개수_1x1_의_행렬() {
        int[][] mat = new int[][]{{0}};
        int[][] result = matrix01.updateMatrix(mat);

        int[][] expected = new int[][]{{0}};

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 자신이_1이고_옆의_값이_0인_행렬() {
        int[][] mat = new int[][]{{1, 0}};
        int[][] result = matrix01.updateMatrix(mat);

        int[][] expected = new int[][]{{1, 0}};

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 다중배열() {
        int[][] mat = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] result = matrix01.updateMatrix(mat);

        int[][] expected = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};

        assertThat(result).isEqualTo(expected);
    }
}
