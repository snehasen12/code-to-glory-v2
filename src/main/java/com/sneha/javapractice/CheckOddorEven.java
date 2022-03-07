package com.sneha.javapractice;

import java.util.*;

public class CheckOddorEven {
    public static void main(String[] args){
        CheckOddorEven i = new CheckOddorEven();
        i.OddorEven();
    }

    public void OddorEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i =sc.nextInt();

        if (i%2 == 0){
            System.out.println("The given number is Even");
        }else{
            System.out.println("The number is Odd");
        }
    }
}
