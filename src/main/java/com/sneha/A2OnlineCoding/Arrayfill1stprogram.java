package com.sneha.A2OnlineCoding;

import java.util.*;
public class Arrayfill1stprogram{
    //System.out.println("Enter the size of the array:");
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array is:");
        int V = sc.nextInt();
        int N[] = new int[4];

//        System.out.println("Enter the array elements:");
//        for (int i = 0; i < N.length; i++) {
//                N[i] = sc.nextInt();
//        }
        //int X = 2*V;
        int X[] = new int[4];
        System.out.println("The array is:");
        //while(V==1){
            for(int i=0;i<N.length;i++) {
                System.out.println(V);
                //V++;
            //}
            //System.out.println("N["+i+"]"+"="+X[i]);
        }
        for(int i=0;i<N.length;i++){
            System.out.println("N["+i+"]"+"="+X[i]);
        }
    }
}
