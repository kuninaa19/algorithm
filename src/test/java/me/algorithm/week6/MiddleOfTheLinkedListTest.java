package me.algorithm.week6;

import me.algorithm.week5.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiddleOfTheLinkedListTest {
    @Test
    void 홀수개_노드_가운데_노드_출력() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = MiddleOfTheLinkedList.middleNode(head);

        assertThat(result).isEqualTo(head.next.next);
    }

    @Test
    void 짝수개_노드_가운데_노드_출력() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode result = MiddleOfTheLinkedList.middleNode(head);

        assertThat(result).isEqualTo(head.next.next);
    }


    @Test
    void 단일노드() {
        ListNode head = new ListNode(1);
        ListNode result = MiddleOfTheLinkedList.middleNode(head);

        assertThat(result).isEqualTo(head);
    }
}
