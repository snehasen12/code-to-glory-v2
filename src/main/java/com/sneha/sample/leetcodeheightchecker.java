package com.sneha.sample;
import java.util.Arrays;
public class leetcodeheightchecker {
    public static void main(String[] args) {
        int i,count=0;
        int[] height=new int[]{1,1,4,2,1,3};
        for(i=0;i<height.length;i++){
            System.out.println(height[i]);
        }
        int[] arr=height;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("After sorting the array is:");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int[] expected=arr;
        for(i=0;i<expected.length;i++){
            System.out.print(expected[i]);
        }
        if(height!=expected){
                count++;
        }
        System.out.println(count);
    }

}
