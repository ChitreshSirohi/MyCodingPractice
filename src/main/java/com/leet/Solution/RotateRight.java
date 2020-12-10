package com.leet.Solution;

import com.leet.Solution.util.ListNode;

public class RotateRight {
    public ListNode rotateRight(final ListNode head, int k){
        int size = head != null ? 1 :0;
        if(size == 0){
            return null;
        }
        ListNode temp = head;
        while(temp.next != null){
            size++;
            temp = temp.next;
        }
        int actualMoves = k%size;
        if(actualMoves == 0){
            return head;
        }
        ListNode subListHead = head;
        ListNode leaf = null;
        for(int ctr=0;ctr<size - actualMoves;ctr++){
            if(ctr + 1 == size - actualMoves){
                leaf = subListHead;
                subListHead = subListHead.next;
                leaf.next = null;

            } else {
                subListHead = subListHead.next;
            }
        }
        ListNode resultListHead = subListHead;
        while(subListHead.next != null){
            subListHead = subListHead.next;
        }
        subListHead.next=head;
        return resultListHead;
    }
}
