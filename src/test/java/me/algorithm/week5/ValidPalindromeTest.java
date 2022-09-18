package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidPalindromeTest {
    @Test
    @DisplayName("빈 문자열")
    void testEmptyString(){
        String s = " ";
        boolean result = ValidPalindrome.isPalindrome(s);
        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("스페이스 들어간 문자열")
    void testStringWithSpace(){
        String s = "race a car";
        boolean result = ValidPalindrome.isPalindrome(s);
        assertThat(result).isEqualTo(false);
    }

    @Test
    @DisplayName("특수문자, 대문자 들어간 문자열")
    void testStringWithUpperCaseAndSpecial(){
        String s = "A man, a plan, a canal: Panama";
        boolean result = ValidPalindrome.isPalindrome(s);
        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("숫자와 영문 문자열")
    void testStringWithNumber(){
        String s = "ab2a";
        boolean result = ValidPalindrome.isPalindrome(s);
        assertThat(result).isEqualTo(false);
    }
}
