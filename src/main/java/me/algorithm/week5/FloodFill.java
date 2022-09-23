package me.algorithm.week5;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }

        int temp = image[sr][sc];

        image[sr][sc] = color;

        if (sr + 1 < image.length && temp == image[sr + 1][sc]) {
            floodFill(image, sr + 1, sc, color);
        }
        if (sr - 1 >= 0 && temp == image[sr - 1][sc]) {
            floodFill(image, sr - 1, sc, color);
        }

        if (sc + 1 < image[sr].length && temp == image[sr][sc + 1]) {
            floodFill(image, sr, sc + 1, color);
        }

        if (sc - 1 >= 0 && temp == image[sr][sc - 1]) {
            floodFill(image, sr, sc - 1, color);
        }

        return image;
    }
}
