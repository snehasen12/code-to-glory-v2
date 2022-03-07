package com.sneha.datastructures.linkedlist;

public class ListNode {
    public int data; // pojo-ListNode
    public ListNode next;
    //private ListNode n;

    //private int data; //access modifier-private,data type-integer,variable name-data

    public ListNode(int data) { //Code Generator,here we create a constructor

        this.data = data;
    }

    public int getData() { //method name starts with small letter and then with camel case

        return data;
    }
    //public void setData(int data) {
        //this.data = data;
    //}

    public ListNode getNext() {

        return next;
    }

    public void setNext(ListNode next) { //nothing to be returned-we have to use void data type

        this.next = next;
    }
}
