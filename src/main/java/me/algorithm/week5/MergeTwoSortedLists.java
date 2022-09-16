package me.algorithm.week5;

import java.util.ArrayList;
import java.util.LinkedList;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoListsImproved(ListNode list1, ListNode list2) {
        ListNode headNode = new ListNode();
        ListNode lastNode = headNode;

        /** 비교해야할 대상이 있을때 (리스트 둘다 빈값이 아닐때) */
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                lastNode.next = list1;
                list1 = list1.next;
            } else {
                lastNode.next = list2;
                list2 = list2.next;
            }
            lastNode = lastNode.next;
        }

        if (list1 != null)
            lastNode.next = list1;
        if (list2 != null)
            lastNode.next = list2;

        return headNode.next;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headNode = new ListNode();
        ListNode lastNode = headNode;

        while (list1 != null || list2 != null) {
            ListNode tempNode = lastNode;

            if (list1 == null) {
                lastNode = new ListNode(list2.val);
                tempNode.next = lastNode;

                list2 = list2.next;
            } else if (list2 == null) {
                lastNode = new ListNode(list1.val);
                tempNode.next = lastNode;

                list1 = list1.next;
            } else if (list2.val >= list1.val) {
                lastNode = new ListNode(list1.val);
                tempNode.next = lastNode;

                list1 = list1.next;
            } else {
                lastNode = new ListNode(list2.val);
                tempNode.next = lastNode;

                list2 = list2.next;
            }
        }

        return headNode.next;
    }

    public static int[] convertToArray(ListNode node, ArrayList<Integer> sortedList) {
        if (node == null) {
            return sortedList.stream().mapToInt(i -> i).toArray();
        }
        sortedList.add(node.val);
        return convertToArray(node.next, sortedList);
    }
}