package com.sneha.sample;

public class Arrayspractice {
    public static void main(String args[]){
       int i;
        int[] marks={23,44,56,78,90};
        // displaying the for loop part using length function
        System.out.println("Displaying the elements using for loop");
        for(i=0;i<marks.length;i++){
           System.out.println(marks[i]);
           }
           System.out.println("Displaying the array elements in reverse order.");
           for(i=marks.length-1;i>=0;i--) {
               System.out.println(marks[i]);
           }
           // for(i=0;i<marks.length;i++){
               System.out.println("The length of the array is:");
               System.out.println(marks.length);
           System.out.println("Displaying the elements by for-each loop.");
           for(int element:marks){
               System.out.println(element);
           }
    }
}
