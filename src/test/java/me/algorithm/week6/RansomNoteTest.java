package me.algorithm.week6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RansomNoteTest {

    @ParameterizedTest
    @DisplayName("RansomNote 문자열은 Magazine 문자열의 연속적인 문자열 나열 : ab include in abc")
    @CsvSource(value = {"aa:aab", "abc:abcd"}, delimiter = ':')
    void RansomNoteIncludeInMagazine(String ransomNote, String magazine) {
        boolean result = RansomNote.canConstruct(ransomNote, magazine);
        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Ransom Note 문자열은 순서에 상관없이 Magazine 문자열안에 포함")
    @CsvSource(value = {"acb:abc", "ilno:lionheart", "af:asiafood"}, delimiter = ':')
    void RansomNoteIncludeInMagazineNotInOrderBy(String ransomNote, String magzine) {
        boolean result = RansomNote.canConstruct(ransomNote, magzine);

        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Ransom Note 문자열은 Magazine 문자열과 동일한 요소가 단하나도 없다.")
    @CsvSource(value = {"a:b", "ab:cd"}, delimiter = ':')
    void RansomNoteNotIncludeInMagazine(String ransomNote, String magzine) {
        boolean result = RansomNote.canConstruct(ransomNote, magzine);

        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @DisplayName("Ransom Note 문자열은 Magazine 문자열과 동일한 요소가 단 하나만 존재")
    @CsvSource(value = {"aa:ab", "abc:ebs"}, delimiter = ':')
    void RansomNoteIncludeInOnlyOneMagazineLetter(String ransomNote, String magzine) {
        boolean result = RansomNote.canConstruct(ransomNote, magzine);

        assertThat(result).isFalse();
    }


    @ParameterizedTest
    @DisplayName("RansomNote_문자열내에_알파벳_중복이_많아도_Magazine_내에_단하나의_알파벳이_존재한다면_1개만_인정")
    @CsvSource(value = {"aaa:ab", "aabc:abcd"}, delimiter = ':')
    void EachLetterInMagazineCanOnlyBeUsedOnceInRansomNote(String ransomNote, String magzine) {
        boolean result = RansomNote.canConstruct(ransomNote, magzine);

        assertThat(result).isFalse();
    }
}
