package me.algorithm.week6;

public class FirstBadVersion {
    /* 임의의 정상 버전 하드 코딩 */
    static boolean isBadVersion(int version) {
        if (version == 3 || version == 4 || version == 5) {
            return true;
        }

        return version >= 1702766719;
    }

    /* 에러 버전을 찾은 후 변수에 저장 */
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int firstBadVersion = 1;

        while (left <= right) {
            /* Int 범위파악을 안했음. */
            int mid = (int) (((long) left + (long) right) / 2);

            if (isBadVersion(mid)) {
                firstBadVersion = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return firstBadVersion;
    }

    /* 정상 버전을 찾은 후 + 1(실패버전)
    * left가 right가 같거나 크게 된다면 break
    *  */
    public static int firstBadVersionRefactored(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
