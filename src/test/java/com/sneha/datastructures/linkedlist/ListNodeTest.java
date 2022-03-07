package com.sneha.datastructures.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class ListNodeTest {

    @Test
    public void list_node_object_creation_getter_test(){
        ListNode node = new ListNode(10);
        Assert.assertEquals(node.getData(),10);
    }
}
