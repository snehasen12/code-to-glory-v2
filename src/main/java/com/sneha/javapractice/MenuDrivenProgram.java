package com.sneha.javapractice;

import java.util.*;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        MenuDrivenProgram n = new MenuDrivenProgram();
        n.MenuProgram();
    }

    public void MenuProgram(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user number:");
        int a = sc.nextInt();
        if(a == 1){
            Scanner ss = new Scanner(System.in);
            System.out.println("Enter the marks of a student (out of 100):");
            int num =ss.nextInt();
            if(num >= 90){
                System.out.println("This is Good.");
            }else if(num <= 89){
                System.out.println("This is also Good.");
            }
            else if(num <= 59){
                System.out.println("This is Good as well.");
            }
        }else if(a == 0){
            System.out.println("Stop");
        }
    }
}
