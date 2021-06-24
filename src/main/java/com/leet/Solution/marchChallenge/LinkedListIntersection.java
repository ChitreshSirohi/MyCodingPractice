package com.leet.Solution.marchChallenge;

import com.leet.Solution.util.ListNode;

public class LinkedListIntersection {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB== null) {
                return null;
            }
            if(headA == headB)
            {
                return headA;

            }
            ListNode nodeA =  headA;
            ListNode nodeB = headB;
            while (nodeA != null){
                final ListNode node = nodeA;
                while(nodeB != null){
                    final ListNode node1 = nodeB;
                    if(node == node1){
                        return node;
                    }
                    nodeB=node1.next;
                }
                nodeB=headB;
                nodeA = node.next;
            }
            return null;
        }

}
