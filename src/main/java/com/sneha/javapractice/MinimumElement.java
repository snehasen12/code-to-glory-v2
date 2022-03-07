package com.sneha.javapractice;
import java.util.*;
public class MinimumElement {
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

        //System.out.println(Arrays.toString(a));
        int min = a[0];
        System.out.println("The minimum element is:");
        for(i=0;i<a.length-1;i++){
            if(a[i+1] < min){
                min = a[i + 1];
                System.out.println(min);
            }
        }
    }
}
