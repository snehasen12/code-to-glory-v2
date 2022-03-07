package com.sneha.javapractice;
import java.util.*;
public class PrintPatterns {
    public static void main(String[] args) {
        PrintPatterns n = new PrintPatterns();
        n.Patterns();
    }

    public void Patterns(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        System.out.println("Enter the value of m:");
        int m = sc.nextInt();

        System.out.println("The pattern is:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}
