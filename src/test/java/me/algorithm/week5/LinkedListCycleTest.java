package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListCycleTest {
    @Test
    @DisplayName("링크드리스트가 1번노드를 헤드로 사이클")
    void testCycleLinkedList() {
        ListNode headNode = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(4);
        headNode.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        boolean result = LinkedListCycle.hasCycle(headNode);

        assertThat(result).isEqualTo(true);
    }

    @Test
    @DisplayName("링크드리스트가 사이클 아님")
    void testNotCycleLinkedList() {
        ListNode headNode = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        headNode.next = node1;
        node1.next = node2;

        boolean result = LinkedListCycle.hasCycle(headNode);

        assertThat(result).isEqualTo(false);
    }
}
