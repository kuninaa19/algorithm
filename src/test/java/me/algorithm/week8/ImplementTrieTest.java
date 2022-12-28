package me.algorithm.week8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ImplementTrieTest {
    private Trie trie;

    @BeforeEach
    void setUp() {
        trie = new Trie();
    }

    @Test
    void 초기화() {
        assertThat(trie).isInstanceOf(Trie.class);
    }

    @Test
    void 예제_코드_실행() {
        trie.insert("apple");
        assertThat(trie.search("apple")).isTrue();
        assertThat(trie.search("app")).isFalse();
        assertThat(trie.startsWith("app")).isTrue();

        trie.insert("app");
        assertThat(trie.search("app")).isTrue();
    }

    @Test
    void 아무것도없을때_탐색() {
        assertThat(trie.search("a")).isFalse();
    }

    @Test
    void 아무것도_없을때_부분탐색() {
        assertThat(trie.startsWith("a")).isFalse();
    }

    @Test
    void 삽입_부분_탐색_전체_탐색() {
        trie.insert("aaaaaa");
        trie.insert("aaaaaaa");
        trie.insert("aaaaab");
        trie.insert("aaaa");
        trie.insert("aaaaa");

        assertThat(trie.search("aaa")).isFalse();
        assertThat(trie.search("aaaa")).isTrue();
        assertThat(trie.search("aaaaaa")).isTrue();
        assertThat(trie.startsWith("aaaaab")).isTrue();
        assertThat(trie.search("aaaaaaaa")).isFalse();
        assertThat(trie.startsWith("aaaaaaaa")).isFalse();
    }
}
