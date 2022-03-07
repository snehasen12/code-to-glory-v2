package com.sneha.javapractice;

import java.util.*;

public class AdultDetermination {
    public static void main(String args[]){
        AdultDetermination d = new AdultDetermination();
        d.Age();
    }

    public void Age(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of a person:");
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("This person is a Adult.");
        }else{
            System.out.println("This person not belongs to Adult.");
        }
    }
}
