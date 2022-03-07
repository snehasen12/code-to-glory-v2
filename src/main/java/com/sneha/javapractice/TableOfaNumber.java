package com.sneha.javapractice;
import java.util.*;
public class TableOfaNumber {
    public static void main(String[] args) {
        TableOfaNumber n = new TableOfaNumber();
        n.Table();
    }

    public void Table(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for the table:");
        int n = sc.nextInt();

        System.out.println("Enter a number:");
        int s = sc.nextInt();

        for(int i=1;i<s;i++){
            int result = (n*i);
            System.out.println(result);
        }
;    }
}
