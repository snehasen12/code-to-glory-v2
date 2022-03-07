package com.sneha.sample;
import java.util.Scanner;
public class Java_studentspercentage {
    public static void main(String[] args) {
        float sum;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the full_marks:");
        float fm=s.nextFloat();
        //System.out.println(fm);
        System.out.println("Enter the marks of 1st subject:");
        float sub1=s.nextFloat();
        //System.out.println(sub1);
        System.out.println("Enter the marks of 2nd subject:");
        float sub2=s.nextFloat();
        //System.out.println(sub2);
        System.out.println("Enter the marks of 3rd subject:");
        float sub3=s.nextFloat();
       // System.out.println(sub3);
        System.out.println("Enter the marks of 4th subject:");
        float sub4=s.nextFloat();
        //System.out.println(sub4);
        System.out.println("Enter the marks of 5th subject:");
        float sub5=s.nextFloat();
        //System.out.println(sub5);
       // int total_marks;
        //total_marks=fm*5;
        //System.out.println(total_marks);
        sum=(sub1+sub2+sub3+sub4+sub5);
        float average,percentage;
        average=sum/(fm*5);
        percentage=average*100;
        System.out.println("The total sum of the 5 subjects is:"+sum);
        System.out.println("The average is:"+average);
        System.out.println("The percentage of a student in the CBSE board is:"+percentage);
    }
}
