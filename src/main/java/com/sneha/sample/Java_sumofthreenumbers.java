package com.sneha.sample;
import java.util.Scanner;
public class Java_sumofthreenumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd number:");
        int c=sc.nextInt();
        int sum;
        sum=a+b+c;
        System.out.println("The sum of the three numbers is:"+sum);
    }
}
