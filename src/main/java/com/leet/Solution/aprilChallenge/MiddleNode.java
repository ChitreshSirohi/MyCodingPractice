package com.leet.Solution.aprilChallenge;

import com.leet.Solution.util.ListNode;

import java.util.HashMap;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode temp = head;
        int ctr=0;
        while (temp != null){
            ctr++;
            map.put(ctr, temp);
            temp = temp.next;
        }
       // ctr++; // for the last node
        return map.get(ctr/2+1);
    }
}
