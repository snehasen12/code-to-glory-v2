package com.sneha.datastructure;

public class DeleteTheFirstElement {

    private LinkedListNode head = null;
    private LinkedListNode tail = null;
    private int size;

    class LinkedListIterator {
        LinkedListNode currentNode;

        private LinkedListIterator(LinkedListNode startingNode) {
            this.currentNode = startingNode;
        }

        public boolean hasNext() {
            return !(currentNode == null);
        }

        public int getNext() {
            if (hasNext()) {
                int result = currentNode.getData();
                currentNode = currentNode.getNext();
                return result;
            }
            return -1;
        }
    }


    public LinkedListNode deleteAtFront(){
        if (head == null){
            return head;
        }

        return head.getNext();
    }

    public void insertAtEnd(int data){
        LinkedListNode node = new LinkedListNode(data);

        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public int getSize(){

        return size;
    }

    public LinkedListIterator iterator(){

        return new LinkedListIterator(head);
    }
}
