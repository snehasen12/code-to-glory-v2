package com.sneha.sample;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int i,count=0;
        int[] arr=heights.clone();
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
