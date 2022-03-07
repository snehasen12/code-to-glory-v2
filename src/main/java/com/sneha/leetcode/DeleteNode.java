package com.sneha.leetcode;

import com.sneha.datastructures.linkedlist.ListNode;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
