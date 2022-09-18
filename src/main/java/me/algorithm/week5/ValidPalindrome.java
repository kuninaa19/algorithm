package me.algorithm.week5;

public class ValidPalindrome {
    public static boolean isPalindromeRefactored(String s) {
        int frontIdx = 0;
        int backIdx = s.length() - 1;

        s = s.toLowerCase();

        while (frontIdx < backIdx) {
            char front = s.charAt(frontIdx);
            char back = s.charAt(backIdx);

            if (!Character.isLetterOrDigit(front))
                frontIdx++;
            else if (!Character.isLetterOrDigit(back))
                backIdx--;
            else {
                if (front != back)
                    return false;

                frontIdx++;
                backIdx--;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        int frontIdx = 0;
        int backIdx = s.length() - 1;
        boolean result = true;

        while (frontIdx < backIdx) {
            char front = s.charAt(frontIdx);
            if (!Character.isAlphabetic(front) && !Character.isDigit(front)) {
                frontIdx++;
                continue;
            }

            char back = s.charAt(backIdx);
            if (!Character.isAlphabetic(back) && !Character.isDigit(back)) {
                backIdx--;
                continue;
            }

            if (Character.toLowerCase(front) != Character.toLowerCase(back)) {
                result = false;
                break;
            }
            backIdx--;
            frontIdx++;
        }

        return result;
    }
}
