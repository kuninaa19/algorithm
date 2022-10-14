package me.algorithm.week6;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int result = 0;
        int[] letters = new int[128];
        char[] c = s.toCharArray();

        for (char value : c) {
            letters[value]++;
        }

        for (int l : letters) {
            if (l > 0) {
                result += l - l % 2;
            }
        }

        if (result < c.length) {
            result++;
        }

        return result;
    }
}
