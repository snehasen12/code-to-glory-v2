package com.sneha.javapractice;

public class FinalKeyword {
    final int RollNo =6;
    void roll(){
        int Rollno = 10;
        System.out.println(RollNo);
    }

    public static void main(String[] args) {
        FinalKeyword f = new FinalKeyword();
        f.roll();
        System.out.println(f.RollNo);
    }
}
