package com.sneha.SDASirHW;
import java.util.*;
class Power{
        public int pow() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a:");
            double a = sc.nextDouble();

            System.out.println("Enter the value of b:");
            double b = sc.nextDouble();

            int r = (int) (Math.pow(a, b));
            return r;
        }
}

public class TestPower {
    public static void main(String[] args) {
        Power p = new Power();
        System.out.println("The result is:"+p.pow());
    }
}
