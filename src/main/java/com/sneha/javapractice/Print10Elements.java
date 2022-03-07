package com.sneha.javapractice;
import java.util.*;
public class Print10Elements {
    public static void main(String[] args){
        Print10Elements n = new Print10Elements();
        n.PrintElements();
    }

    //public void PrintElements() {
    //    int count = 0;
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter the number:");
    //    int n = sc.nextInt();
    //    System.out.println(count);
    //   for (int i = 1; i < n; i++) {
    //        count = count + 1;
    //        System.out.println(count);
    //    }
    //}
    //public void PrintElements() {
    //    int count = 0;
    //    int i=0;
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter the number:");
    //    int n = sc.nextInt();
    //    System.out.println(count);
    //    while(i<n-1) {
    //        count = count + 1;
    //        System.out.println(count);
    //        i++;
    //    }
    //}
    public void PrintElements() {
        int count = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(count);
        do {
            count = count + 1;
            System.out.println(count);
            i++;
        }while(i<n-1);
    }
}
