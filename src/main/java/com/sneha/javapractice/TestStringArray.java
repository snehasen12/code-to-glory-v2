package com.sneha.javapractice;
import java.util.*;
public class TestStringArray {
    public static void main(String[] args) {
        String[] arr = new String[5];
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string array elements:");

        for (i=0;i<arr.length;i++){
            arr[i] = sc.next();
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println("The string elements are:");

        for (i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
