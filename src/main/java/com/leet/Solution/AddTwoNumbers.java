package com.leet.Solution;

import com.leet.Solution.util.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = null;
        ListNode leafNode = null;
        int n1;
        int n2;
        int nodenum;
        int carryOver=0;
        while (l1 != null || l2 != null){
             n1 = l1 == null ? 0 : l1.val;
             n2 = l2 == null ? 0 : l2.val;
             nodenum = (n1+n2+carryOver)%10;
             carryOver = (n1+n2+carryOver)/10;
            if(resultNode == null){
                resultNode = leafNode = addNodeValues(nodenum);
            }else{
                leafNode.next=addNodeValues(nodenum);
                leafNode = leafNode.next;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if(l1 == null && l2 == null && carryOver > 0){
                leafNode.next = addNodeValues(carryOver);
            }
        }
        return resultNode;
    }

    private ListNode addNodeValues(int n){
        return new ListNode(n);
    }


    public static void main(final String[] args){
        final ListNode ln2 = new ListNode(0);
        final ListNode ln3 = new ListNode(0);
        final ListNode ln4 = new ListNode(9);
        ln2.next = ln3;
        ln3.next = ln4;

        final ListNode ln_5 = new ListNode(0);
        final ListNode ln_6 = new ListNode(0);
        final ListNode ln_4 = new ListNode(1);
        ln_5.next = ln_6;
        ln_6.next = ln_4;
        final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(ln2, ln_5);


    }
}
