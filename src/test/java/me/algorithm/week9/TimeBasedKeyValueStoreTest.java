package me.algorithm.week9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TimeBasedKeyValueStoreTest {

    private TimeMap obj;

    @BeforeEach
    void setUp() {
        obj = new TimeMap();
    }

    @Test
    void 중복저장_조회() {
        obj.set("foo", "bar", 1);
        obj.set("foo", "bar2", 4);
        obj.set("foo2", "bar3", 5);

        assertThat(obj.get("foo", 7)).isEqualTo("bar2");
    }

    @Test
    void 특정_키_저장_타임스탬프보다_낮은_값_조회() {
        obj.set("foo", "bar", 1);
        obj.set("foo2", "bar6", 8);
        obj.set("foo", "bar4", 10);

        assertThat(obj.get("foo", 3)).isEqualTo("bar");
    }

    @Test
    void 특정_키_저장_타임스탬프보다_큰_값_조회() {
        obj.set("foo", "bar", 1);
        obj.set("foo2", "bar1", 8);
        obj.set("foo", "bar2", 10);
        obj.set("foo", "bar3", 12);

        assertThat(obj.get("foo", 13)).isEqualTo("bar3");
    }
}
