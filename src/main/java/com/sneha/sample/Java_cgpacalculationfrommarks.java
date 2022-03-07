package com.sneha.sample;
import java.util.Scanner;
public class Java_cgpacalculationfrommarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of 1st subject:");
        float a= sc.nextFloat();
        System.out.println("Enter the marks of 2nd subject:");
        float b=sc.nextFloat();
        System.out.println("Enter the marks of 3rd subject:");
        float c=sc.nextFloat();
        float sum;
        sum=a+b+c;
        float percentage=sum/3;
        System.out.println("The percentage of a student is:"+percentage);
        float CGPA;
        CGPA=percentage/10;
        System.out.println("The CGPA of a student is:"+CGPA);
    }
}
