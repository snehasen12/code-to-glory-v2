package com.sneha.sample;

public class Concatenationoftwoarrays {
    public static void main(String[] args) {
        int i,m;
        int[] a={1,2,3};
        int[] b={1,2,3,4};
        m=a.length;
        int[] c=new int[a.length+b.length];
        for(i=0;i<a.length;i++) {
            //System.out.println(nums[i]);
            c[i]=a[i];
        }
        for(i=0;i<b.length;i++) {
            //System.out.println(num[j]);
            c[m+i] =b[i];
        }
        System.out.println("The merged array is:");
        for(i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
