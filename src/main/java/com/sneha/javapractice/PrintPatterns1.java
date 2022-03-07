package com.sneha.javapractice;
import java.util.*;
public class PrintPatterns1 {
    public static void main(String[] args) {
        PrintPatterns1 m = new PrintPatterns1();
        m.Patterns1();
    }

    public void Patterns1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        System.out.println("Enter the value of m:");
        int m = sc.nextInt();

        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print(" *");
                }else{
                    System.out.print(" ");
                }
                //System.out.println();
            }
            System.out.println();
        }
    }
}

