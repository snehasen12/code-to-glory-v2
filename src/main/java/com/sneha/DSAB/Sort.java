package com.sneha.DSAB;

public class Sort {
    // Java program to sort an array of 0, 1 and 2

        // Sort the input array, the array is assumed to
        // have values in {0, 1, 2}
        public static void sort012(int a[], int n)
        {
            int i = 0;
            int k = n - 1;
            int j = 0, temp = 0;
            while (j <= k) {
                switch (a[j]) {
                    case 0: {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        //swap(a[i],a[j]);
                        i++;
                        j++;
                        break;
                    }
                    case 1:
                        j++;
                        break;
                    case 2: {
                        temp = a[j];
                        a[j] = a[k];
                        a[k] = temp;
                        //swap(a[j],a[k]);
                        k--;
                        break;
                    }
                }
            }
        }

        /* Utility function to print array arr[] */
        public static void printArray(int arr[], int arr_size)
        {
            int i;
            for (i = 0; i < arr_size; i++)
                System.out.print(arr[i] + " ");
            System.out.println("");
        }

        /*Driver function to check for above functions*/
        public static void main(String[] args)
        {
            int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
            int arr_size = arr.length;
            sort012(arr, arr_size);
            System.out.println("Array after seggregation ");
            printArray(arr, arr_size);
        }
}
    /*This code is contributed by Devesh Agrawal*/


