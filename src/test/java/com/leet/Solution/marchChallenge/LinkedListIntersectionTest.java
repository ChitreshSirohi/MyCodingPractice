package com.leet.Solution.marchChallenge;

import com.leet.Solution.util.ListNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LinkedListIntersectionTest {
    @Test
    public void getIntersectionNodeTest(){
        final LinkedListIntersection linkedListIntersection = new LinkedListIntersection();
        final ListNode intersectionNode = linkedListIntersection.getIntersectionNode(getListNode(new int[]{4, 1, 8, 4, 5}), getListNode(new int[]{5, 6, 1, 8, 4, 5}));
        assertThat(intersectionNode.val).isEqualTo(8);

    }

    public ListNode getListNode(final int[]  arr){
        final ListNode head = new ListNode(arr[0]);
        ListNode lastNode = head;
        for (int i=1;i< arr.length;i++) {
            final ListNode listNode = new ListNode(arr[i]);
            lastNode.next = listNode;
            lastNode = listNode;
        }
        return head;
    }

}