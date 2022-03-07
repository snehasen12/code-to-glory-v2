package com.sneha.SDASirHW;

class Complex{
    double real;
    double img;
    void complex(){
        this.real=0;
        this.img=0;
    }
    void complex(double r,double i){
        this.real = r;
        this.img = i;
    }
    void add(Complex c1,Complex c2){
        Complex n = new Complex();
        n.real = c1.real+c2.real;
        n.img=c1.img+c2.img;
    }
    void show(){
        Complex c = new Complex();
        System.out.println(c.real+"i+"+c.img);
    }
}

public class TestComplexNumber {
    public static void main(String[] args) {
        Complex c = new Complex();
        c.complex(2,3);
        Complex c1 = new Complex();
        c1.complex(4,5);
        Complex p = new Complex();
        p.add(c,c1);
        p.show();
    }
}
