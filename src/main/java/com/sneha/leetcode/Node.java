package com.sneha.leetcode;

public class Node {
    //public int val; // pojo-ListNode
    //private Node next;
    public int data; //access modifier-private,data type-integer,variable name-data
    private com.sneha.datastructures.linkedlist.ListNode next;

    public Node(int data) { //Code Generator,here we create a constructor

        this.data = data;
    }

    public int getData() { //method name starts with small letter and then with camel case

        return data;
    }
    //public void setData(int data) {
    //this.data = data;
    //}

    public com.sneha.datastructures.linkedlist.ListNode getNext() {

        return next;
    }

    public void setNext(com.sneha.datastructures.linkedlist.ListNode next) { //nothing to be returned-we have to use void data type

        this.next = next;
    }
}
