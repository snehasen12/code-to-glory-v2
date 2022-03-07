package com.sneha.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class DeleteTheFirstElementTest {

    @Test
    public void checking_delete_node_at_front(){
        DeleteTheFirstElement list = new DeleteTheFirstElement();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        //list.insertAtEnd(30);
        list.deleteAtFront();

        final DeleteTheFirstElement.LinkedListIterator iterator = list.iterator();

        Assert.assertEquals(iterator.hasNext(),true);
        Assert.assertEquals(iterator.getNext(),10);

        list.deleteAtFront();

        Assert.assertEquals(iterator.hasNext(),false);
        //list.insertAtEnd(10);
        //Assert.assertEquals(list.getSize(),1);

        //list.insertAtEnd(20);
        //Assert.assertEquals(list.getSize(),2);

        //list.insertAtEnd(30);
        //Assert.assertEquals(list.getSize(),3);

    }
}
