package com.sneha.javapractice;

import java.util.*;
public class TestJavaArray {
    public static void main(String[] args) {
        int i;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements :");
        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
