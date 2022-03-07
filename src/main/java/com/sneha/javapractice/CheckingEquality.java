package com.sneha.javapractice;

import java.util.*;

public class CheckingEquality {
    public static void main(String[] args){
        CheckingEquality n = new CheckingEquality();
        n.Checker();
    }

    public void Checker(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("a is greater than b.");
        }else if(a == b){
            System.out.println("a is equal to b i.e. a = b");
        }else{
            System.out.println("a is lesser than b.");
        }
    }
}
