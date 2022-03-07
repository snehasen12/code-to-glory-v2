package com.sneha.leetcode;
//Space Complexity is O(n)
import java.util.*;
public class CountDistinctElements {

        public void countDistinct(){
            HashSet<Integer> set = new HashSet<>();
            //Scanner ss = new Scanner(System.in);
            //System.out.println("Enter the size of an array:");
            //int size = ss.nextInt();
            int[] arr = new int[5];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array elements:");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                set.add(arr[i]);
                //System.out.println(i);
            }
            System.out.println("The total no of distinct elements are:"+set.size());
        }

        public static void main(String[] args){
            CountDistinctElements n = new CountDistinctElements();
            n.countDistinct();
        }
}
