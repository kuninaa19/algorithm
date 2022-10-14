package me.algorithm.week6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestPalindromeTest {
    @Test
    void 구분_앞뒤로_같은_문장_최대길이() {
        String s = "abccccdd";
        int result = LongestPalindrome.longestPalindrome(s);

        assertThat(result).isEqualTo(7);
    }

    @Test
    void 단일_문자() {
        String s = "a";
        int result = LongestPalindrome.longestPalindrome(s);

        assertThat(result).isEqualTo(1);
    }

    @ParameterizedTest
    @CsvSource(value = {"Aa:1", "AaA:3", "AbbaB:3"}, delimiter = ':')
    void 대소문자_동일성은_불허(String s, int expected) {
        int result = LongestPalindrome.longestPalindrome(s);

        assertThat(result).isEqualTo(expected);
    }
}
