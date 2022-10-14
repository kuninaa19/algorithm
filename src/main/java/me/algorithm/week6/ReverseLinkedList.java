package me.algorithm.week6;

import me.algorithm.week5.ListNode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode reverseHead = new ListNode(head.val);
        ListNode tempHead = head.next;

        while (tempHead != null) {
            reverseHead = new ListNode(tempHead.val, reverseHead);

            tempHead = tempHead.next;
        }

        return reverseHead;
    }
}
