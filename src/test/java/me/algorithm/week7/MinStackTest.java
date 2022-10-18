package me.algorithm.week7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class MinStackTest {

    private MinStack minStack;

    @BeforeEach
    void setUp() {
        minStack = new MinStack();
    }

    @Test
    void 인스턴스_생성() {
        assertThat(minStack).isInstanceOf(MinStack.class);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 0x7fffffff})
    void 데이터_저장(int result) {
        minStack.push(result);

        int expected = minStack.top();

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 가장_상위요소_데이터_조회() {
        int expected = 0;
        minStack.push(expected);

        int result = minStack.top();

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 가장_상위요소_데이터_제거() {
        minStack.push(0);
        minStack.push(1);

        minStack.pop();

        int result = minStack.top();
        int expected = 0;

        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"2:1:3:1", "-3:-2:3:-3"}, delimiter = ':')
    void 최소값_데이터_조회(int input1, int input2, int input3, int expected) {
        minStack.push(input1);
        minStack.push(input2);
        minStack.push(input3);

        int result = minStack.getMin();

        assertThat(result).isEqualTo(expected);
    }
}
