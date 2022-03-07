package com.sneha.javapractice;
import java.util.*;
public class HelloWorldPrint {
    public static void main(String[] args){
        HelloWorldPrint n = new HelloWorldPrint();
        n.PrintStatement();
    }

    public void PrintStatement(){
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            System.out.println("Hello World!");
            count++;
        }
    }
}
