package me.algorithm.week6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstBadVersionTest {
    @Test
    @DisplayName("중간 버전이 처음으로 발생한 에러 버전")
    void testMiddleVersionIsFirstBadVersion() {
        int n = 5;
        int bad = 3;
        int result = FirstBadVersion.firstBadVersionRefactored(n);

        assertThat(result).isEqualTo(bad);
    }

    @Test
    @DisplayName("버전 최대 번호 2^31 - 1(int 허용 최대 값)")
    void test() {
        int n = 2147483647;
        int bad = 1702766719;
        int result = FirstBadVersion.firstBadVersionRefactored(n);

        assertThat(result).isEqualTo(bad);
    }

    @Test
    @DisplayName("단일 버전이 에러 버전")
    void testOneVersionIsFirstBadVersion() {
        int n = 1;
        int bad = 1;
        int result = FirstBadVersion.firstBadVersionRefactored(n);

        assertThat(result).isEqualTo(bad);
    }
}
