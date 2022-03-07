package com.sneha.javapractice;
import java.util.*;
public class ToStringJavaArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for (i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

    }
}
