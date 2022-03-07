package com.sneha.javapractice;

import java.util.*;

public class MaxAndMin {
    public static void main(String[] args) {
        MaximumAndMinimum n = new MaximumAndMinimum();
        System.out.println("The maximum element is:"+n.Maximum());
        System.out.println("The minimum element is:"+n.Minimum());
    }
}

class MaximumAndMinimum{
        int i;
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       public int Maximum() {
           int[] arr = new int[size];
           Scanner ss = new Scanner(System.in);
           System.out.println("Enter the array elements:");
           for (i = 0; i < arr.length; i++) {
               arr[i] = ss.nextInt();
           }
           System.out.println("The array elements are:");

           for (i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
           }
           System.out.println("\n");
           int max = arr[0];
           for (i = 1; i < arr.length; i++) {
               if (max < arr[i]) {
                   max = arr[i];
               }
           }
           return max;
       }

       public int Minimum(){
           int[] a = new int[size];
           Scanner s = new Scanner(System.in);
           System.out.println("Enter the array elements:");
           for (i = 0; i < a.length; i++) {
               a[i] = s.nextInt();
           }
           System.out.println("The array elements are:");

           for (i = 0; i < a.length; i++) {
               System.out.print(a[i] + " ");
           }
           System.out.println("\n");
           int min = a[0];
           for (i = 0; i < a.length-1; i++) {
               if (a[i+1]<min) {
                   min = a[i];
               }
           }
           return min;
       }
}