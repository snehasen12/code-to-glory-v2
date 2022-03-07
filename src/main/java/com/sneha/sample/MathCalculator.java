package com.sneha.sample;

import java.util.Scanner;
public class MathCalculator{
    double no1;
    double no2;
    MathCalculator(double a,double b){
        no1=a;
        no2=b;
    }
    void setvalue(double a,double b) {
        no1=a;
        no2=b;
    }
    double add(){
        return no1+no2;
    }
    double sub(){
        return no1-no2;
    }
    void display(){
        System.out.println("The result of addition is:"+this.add());
        System.out.println("The result of subtraction is:"+this.sub());
    }
}
class CheckMath {
    public static void main(String[] args) {
        MathCalculator m = new MathCalculator(7,6);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double x=sc.nextInt();
        System.out.println("Enter the value of b:");
        double y=sc.nextInt();
        m.setvalue(x,y);
        m.display();
    }
}
