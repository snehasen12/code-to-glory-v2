package com.sneha.CodechefPracticeJava;
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Problem1 ss = new Problem1();
        ss.Prob1();
    }

    public void Prob1(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total amount of transaction:");
        float t_amnt = sc.nextFloat();

        System.out.println("Enter the value of X i.e. the amount of cash to be withdrawn:");
        int X = sc.nextInt();

        if((X%5 == 0) && (X<t_amnt)){
            System.out.println("Correct Withdrawal amount.");
            float s = t_amnt-X;
            s= (float) (s-0.5);
            System.out.println(s);
            System.out.println("Successful Transaction.");
        }
        else if((X%5)!=0){
            System.out.println("Incorrect Withdrawal Amount.");
            System.out.println(t_amnt);
        }
        else if((X%5 == 0) && (X>t_amnt)){
            System.out.println("Insufficient Funds.");
            System.out.println(t_amnt);
        }
    }
}
