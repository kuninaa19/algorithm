package me.algorithm.week5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListCycle {
    /** 투포인터 형식 진행
     * 예시
     * 노드가 총 3개일때
     * 1의 노드가 2씩 이동, 2의 노드가 1씩 이동
     * 1이 2번 회전하고 2가 1번 회전하는 순간 동일한 노드를 가리키게 된다.
     * 이를 통해 원형 리스트가 구현되었다는 것을 알 수 있다.
     * */
    public static boolean hasCycleImproved(ListNode head){
        ListNode slow = head;
        if (head == null) {
            return false;
        }
        ListNode fast = head.next;
        while (fast != null && slow != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            }
            else {
                return false;
            }
        }
        return false;
    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<ListNode>();

        while (head != null) {
            if (!nodeSet.add(head)) {
                return true;
            }
            head = head.next;
        }

        return false;
    }
}
