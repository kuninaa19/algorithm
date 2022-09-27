package me.algorithm.week6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ImplementQueueUsingStacksTest {
    @Test
    @DisplayName("예제 테스트 케이스")
   void testCase() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        assertThat(myQueue.peek()).isEqualTo(1); // return 1
        assertThat(myQueue.pop()).isEqualTo(1); // return 1, queue is [2]
        assertThat(myQueue.empty()).isEqualTo(false); // return false
    }
}
