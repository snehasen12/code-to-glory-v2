package com.sneha.leetcode;

import com.sneha.datastructures.linkedlist.ListNode;

import java.util.Stack;

public class BinaryToInteger {
    public int getDecimalValue(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.getData());
            head = head.getNext();
        }
        int result = 0;
        int counter = 0;
        while(!stack.isEmpty()){
            Integer data = stack.pop();
            int partialResult = 2*data;
            if(partialResult != 0){
                result = (int)Math.pow(2*data,counter)+result;
            }
            ++counter;
        }
        return result;
    }
}
