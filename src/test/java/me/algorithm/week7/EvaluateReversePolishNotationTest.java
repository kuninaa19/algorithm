package me.algorithm.week7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvaluateReversePolishNotationTest {

    private EvaluateReversePolishNotation evaluateReversePolishNotation;

    @BeforeEach
    void setUp() {
        evaluateReversePolishNotation = new EvaluateReversePolishNotation();
    }

    @Test
    void 예시_1_연산자_가운데_존재() {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        int result = evaluateReversePolishNotation.evanRPN(tokens);

        assertThat(result).isEqualTo(9);
    }

    @Test
    void 예시_2_연산자_뒤에_존재(){
        String[] tokens = new String[]{"4","13","5","/","+"};
        int result = evaluateReversePolishNotation.evanRPN(tokens);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void 예시_3(){
        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int result = evaluateReversePolishNotation.evanRPN(tokens);

        assertThat(result).isEqualTo(22);
    }

}
