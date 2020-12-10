package com.leet.Solution;

import com.leet.Solution.util.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RotateRightTest {

    @Test
    public void rotateRight() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        RotateRight rotateRight = new RotateRight();

        final ListNode expected = rotateRight.rotateRight(node1, 7);
        final String result = getList(expected);
        String expectedStr = "4->5->1->2->3->NULL";
        assertEquals(expectedStr,result);

    }

    private String getList(ListNode listNode){
        StringBuilder stringBuilder = new StringBuilder();

        while(listNode.next != null){
            stringBuilder.append(listNode.val + "->");
            listNode = listNode.next;
        }
        return stringBuilder.append(listNode.val +"->NULL").toString();
    }
}