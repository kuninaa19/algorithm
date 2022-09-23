package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FloodFillTest {
    @Test
    @DisplayName("(1,1)에서 시작해서 연결되는 모든 부분을 값 2로 변경")
    void testChangeColor2() {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        int[][] result = FloodFill.floodFill(image, 1, 1, 2);

        int[][] expected = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("행렬 각 길이가 다른 배열")
    void testNotSquare() {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};

        int[][] result = FloodFill.floodFill(image, 1, 0, 2);

        int[][] expected = {{2, 2, 2}, {2, 2, 2}};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("구석에서 시작하는 둘레형 배열")
    void testStartAtEdgeCircleArray() {
        int[][] image = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        int[][] result = FloodFill.floodFill(image, 0, 0, 2);

        int[][] expected = {{2, 2, 2}, {2, 0, 2}, {2, 2, 2}};
        assertThat(result).isEqualTo(expected);
    }


    @Test
    @DisplayName("이미 컬러색깔과 동일")
    void testAlreadyColored() {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        int[][] result = FloodFill.floodFill(image, 0, 0, 0);

        int[][] expected = {{0, 0, 0}, {0, 0, 0}};
        assertThat(result).isEqualTo(expected);
    }
}
