package com.sneha.sample;

public class Copyingthearray {
    public static void main(String[] args) {
        int i;
        int[] arr=new int[]{12,23,4,56};
        //int[] copyarr=arr;
        //System.out.println("The copied array is:");
        //for(i=0;i<copyarr.length;i++){
          //  System.out.println(copyarr[i]);
        //}
        int[] copyarr=arr.clone();
        for(i=0;i<copyarr.length;i++){
            System.out.println(copyarr[i]);
        }
    }

}
