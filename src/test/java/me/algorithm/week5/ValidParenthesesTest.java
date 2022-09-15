package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {
    @Test
    @DisplayName("실패 케이스 : 문자열 길이가 홀수")
    void TestOddLength() {
        String s = "(){";
        boolean result = ValidParentheses.isValid(s);
        assertFalse(result);
    }

    @Test
    @DisplayName("실패 케이스 : open/closed 괄호가 동일하지않음")
    void TestNotEqualBracks() {
        String s = "(]";
        boolean result = ValidParentheses.isValid(s);
        assertFalse(result);
    }

    @Test
    @DisplayName("실패 케이스 : open brackets만 반복")
    void TestSameBrackets() {
        String s = "((";
        boolean result = ValidParentheses.isValid(s);
        assertFalse(result);
    }

    @Test
    @DisplayName("실패 케이스 : 닫힌 케이스 부터 시작")
    void TestStartClosedBrackets() {
        String s = "}(";
        boolean result = ValidParentheses.isValid(s);
        assertFalse(result);
    }

    @Test
    @DisplayName("실패 케이스 : 데칼코마니가 존재하고 open/close brackets구성")
    void TestNotEqualBracksWithDecalcomania() {
        String s = "{[(){]]}";
        boolean result = ValidParentheses.isValid(s);
        assertFalse(result);
    }

    @Test
    @DisplayName("성공 케이스 : open/closed 괄호가 동일 + 문자열 길이 짝수")
    void TestEqual() {
        String s = "()[]{}";
        boolean result = ValidParentheses.isValid(s);
        assertTrue(result);
    }

    @Test
    @DisplayName("성공 케이스 : 괄호가 데칼코마니처럼 구성")
    void TestDecalcomania() {
        String s = "{[()]}";
        boolean result = ValidParentheses.isValid(s);
        assertTrue(result);
    }
    @Test
    @DisplayName("성공 케이스 : 데칼코마니 + open/closed 연속 brackets")
    void TestMoreComplicate() {
        String s = "{[()[]]}";
        boolean result = ValidParentheses.isValid(s);
        assertTrue(result);
    }

    @Test
    @DisplayName("성공 케이스 : 좀더 복잡한 데칼코마니 + open/closed 연속 brackets")
    void TestMostComplicate() {
        String s = "{[()[{}]{}]}";
        boolean result = ValidParentheses.isValid(s);
        assertTrue(result);
    }
}
