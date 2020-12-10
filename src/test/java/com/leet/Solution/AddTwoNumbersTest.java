package com.leet.Solution;

import com.leet.Solution.util.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.StringTokenizer;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
         String n1 = "1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1";
         String n2 = "5,6,4";
         String expectedresult = "6640000000000000000000000000001";
        final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
         String result = getStringFromNode(addTwoNumbers.addTwoNumbers(getRootNode(n1), getRootNode(n2)));
        Assert.assertEquals(expectedresult,result );

         n1 = "1";
         n2 = "9,9";
         expectedresult = "001";
         result = getStringFromNode(addTwoNumbers.addTwoNumbers(getRootNode(n1), getRootNode(n2)));
        Assert.assertEquals(expectedresult,result );
    }

    private ListNode getRootNode(final String number){
        final StringTokenizer tokenizer = new StringTokenizer(number, ",");
        ListNode root=null;
        ListNode nextNode = null;
        while(tokenizer.hasMoreTokens()){
            ListNode tempNode = new ListNode(Integer.parseInt(tokenizer.nextToken()));
            if(root == null) {
                root = nextNode = tempNode;
            }else {
                nextNode.next=tempNode;
                nextNode = nextNode.next;
            }
        }
        return root;
    }

    private String getStringFromNode( ListNode listNode){
        final StringBuilder str= new StringBuilder();
        while(listNode != null){
            str.append(listNode.val);
            listNode = listNode.next;
        }
        return str.toString();
    }
}