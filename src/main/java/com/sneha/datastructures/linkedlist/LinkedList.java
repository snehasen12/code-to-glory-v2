package com.sneha.datastructures.linkedlist;

public class LinkedList {

    private ListNode head = null;

    private ListNode tail =null;
    //private ListNode tail = null;
    //this.tail = null;

    /*public LinkedList() {

        this.head = null;
    }*/

    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);

        if (head != null) {
            newNode.setNext(head);
        }
        this.head = newNode;
    }

    public void insertItemAtEnd(int data){
        ListNode newN = new ListNode(data);

        if(head == null){
            head = newN;
            tail = newN;
        }else{
            tail.next = newN;
            tail = newN;
        }
    }
}

