package com.sneha.sample;

import java.util.Scanner;
public class Datatype_Increment_DecrementOperators {
    public static void main(String[] args) {
        //int a=7,sum=0;
        //System.out.println(a++);
        //System.out.println(a);
        //int b=9;
        //System.out.println(++b);
        //sum=a+b;
        //System.out.println(sum);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of x:");
        int x=sc.nextInt();
        System.out.println("Enter the number of y:");
        int y=sc.nextInt();
        y=++y*x;
        System.out.println(y);
    }
}
