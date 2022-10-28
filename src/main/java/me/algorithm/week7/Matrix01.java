package me.algorithm.week7;

import java.util.Arrays;

public class Matrix01 {

    public static final int MAX_VALUE = 10000;
    public static final int MIN_VALUE = 0;

    /* DP 문제풀이 방법 */
    public int[][] updateMatrix(int[][] mat) {
        int nSize = mat.length;
        int mSize = mat[0].length;

        int[][] result = new int[nSize][mSize];

        for (int i = 0; i < nSize; i++) {
            Arrays.fill(result[i], MAX_VALUE);
        }

        for (int i = 0; i < nSize; i++) {
            for (int j = 0; j < mSize; j++) {
                if (mat[i][j] == 0) {
                    result[i][j] = MIN_VALUE;
                }

                if (i >= 1) {
                    result[i][j] = Math.min(result[i - 1][j] + 1, result[i][j]);
                }

                if (j >= 1) {
                    result[i][j] = Math.min(result[i][j - 1] + 1, result[i][j]);
                }
            }
        }

        for (int i = nSize - 1; i >= 0; i--) {
            for (int j = mSize - 1; j >= 0; j--) {
                if (mat[i][j] != 0) {
                    if (i < nSize - 1) {
                        result[i][j] = Math.min(result[i + 1][j] + 1, result[i][j]);
                    }

                    if (j < result[0].length - 1) {
                        result[i][j] = Math.min(result[i][j + 1] + 1, result[i][j]);
                    }
                }
            }
        }

        return result;
    }
}
