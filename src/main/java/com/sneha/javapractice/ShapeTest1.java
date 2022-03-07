package com.sneha.javapractice;
import java.util.*;
interface A{
    int a=5;
    public abstract void p();
}

abstract class Shape{
    double area;
    public static final double PI = 3.14;
    public abstract void calculateArea();
    public void p(){
        System.out.println("Method of Shape");
    }
    public double getArea()
    {
        return this.area;
    }
}

class Rectangle extends Shape implements A{
    double length;
    double breadth;
    Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        this.length=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        this.breadth=sc.nextInt();
    }
    public void p(){
        super.p();
        System.out.println("Inheritance method implement");
    }
    public void calculateArea(){
        this.area = this.length*this.breadth*PI;
    }
}
public class ShapeTest1 {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.calculateArea();
        r.p();
        System.out.println("Area is:"+r.getArea());
    }

}
