package com.sneha.SDASirExam;
import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Area s = new Area();
        s.setDim();
        System.out.println("The area of a rectangle is:"+s.getArea());
    }
}

class Area{
    float length,breadth,area;
     void setDim(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle is:");
        this.length = sc.nextFloat();

        System.out.println("Enter the breadth of a rectangle is:");
        this.breadth = sc.nextFloat();
     }

    float getArea(){
        area = this.length * this.breadth;
        return area;
    }
}