package com.sneha.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void checking_inserting_node_at_front(){
        LinkedList list = new LinkedList();

        list.insertAtFront(10);
        Assert.assertEquals(list.getSize(),1);

        list.insertAtFront(20);
        Assert.assertEquals(list.getSize(),2);
    }

}
