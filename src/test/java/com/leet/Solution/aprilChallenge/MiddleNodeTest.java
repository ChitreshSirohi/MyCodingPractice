package com.leet.Solution.aprilChallenge;

import com.leet.Solution.util.ListNode;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MiddleNodeTest {

    @Test
    public void middleNode() {
        final ListNode ln1 = new ListNode(1);
        final ListNode ln2 = new ListNode(2);
        final ListNode ln3 = new ListNode(3);
        final ListNode ln4 = new ListNode(4);
        final ListNode ln5 = new ListNode(5);
        final ListNode ln6 = new ListNode(6);
        ln1.setNext(ln2);
        ln2.setNext(ln3);
        ln3.setNext(ln4);
        ln4.setNext(ln5);
        final MiddleNode middleNode = new MiddleNode();
        assertThat(middleNode.middleNode(ln1).getVal()).isEqualTo(3);
        ln5.setNext(ln6);
        assertThat(middleNode.middleNode(ln1).getVal()).isEqualTo(4);
    }
}