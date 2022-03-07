package com.sneha.javapractice;
import java.util.*;
public class PrintPatterns3 {
    public static void main(String[] args) {
        PrintPatterns3 i = new PrintPatterns3();
        i.Patterns3();
    }

    public void Patterns3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
