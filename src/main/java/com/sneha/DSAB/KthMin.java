package com.sneha.DSAB;
import java.util.*;
class Min{
    public void kthMin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int s = sc.nextInt();

        int[] arr = new int[s];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //System.out.println("The array elements are:");
        //for(int i=0;i< arr.length;i++){
        //   System.out.println(arr[i]);
        //}

        Arrays.sort(arr);
        System.out.println("The sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Enter the value of K:");
        int k=sc.nextInt();
        int r=k-1;
        System.out.println("The minimum element is:"+arr[r]);
    }
}
public class KthMin {
    public static void main(String[] args) {
        Min d = new Min();
        d.kthMin();
    }
}
