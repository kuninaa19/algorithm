package me.algorithm.week6;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int[] acc = new int[n + 1];
        return dp(n, acc);
    }

    private static int dp(int n, int[] acc) {
        if (acc[n] != 0) {
            return acc[n];
        }

        if (n <= 1) {
            return 1;
        }

        return acc[n] = dp(n - 2, acc) + dp(n - 1, acc);
    }
}
