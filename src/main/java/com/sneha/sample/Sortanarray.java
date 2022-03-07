package com.sneha.sample;
import java.util.Arrays;
import java.util.Scanner;

public class Sortanarray {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("The number of array elements are, which we want to insert:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values:");
        for(i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The elements in the array after sorting is:");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
