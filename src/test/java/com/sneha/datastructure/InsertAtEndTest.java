package com.sneha.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class InsertAtEndTest {

    @Test
    public void checking_insert_a_node_at_end(){
        InsertAtEnd list = new InsertAtEnd();

        list.insertAtEnd(20);
        list.insertAtEnd(10);


        //list.insertAtEnd(10);
        //Assert.assertEquals(list.getSize(),1);

        //list.insertAtEnd(14);
        //Assert.assertEquals(list.getSize(),2);
        final InsertAtEnd.LinkedListIterator iterator = list.iterator();

        Assert.assertEquals(iterator.hasNext(),true);
        Assert.assertEquals(iterator.getNext(),20);

        Assert.assertEquals(iterator.hasNext(),true);
        Assert.assertEquals(iterator.getNext(),10);

        Assert.assertEquals(iterator.hasNext(),false);
    }
}
