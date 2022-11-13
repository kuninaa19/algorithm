package me.algorithm.week7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CloneGraphTest {

    private CloneGraph cloneGraph;

    @BeforeEach
    void setUp() {
        cloneGraph = new CloneGraph();
    }

    @Test
    void 순회모델() {
        Node init = new Node(1);
        Node init2 = new Node(2);
        Node init3 = new Node(3);
        Node init4 = new Node(4);

        init.neighbors = new ArrayList<>(Arrays.asList(init2, init4));
        init2.neighbors = new ArrayList<>(Arrays.asList(init, init3));
        init3.neighbors = new ArrayList<>(Arrays.asList(init2, init4));
        init4.neighbors = new ArrayList<>(Arrays.asList(init, init3));

        Node result = cloneGraph.cloneGraph(init);

        assertThat(result).usingRecursiveComparison().isEqualTo(init).isNotSameAs(init);
    }

    @Test
    void 인접노드_없음(){
        Node init = new Node(1);

        Node result = cloneGraph.cloneGraph(init);

        assertThat(result).usingRecursiveComparison().isEqualTo(init).isNotSameAs(init);
    }

    @Test
    void 노드_없음(){
        Node result = cloneGraph.cloneGraph(null);

        assertThat(result).isNull();
    }
}
