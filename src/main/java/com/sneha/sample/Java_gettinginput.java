package com.sneha.sample;
import java.util.Scanner;
public class Java_gettinginput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       //  System.out.print("Enter the number 1:");
       // int a=s.nextInt();
       // System.out.print("Enter the number 2:");
       // int b=s.nextInt();
       // System.out.println(b);
       // System.out.println(a);
       // int sum;
       // sum=a+b;
       // System.out.print("The sum is:"+sum);
       // String a=s.next();// This prints a single word starting of the sentence.It does not prints the full sentence
        // System.out.println(a);
      //  String b=s.nextLine();
      //  System.out.println(b);
        boolean c=s.hasNextInt();
        System.out.println(c);
    }
}
