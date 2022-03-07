package com.sneha.SDASirExam;
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Shape d = new Shape();
        d.shape();
        d.volume();
        d.surfaceArea();
    }
}
class Shape{
    int w,h,d,v,s;
    void shape(){
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the width of a box:");
        this.w = ss.nextInt();

        System.out.println("Enter the height of a box:");
        this.h = ss.nextInt();

        System.out.println("Enter the depth of a box:");
        this.d = ss.nextInt();

    }
    void volume(){
        this.v = this.w*this.h*this.d;
        System.out.println("The volume of a box is:" + v);
    }
    void surfaceArea(){
        this.s = 2 * (this.w * this.h + this.h * this.d + this.d * this.w);
        System.out.println("The surface area of a box is:" + s);
    }
}
