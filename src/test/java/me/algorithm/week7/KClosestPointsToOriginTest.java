package me.algorithm.week7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KClosestPointsToOriginTest {

    private KClosestPointsToOrigin kClosestPointsToOrigin;

    @BeforeEach
    void setUp() {
        kClosestPointsToOrigin = new KClosestPointsToOrigin();
    }

    @Test
    void 두점_배열중_하나() {
        int[][] points = new int[][]{{1, 3}, {-2, 2}};
        int k = 1;

        int[][] result = kClosestPointsToOrigin.kClosest(points, k);

        int[][] expected = new int[][]{{-2, 2}};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 데칼코마니_배열() {
        int[][] points = new int[][]{{0, 1}, {1, 0}};
        int k = 2;

        int[][] result = kClosestPointsToOrigin.kClosest(points, k);

        int[][] expected = new int[][]{{0, 1}, {1, 0}};
        assertThat(result).isEqualTo(expected);
    }


    @Test
    void 여러개_배열중_2개() {
        int[][] points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        int[][] result = kClosestPointsToOrigin.kClosest(points, k);

        int[][] expected = new int[][]{{3, 3}, {-2, 4}};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 모든_배열_음수() {
        int[][] points = new int[][]{{-3, -3}, {-5, -1}, {-2, -4}};
        int k = 2;

        int[][] result = kClosestPointsToOrigin.kClosest(points, k);

        int[][] expected = new int[][]{{-3, -3}, {-2, -4}};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 모든_배열_양수() {
        int[][] points = new int[][]{{3, 3}, {5, 1}, {2, 4}};
        int k = 2;

        int[][] result = kClosestPointsToOrigin.kClosest(points, k);

        int[][] expected = new int[][]{{3, 3}, {2, 4}};
        assertThat(result).isEqualTo(expected);
    }
}
