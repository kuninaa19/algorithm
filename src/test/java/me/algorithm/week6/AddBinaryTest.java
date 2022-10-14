package me.algorithm.week6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddBinaryTest {
    @Test
    void 이진수_마지막값이_그전_이진수를_1값_올린다() {
        String a = "11";
        String b = "1";
        String result = AddBinary.addBinary(a, b);

        assertThat(result).isEqualTo("100");
    }

    @Test
    void 가장_첫번째값을_안올린다() {
        String a = "110";
        String b = "1";
        String result = AddBinary.addBinary(a, b);

        assertThat(result).isEqualTo("111");
    }

    @Test
    void Long_범위를_넘는_이진수() {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String result = AddBinary.addBinary(a, b);

        assertThat(result).isEqualTo("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000");
    }
}
