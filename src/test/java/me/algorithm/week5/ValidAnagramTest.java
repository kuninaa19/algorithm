package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidAnagramTest {
    @Test
    @DisplayName("재배열된 문자열 확인")
    void testRearrangedString() {
        String s = "anagram";
        String t = "nagaram";

        boolean result = ValidAnagram.isAnagram(s, t);

        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("틀린 문자열")
    void testWrongAnagramString() {
        String s = "rat";
        String t = "cat";

        boolean result = ValidAnagram.isAnagram(s, t);

        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("크기가 동일하지않은 문자열")
    void testNotSameLengthString() {
        String s = "str";
        String t = "st";

        boolean result = ValidAnagram.isAnagram(s, t);

        assertThat(result).isEqualTo(false);
    }
}
