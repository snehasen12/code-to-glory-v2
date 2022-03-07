package com.sneha.CodechefPracticeJava;
import java.util.Scanner;
public class NinjaArrayDiagonal {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);

            int i,j,row,col,sum=0,secondary=0;
            System.out.println("Enter the number of rows:");
            row = sc.nextInt();
            System.out.println("Enter the number of columns:");
            col = sc.nextInt();

            int[][] mat = new int[row][col];

            System.out.println("Enter the elements of the matrix") ;
            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    mat[i][j] = sc.nextInt();
                }
            }

            System.out.println("The elements of the matrix") ;
            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    System.out.print(mat[i][j]+"\t");
                }
                System.out.println("");
            }

            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    if(i==j) //this condition checks for diagonal
                    {
                        sum = sum + mat[i][j];
                    }
                }
            }

            System.out.printf("SUM of PRIMARY DIAGONAL elements of the matrix = "+sum) ;
            System.out.println();
            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    if((i+j) == (row - 1)){
                        secondary += mat[i][j];
                    }
                }
            }
            System.out.printf("SUM of SECONDARY DIAGONAL elements of the matrix = "+secondary) ;
            System.out.println();
            System.out.println("The sum of the total diagonal elements is:"+(sum+secondary));
        }

}

