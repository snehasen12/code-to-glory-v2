package com.sneha.javapractice;
import java.util.*;
public class PrintPatterns2 {
    public static void main(String[] args) {
        PrintPatterns2 i = new PrintPatterns2();
        i.Patterns2();
    }

    public void Patterns2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
