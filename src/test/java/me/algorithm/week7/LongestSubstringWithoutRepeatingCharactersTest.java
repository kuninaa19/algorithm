package me.algorithm.week7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeEach
    void setUp() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @ParameterizedTest
    @CsvSource(value = {"abcabcbb:3", "aabcd:4", "cdd:2", "dvdf:3", "abba:2"}, delimiter = ':')
    void 중복이_있는_문자열중에서_최대_값(String s, int expected) {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 최대길이가_하나인_중복_문자열() {
        String s = "bbbbbb";
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        int expected = 1;

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 최대길이가_중간에_존재하는_문자열() {
        String s = "pwwkew";
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        int expected = 3;

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 문자열_길이가_0() {
        String s = "";
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        int expected = 0;

        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"pww kew:4", "' ':1"}, delimiter = ':')
    void 띄어쓰기가_존재하는_문자열(String s, int expected) {
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 숫자가_존재하는_문자열() {
        String s = "pww12kew";
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        int expected = 5;

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 특수문자가_존재하는_문자열() {
        String s = "pww#kew";
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        int expected = 4;

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 중복없는_문자열() {
        String s = "abcd";
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        int expected = 4;

        assertThat(result).isEqualTo(expected);
    }
}
