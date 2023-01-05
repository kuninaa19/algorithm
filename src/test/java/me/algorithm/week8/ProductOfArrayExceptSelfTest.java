package me.algorithm.week8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductOfArrayExceptSelfTest {
    @Test
    void 예제케이스_0이_포함되어있지않은_배열() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};

        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        assertThat(productOfArrayExceptSelf.productExceptSelf(nums)).isEqualTo(expected);
    }


    @Test
    void 예제케이스_0_포함_배열() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};

        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        assertThat(productOfArrayExceptSelf.productExceptSelf(nums)).isEqualTo(expected);
    }

    @Test
    void 예제케이스_0이_좌측_모서리에_존재() {
        int[] nums = {0, 3, 4, 5};
        int[] expected = {60, 0, 0, 0};

        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        assertThat(productOfArrayExceptSelf.productExceptSelf(nums)).isEqualTo(expected);
    }

    @Test
    void 예제케이스_0이_우측_모서리에_존재() {
        int[] nums = {3, 4, 5, 0};
        int[] expected = {0, 0, 0, 60};

        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        assertThat(productOfArrayExceptSelf.productExceptSelf(nums)).isEqualTo(expected);
    }

}
