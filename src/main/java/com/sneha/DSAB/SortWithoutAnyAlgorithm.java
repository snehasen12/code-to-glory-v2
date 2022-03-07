package com.sneha.DSAB;

public class SortWithoutAnyAlgorithm {
    //public void swap(int a,int b){
     //   int temp = a;
      //  a = b;
       // b = temp;
    //}

    public void Sort(int[] a,int n){
        //int n = new Integer(3);
        int i,j,k;
        int temp = 0;
        i = j = 0;
        k = n-1;
        while(j<=k){
            switch(a[j]){
                case 0:
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j++;
                    break;
                case 1:j++;
                       break;
                case 2:
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                    k--;
                    break;
            }
        }
    }

    public void print_Array(int[] arr){
        System.out.println("The sorted array is:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,0,1,0,2,2};
        int n = arr.length;
        SortWithoutAnyAlgorithm m = new SortWithoutAnyAlgorithm();
        //SortWithoutAnyAlgorithm n = new SortWithoutAnyAlgorithm();
        m.Sort(arr,n);
        //System.out.println("after sorting the array ,the output is:");
        m.print_Array(arr);
    }
}
