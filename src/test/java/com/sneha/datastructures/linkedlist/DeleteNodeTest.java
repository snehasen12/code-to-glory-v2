package com.sneha.datastructures.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DeleteNodeTest {

    @Test
    public void delete_node_linkedlist_test(){
        ListNode node = new ListNode(4);
        List<List<Number>> list = Arrays.asList(Arrays.asList(4,5,1,9));
        Assert.assertEquals(node.getData(),4);
    }
}
