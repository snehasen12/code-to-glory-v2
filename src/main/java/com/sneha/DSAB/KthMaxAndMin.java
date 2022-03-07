package com.sneha.DSAB;
import java.util.*;
public class KthMaxAndMin {
    public void MaxandMin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s = sc.nextInt();

        int[] a = new int[s];
        System.out.println("Enter the array elements:");
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        Arrays.sort(a);
        System.out.println("The sorted array is:");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the value of K:");
        int k = ss.nextInt();
        System.out.println("Enter the value of n for minimum element:");
        int n = ss.nextInt();
        int r=s-k;
        int c=n-1;
        System.out.println("The maximum element is:"+a[r]);
        System.out.println("The minimum element is:"+a[c]);
    }

    public static void main(String[] args) {
        KthMaxAndMin m = new KthMaxAndMin();
        m.MaxandMin();
    }
}
