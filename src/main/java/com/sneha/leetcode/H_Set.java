package com.sneha.leetcode;
import java.util.HashSet;

public class H_Set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(7);
        myHashSet.add(8);
        myHashSet.add(45);
        myHashSet.add(12);
        System.out.println(myHashSet);

    }
}
