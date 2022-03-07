package com.sneha.datastructure;

public class LinkedList {

    private LinkedListNode head;
    private int size = 0;

    class LinkedListIterator{
        LinkedListNode currentNode;

        private LinkedListIterator(LinkedListNode startingNode){
            this.currentNode = startingNode;
        }

        public boolean hasNext(){
            return !(currentNode == null);
        }
        public int getNext(){
            if(hasNext()){
                int result = currentNode.getData();
                currentNode = currentNode.getNext();
                return result;
            }
            return -1;
        }
    }

    public void insertAtFront(int data){
        LinkedListNode node = new LinkedListNode(data);

        if(head != null){
            node.setNext(head);
        }
        head =node;
        size++;
    }

    public int getSize(){

        return size;
    }

}
