package me.algorithm.week6;

import me.algorithm.week5.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseLinkedListTest {
    @Test
    void headNode_reverse를_수행() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode result = ReverseLinkedList.reverseList(head);

        assertThat(head.val).isEqualTo(result.next.next.val);
    }

    @Test
    void 단일_headNode는_reverse_역시_원래값과_동일() {
        ListNode head = new ListNode(1);

        ListNode result = ReverseLinkedList.reverseList(head);

        assertThat(head.val).isEqualTo(result.val);
        assertThat(head.next).isEqualTo(result.next);
    }

    @Test
    void headNode에_값이_없음() {
        ListNode node = null;
        ListNode result = ReverseLinkedList.reverseList(node);

        assertThat(node).isEqualTo(result);
    }
}
