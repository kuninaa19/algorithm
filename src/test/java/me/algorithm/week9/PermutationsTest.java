package me.algorithm.week9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PermutationsTest {

    private Permutations permutations;

    @BeforeEach
    void setUp() {
        permutations = new Permutations();
    }

    @Test
    void permute_Algo() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
        assertThat(permutations.permuteAlgorithm(nums)).usingRecursiveComparison().ignoringCollectionOrder().isEqualTo(expected);
    }

    @Test
    void 데이터_3개() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1));
        assertThat(permutations.permute(nums)).usingRecursiveComparison().ignoringCollectionOrder().isEqualTo(expected);
    }

    @Test
    void 데이터_2개() {
        int[] nums = {0, 1};
        assertThat(permutations.permute(nums)).isEqualTo(List.of(List.of(0, 1), List.of(1, 0)));
    }

    @Test
    void 데이터_1개() {
        int[] nums = {1};
        assertThat(permutations.permute(nums)).isEqualTo(List.of(List.of(1)));
    }
}
