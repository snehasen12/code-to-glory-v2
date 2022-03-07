//package com.sneha.sample;

class Node {
    int data;
    Node next;
}
class LinkedList {

        private Node getNewNode(int value){
            Node newNode=new Node();
            newNode.data=value;
            newNode.next=null;
            return newNode;
        }
        public Node createLL(Node node, int value){
            if(node==null)
                return getNewNode(value);
            Node firstNode=node;
            while(node.next!=null){
                node=node.next;
            }
            node.next=getNewNode(value);
                return firstNode;
        }
        public void print(Node ptr){
            if(ptr==null)
                return;
            while(ptr!=null){
                System.out.println(ptr.data);
                ptr=ptr.next;
            }
        }

}
public class CreationofLinkedList {
    public static void main(String args[]) {
        LinkedList object= new LinkedList();
        Node head=null;
        head=object.createLL(head,12);
        head=object.createLL(head,19);
        head=object.createLL(head,45);
        head=object.createLL(head,13);

        object.print(head);
    }
}
