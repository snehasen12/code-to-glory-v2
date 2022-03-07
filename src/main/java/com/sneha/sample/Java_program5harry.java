package com.sneha.sample;
import java.util.Scanner;
public class Java_program5harry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        boolean a=sc.hasNextInt();
        if(a){
            System.out.println("The entered number is integer.");
        }
        else{
            System.out.println("The entered number is not integer.");
        }
    }
}