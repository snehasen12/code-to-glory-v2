package com.sneha.javapractice;
import java.util.*;
public class SumOfNaturalNos {
    public static void main(String[] args){
        SumOfNaturalNos n = new SumOfNaturalNos();
        n.Sum();
    }

    public void Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum=0,i=0;
        while(i<=n-1){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of the first n natural numbers is:"+sum);

    }
}
