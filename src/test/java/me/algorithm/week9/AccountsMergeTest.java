package me.algorithm.week9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountsMergeTest {

    private AccountsMerge accountsMerge;

    @BeforeEach
    void setUp() {
        accountsMerge = new AccountsMerge();
    }

    @Test
    void 이름_중복_이메일_중복() {
        List<List<String>> accounts = Arrays.asList(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"), Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"), Arrays.asList("Mary", "mary@mail.com"), Arrays.asList("John", "johnnybravo@mail.com"));
        List<List<String>> expected = Arrays.asList(Arrays.asList("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"), Arrays.asList("Mary", "mary@mail.com"), Arrays.asList("John", "johnnybravo@mail.com"));

        assertThat(accountsMerge.accountsMerge(accounts)).usingRecursiveComparison().isEqualTo(expected);
    }
}
