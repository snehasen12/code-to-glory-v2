package com.sneha.javapractice;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the size of an array is:");
        int size = ss.nextInt();

        int[] a = new int[size];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements:");

        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");
        for (i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        int max = a[0];
        for(i=1;i< a.length;i++){
           if(max<a[i]){
               max = a[i];
               //System.out.println(max);
           }
        }
        System.out.println("The maximum element of the array is:"+max);
    }
}
