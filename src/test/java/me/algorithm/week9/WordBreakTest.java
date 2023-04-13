package me.algorithm.week9;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WordBreakTest {
    @Test
    void 예시1() {
        WordBreak wordBreak = new WordBreak();
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        assertThat(wordBreak.wordBreak(s, wordDict)).isTrue();
    }
}
