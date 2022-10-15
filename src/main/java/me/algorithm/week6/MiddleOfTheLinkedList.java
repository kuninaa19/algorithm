package me.algorithm.week6;

import me.algorithm.week5.ListNode;

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode middleNode = head;
        int i = 1;

        while (head != null) {
            head = head.next;

            if (i % 2 == 0) {
                middleNode = middleNode.next;
            }

            i++;
        }
        return middleNode;
    }

    /**
     * fast는 2칸 slow는 1칸씩 이동 ( 투포인터 )
     * fast는 두칸씩 움직이기때문에 마지막 노드에 도달하기 전 2칸씩 이동을 하면 null을 반환하게 된다.(짝수의 경우)
     * 일단 null 이더라도 저장을 하고 slow를 이동시킨다.
     * 그리고 while 조건에 의해 반복문이 종료된다.
     */
    public static ListNode anotherSolution(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
