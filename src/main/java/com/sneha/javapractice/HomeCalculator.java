package com.sneha.javapractice;
import java.util.*;
public class HomeCalculator {
    public static void main(String[] args) {
        HomeCalculator n = new HomeCalculator();
        n.Calculator();
    }
    public void Calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        System.out.println("Enter the operator number:");
        int operator = sc.nextInt();

        switch(operator){
            case 1:
                System.out.println("The result of the addition is:"+(a+b));
                break;
            case 2:
                System.out.println("The of the subtraction is:"+(a-b));
                break;
            case 3:
                System.out.println("The result of the multiplication is:"+(a*b));
                break;
            case 4:
                System.out.println("The result of the division is:"+(float)(a/b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

}
