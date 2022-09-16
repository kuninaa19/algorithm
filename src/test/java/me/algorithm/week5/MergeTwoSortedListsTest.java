package me.algorithm.week5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedListsTest {
    @Test
    @DisplayName("기본 예시 노드")
    void testExampleNode() {
        ListNode list1 = new ListNode(1);
        ListNode list1children1 = new ListNode(2);
        ListNode list1children2 = new ListNode(4);
        list1.next = list1children1;
        list1children1.next = list1children2;

        ListNode list2 = new ListNode(1);
        ListNode list2children1 = new ListNode(3);
        ListNode list2children2 = new ListNode(4);
        list2.next = list2children1;
        list2children1.next = list2children2;

        ListNode result = MergeTwoSortedLists.mergeTwoListsImproved(list1, list2);

        int[] resultArr = MergeTwoSortedLists.convertToArray(result, new ArrayList<Integer>());
        int[] expectedArr = new int[]{1, 1, 2, 3, 4, 4};

        assertArrayEquals(expectedArr, resultArr);
    }

    @Test
    @DisplayName("하나의 노드는 빈 객체")
    void testOneNodeEmpty() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);

        ListNode list2 = new ListNode();
        System.out.println(list2.val);

        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        int[] resultArr = MergeTwoSortedLists.convertToArray(result, new ArrayList<Integer>());
        int[] expectedArr = new int[]{0, 1, 2};

        assertArrayEquals(expectedArr, resultArr);
    }

    @Test
    @DisplayName("두 노드 모두 빈 객체")
    void testBothNodeEmpty() {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();

        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        int[] resultArr = MergeTwoSortedLists.convertToArray(result, new ArrayList<Integer>());
        /* 클래스 변수 초기화 0으로 되면서 어쩔 수 없음.*/
        int[] expectedArr = new int[]{0, 0};

        assertArrayEquals(expectedArr, resultArr);

    }

    @Test
    @DisplayName("두 노드 모두 음수값으로 시작")
    void testStartMinusValueBothNode() {
        ListNode list1 = new ListNode(-1);

        ListNode list2 = new ListNode(-2);
        list2.next = new ListNode(0);

        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        int[] resultArr = MergeTwoSortedLists.convertToArray(result, new ArrayList<Integer>());
        int[] expectedArr = new int[]{-2, -1, 0};

        assertArrayEquals(expectedArr, resultArr);
    }

    @Test
    @DisplayName("반복되는 값 존재")
    void testReputativeValue() {
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(2);

        ListNode list2 = new ListNode(2);

        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);

        int[] resultArr = MergeTwoSortedLists.convertToArray(result, new ArrayList<Integer>());
        int[] expectedArr = new int[]{2, 2, 2};

        assertArrayEquals(expectedArr, resultArr);
    }
}
