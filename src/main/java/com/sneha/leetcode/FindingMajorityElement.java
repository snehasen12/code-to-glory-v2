package com.sneha.leetcode;
import java.util.*;

public class FindingMajorityElement {
        public void MajorityElement(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();

            int arr[] = new int[size];
            System.out.println("Enter the array elements:");
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("The array elements are:");
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }
            int count = 0;
            for(int i =0 ;i< arr.length;i++)

            if(count > (arr.length/2)){
                System.out.println(count);
            }else{
                System.out.println("No majority element");
            }
        }
        public static void main(String[] args){
            FindingMajorityElement m = new FindingMajorityElement();
            m.MajorityElement();
        }
}
