package com.sneha.javapractice;
import java.util.*;
public class ReverseTheArray {
    public static void main(String[] args) {
        int[] r = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements:");

        for(i=0;i<r.length;i++){
            r[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");
        for (i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
        System.out.println("\n");
        System.out.println("The reverse of the array elements are:");
        for(i=r.length-1;i>=0;i--){
            System.out.print(r[i]+" ");
        }
    }
}
