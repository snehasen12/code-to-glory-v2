package com.sneha.datastructures.linkedlist;

import com.sneha.leetcode.BinaryToInteger;
import org.junit.Assert;
import org.junit.Test;

public class BinaryToIntegerTest {

    @Test
    public void binary_to_integer_creation_linkedlist_test() {
        //10110->22
        BinaryToInteger bi = new BinaryToInteger();

        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        node2.setNext(node1);
        ListNode node3 = new ListNode(1);
        node3.setNext(node2);
        ListNode node4 = new ListNode(0);
        node4.setNext(node3);
        ListNode head = new ListNode(1);
        head.setNext(node4);
        Assert.assertEquals(bi.getDecimalValue(head),22);
    }
}