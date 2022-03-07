package com.sneha.DSAB;
import java.util.Arrays;
class QuickSort {
    //public void swap(int a,int b){
     //   int temp = a;
     //   a = b;
     //   b = temp;
    //}

    public int Partition(int arr[],int l,int h){
        //int[] arr = new int[(h-l)+1];

        int pivot = arr[l];
        int i = l;
        int j = h;
        for(i=l;i<h;i++){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = pivot;
        pivot = arr[j];
        arr[j] = temp;
        return j;
    }

    public void Sort(int arr[],int a,int b){
        if(a<b) {
            int pi = Partition(arr,a, b);
            Sort(arr,a, pi-1);
            Sort(arr,pi+1, b);
        }
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {2,7,56,3,25,12};
        int n = arr.length;

        QuickSort d = new QuickSort();
        d.Sort(arr,0,n-1);

        System.out.println("Sorted array is:");
        printArray(arr);
    }
}
