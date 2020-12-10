package com.leet.Solution.JuneChallenge;

import com.leet.Solution.util.ListNode;

public class DeleteLinkedListNode {
    public void deleteNode(ListNode node) {
        ListNode currentNode = node;
        if (currentNode.next != null) {
            currentNode.val = currentNode.next.val;
            if(currentNode.next.next != null) {
                currentNode.next = currentNode.next.next;
            }else {
                currentNode.next = null;
            }
        }
    }
}


